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
public class ConsultaRelatorio extends javax.swing.JFrame {

    /**
     * Creates new form Consulta
     */
    public ConsultaRelatorio() {
        initComponents();
        ImageIcon icon = new ImageIcon(getClass().getResource("/Imagens/Emblema_Psicologia.png"));
        setIconImage(icon.getImage()); 
  DefaultTableModel modelo = (DefaultTableModel) TABConsulta.getModel();
         TABConsulta.setRowSorter(new TableRowSorter(modelo));

        readJTable();        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane5 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        TBNumeroPa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TBSintomas = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        TBNumeroPsi = new javax.swing.JTextField();
        TBDataConsulta = new javax.swing.JTextField();
        TBHorario = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        TBObservacoes = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        TBCausas = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        TABConsulta = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        TBNomePsi = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        TBNomePa = new javax.swing.JTextField();
        BEmitir = new javax.swing.JButton();
        TBEmitir = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relatório de Consultas");
        setFocusable(false);
        setResizable(false);
        setSize(new java.awt.Dimension(823, 566));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel8.setText("Nº Paciente");

        TBNumeroPa.setEnabled(false);

        jLabel2.setText("Data da Consulta");

        jLabel3.setText("Horário");

        jLabel4.setText("Causas");

        TBSintomas.setColumns(20);
        TBSintomas.setRows(5);
        jScrollPane2.setViewportView(TBSintomas);

        jLabel9.setText("Nº Psicólogo");

        TBNumeroPsi.setEnabled(false);

        TBDataConsulta.setEnabled(false);

        TBHorario.setEnabled(false);

        TBObservacoes.setColumns(20);
        TBObservacoes.setRows(5);
        jScrollPane3.setViewportView(TBObservacoes);

        jLabel6.setText("Observações");

        jLabel1.setText("Sintomas");

        TBCausas.setColumns(20);
        TBCausas.setRows(5);
        jScrollPane6.setViewportView(TBCausas);

        TABConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nº Consulta", "Nº Psicólogo", "Psicólogo", "Nº Paciente", "Paciente", "Data da Consulta", "Horário", "Causas", "Sintomas", "Observações"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TABConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TABConsultaMouseClicked(evt);
            }
        });
        TABConsulta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TABConsultaKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(TABConsulta);

        jLabel5.setText("Psicólogo");

        TBNomePsi.setEnabled(false);

        jLabel10.setText("Paciente");

        TBNomePa.setEnabled(false);

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

        jLabel7.setText("Dados da Consulta");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(TBEmitir, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(BEmitir, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(413, 413, 413)))))
                .addGap(0, 312, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TBNumeroPsi, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel5))
                                        .addGap(114, 114, 114)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(TBNumeroPa, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel10)))
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(240, 240, 240)
                                        .addComponent(jLabel3))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(174, 174, 174)
                                        .addComponent(TBDataConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(207, 207, 207)
                                        .addComponent(jLabel2))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(TBNomePsi, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(86, 86, 86)
                                        .addComponent(TBNomePa, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(198, 198, 198)
                                        .addComponent(jLabel4)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(192, 192, 192)
                                        .addComponent(TBHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(175, 175, 175)
                                        .addComponent(jLabel1))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(583, 583, 583)
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel7)
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel2))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TBNumeroPsi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TBNumeroPa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TBDataConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 22, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TBNomePa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TBNomePsi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TBHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(BEmitir, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(151, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TBEmitir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(209, 209, 209))))
        );

        jScrollPane5.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 1271, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 1282, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
  public void readJTable() {
   
        DefaultTableModel modelo = (DefaultTableModel) TABConsulta.getModel();
        modelo.setNumRows(0);
       
        ConsultaDAO cdao = new ConsultaDAO();
        PsicologoDAO pdao = new PsicologoDAO();
        Paciente paciente =new Paciente();
        Psicologo psicologo = new Psicologo();
         for (Consulta c : cdao.read()) {

            modelo.addRow(new Object[]{
                c.getNumero(),
                c.getPsicologo().getCpf(),
                c.getNome_psicologo(),
                c.getPaciente().getCpf(),
                c.getNome_paciente(),
                c.getData(),
                c.getHora(),
                c.getCausas(),
                c.getSintomas(),
                c.getObservacoes()             
            });

        }

    }
  
  private void emitirRelatorioConsulta(){
    
            int confirma = JOptionPane.showConfirmDialog(null,"Confirma a emissão deste Relatório? ","Atenção",JOptionPane.YES_NO_OPTION);
      if(confirma== JOptionPane.YES_OPTION){
          try{
               if(TBEmitir.getText().isEmpty()){
                  
                  JOptionPane.showMessageDialog(null," Insira um número da consulta gerenciada de um Paciente para a emissão do Relatório ");
                  
              }
               else{
              HashMap filtro = new HashMap();
              filtro.put("numero",Integer.parseInt(TBEmitir.getText()));
              JasperPrint print =JasperFillManager.fillReport("C://Users//MARCELO//Documents//AMAConsult//relatórios//Consultas//Consulta.jasper",filtro,Conexao.getConnection());
               TBEmitir.setText("");
              JasperViewer.viewReport(print,false);
             
               }
                 
          }catch(Exception e){
              
              JOptionPane.showMessageDialog(null,"Insira um número de uma consulta válido! ");
                TBEmitir.setText("");
          }
          
    }
      else{
          
            TBEmitir.setText("");
          
      }
    
}
  
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       readJTable();
    }//GEN-LAST:event_formWindowActivated

    private void TABConsultaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TABConsultaKeyReleased
       if(TABConsulta.getSelectedRow() !=-1){
           
            TBEmitir.setText(TABConsulta.getValueAt(TABConsulta.getSelectedRow(),0).toString());
             TBNumeroPsi.setText(TABConsulta.getValueAt(TABConsulta.getSelectedRow(),1).toString());
            TBNomePsi.setText(TABConsulta.getValueAt(TABConsulta.getSelectedRow(),2).toString());
            TBNumeroPa.setText(TABConsulta.getValueAt(TABConsulta.getSelectedRow(),3).toString());
            TBNomePa.setText(TABConsulta.getValueAt(TABConsulta.getSelectedRow(),4).toString()); 
           TBDataConsulta.setText(TABConsulta.getValueAt(TABConsulta.getSelectedRow(),5).toString());
            TBHorario.setText(TABConsulta.getValueAt(TABConsulta.getSelectedRow(),6).toString());
            TBCausas.setText(TABConsulta.getValueAt(TABConsulta.getSelectedRow(),7).toString());
           TBSintomas.setText(TABConsulta.getValueAt(TABConsulta.getSelectedRow(),8).toString());
           TBObservacoes.setText(TABConsulta.getValueAt(TABConsulta.getSelectedRow(),9).toString());
    }
    }//GEN-LAST:event_TABConsultaKeyReleased

    private void TABConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TABConsultaMouseClicked
        if(TABConsulta.getSelectedRow() !=-1){
           
           TBEmitir.setText(TABConsulta.getValueAt(TABConsulta.getSelectedRow(),0).toString());
           TBNumeroPsi.setText(TABConsulta.getValueAt(TABConsulta.getSelectedRow(),1).toString());
            TBNomePsi.setText(TABConsulta.getValueAt(TABConsulta.getSelectedRow(),2).toString());
            TBNumeroPa.setText(TABConsulta.getValueAt(TABConsulta.getSelectedRow(),3).toString());
            TBNomePa.setText(TABConsulta.getValueAt(TABConsulta.getSelectedRow(),4).toString()); 
           TBDataConsulta.setText(TABConsulta.getValueAt(TABConsulta.getSelectedRow(),5).toString());
            TBHorario.setText(TABConsulta.getValueAt(TABConsulta.getSelectedRow(),6).toString());
            TBCausas.setText(TABConsulta.getValueAt(TABConsulta.getSelectedRow(),7).toString());
           TBSintomas.setText(TABConsulta.getValueAt(TABConsulta.getSelectedRow(),8).toString());
           TBObservacoes.setText(TABConsulta.getValueAt(TABConsulta.getSelectedRow(),9).toString()); 
         
    }
    }//GEN-LAST:event_TABConsultaMouseClicked

    private void BEmitirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEmitirActionPerformed
        emitirRelatorioConsulta();
    }//GEN-LAST:event_BEmitirActionPerformed

    private void TBEmitirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBEmitirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TBEmitirActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultaRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new ConsultaRelatorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BEmitir;
    private javax.swing.JTable TABConsulta;
    private javax.swing.JTextArea TBCausas;
    private javax.swing.JTextField TBDataConsulta;
    private javax.swing.JTextField TBEmitir;
    private javax.swing.JTextField TBHorario;
    private javax.swing.JTextField TBNomePa;
    private javax.swing.JTextField TBNomePsi;
    private javax.swing.JTextField TBNumeroPa;
    private javax.swing.JTextField TBNumeroPsi;
    private javax.swing.JTextArea TBObservacoes;
    private javax.swing.JTextArea TBSintomas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    // End of variables declaration//GEN-END:variables
}