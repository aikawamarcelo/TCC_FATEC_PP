/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Control.Conexao;
import Control.ConsultaDAO;
import Control.ContasReceberDAO;
import Control.PacienteDAO;
import Control.PsicologoDAO;
import Model.Consulta;
import Model.ContasReceber;
import Model.Paciente;
import Model.Psicologo;
import java.util.HashMap;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author MARCELO
 */
public class RelatorioContasReceber extends javax.swing.JFrame {

    /**
     * Creates new form CadastroContasReceber
     */
    public RelatorioContasReceber() {
        initComponents();
         ImageIcon icon = new ImageIcon(getClass().getResource("/Imagens/Emblema_Psicologia.png"));
        setIconImage(icon.getImage());
          DefaultTableModel modelo = (DefaultTableModel) TABContasReceber.getModel();
          TABContasReceber.setRowSorter(new TableRowSorter(modelo));

        readJTable(); 
        
    }
 public void readJTable() {
   
        DefaultTableModel modelo = (DefaultTableModel) TABContasReceber.getModel();
        modelo.setNumRows(0);
       
        Consulta consulta = new Consulta();
     
        ContasReceberDAO rcdao = new ContasReceberDAO();
        for (ContasReceber cr : rcdao.read()) {

            modelo.addRow(new Object[]{
                
                cr.getConsulta().getNumero(),
                cr.getData_lancamento(),
                cr.getData_recebimento(),
                cr.getValor_a_receber(),
                cr.getTipo(),
                cr.getStatus(), 
               
            });

        }

    }
  public void readJTableForDesc(String desc) {
        
        DefaultTableModel modelo = (DefaultTableModel) TABContasReceber.getModel();
        modelo.setNumRows(0);
        ContasReceberDAO crdao = new ContasReceberDAO();

        for (ContasReceber cr : crdao.readForDesc(desc)) {

            
            modelo.addRow(new Object[]{
                cr.getConsulta().getNumero(),
                cr.getData_lancamento(),
                cr.getData_recebimento(),
                cr.getValor_a_receber(),
                cr.getTipo(),
                cr.getStatus(),  
            });

        }

    }
   private void emitirRelatorioContasReceber(){
    
            int confirma = JOptionPane.showConfirmDialog(null,"Confirma a emiss??o deste Relat??rio? ","Aten????o",JOptionPane.YES_NO_OPTION);
      if(confirma== JOptionPane.YES_OPTION){
          try{
               if(TBEmitir.getText().isEmpty()){
                  
                  JOptionPane.showMessageDialog(null," Insira um n??mero de consulta agendada de um paciente para a emiss??o do Relat??rio ");
                  
              }
               else{
              HashMap filtro = new HashMap();
              filtro.put("consulta_numero",Integer.parseInt(TBEmitir.getText()));
              JasperPrint print =JasperFillManager.fillReport("C://Users//MARCELO//Documents//AMAConsult//relat??rios//Contas a Receber ou Recebidas//Contas a Receber ou Recebidas.jasper",filtro,Conexao.getConnection());
              TBEmitir.setText("");
              JasperViewer.viewReport(print,false);
             
               }
          }catch(Exception e){
              
              JOptionPane.showMessageDialog(null,"Insira um n??mero de contas v??lido! ");
              TBEmitir.setText("");
          }
          
      }
      else{
          
          TBEmitir.setText("");
          
      }
    
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TABContasReceber = new javax.swing.JTable();
        BEmitir = new javax.swing.JButton();
        TBEmitir = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relat??rio de Contas a Receber/Recebidas");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        TABContasReceber.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "N?? Consulta", "Valor a Receber", "Data de Lan??amento", "Data de Recebimento", "Forma de Pagamento", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TABContasReceber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TABContasReceberMouseClicked(evt);
            }
        });
        TABContasReceber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TABContasReceberKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(TABContasReceber);

        BEmitir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Imprimirv2.jpg"))); // NOI18N
        BEmitir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEmitirActionPerformed(evt);
            }
        });

        TBEmitir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBEmitirActionPerformed(evt);
            }
        });

        jLabel1.setText("Dados de Contas a Receber");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 980, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TBEmitir, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(BEmitir, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(359, 359, 359))
            .addGroup(layout.createSequentialGroup()
                .addGap(372, 372, 372)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(TBEmitir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(BEmitir, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(169, Short.MAX_VALUE))
        );

        setBounds(0, 0, 1002, 767);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
     readJTable();
    }//GEN-LAST:event_formWindowActivated

    private void BEmitirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEmitirActionPerformed
         emitirRelatorioContasReceber();
    }//GEN-LAST:event_BEmitirActionPerformed

    private void TBEmitirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBEmitirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TBEmitirActionPerformed

    private void TABContasReceberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TABContasReceberMouseClicked
          
        if(TABContasReceber.getSelectedRow() !=-1){
            TBEmitir.setText(TABContasReceber.getValueAt(TABContasReceber.getSelectedRow(),0).toString());
          
        }
    }//GEN-LAST:event_TABContasReceberMouseClicked

    private void TABContasReceberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TABContasReceberKeyReleased
           
        if(TABContasReceber.getSelectedRow() !=-1){
            TBEmitir.setText(TABContasReceber.getValueAt(TABContasReceber.getSelectedRow(),0).toString());
          
        }
    }//GEN-LAST:event_TABContasReceberKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RelatorioContasReceber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RelatorioContasReceber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RelatorioContasReceber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RelatorioContasReceber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RelatorioContasReceber().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BEmitir;
    private javax.swing.JTable TABContasReceber;
    private javax.swing.JTextField TBEmitir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
