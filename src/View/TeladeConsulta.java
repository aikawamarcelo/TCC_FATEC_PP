/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Control.ConsultaDAO;
import Control.ContasReceberDAO;
import Control.PacienteDAO;
import Control.PsicologoDAO;
import Model.Consulta;
import Model.ContasReceber;
import Model.Paciente;
import Model.Psicologo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


/**
 *
 * @author MARCELO
 */
public class TeladeConsulta extends javax.swing.JFrame {

    /**
     * Creates new form Consulta
     */
    public TeladeConsulta() {
        initComponents();
         ImageIcon icon = new ImageIcon(getClass().getResource("/Imagens/Emblema_Psicologia.png"));
        setIconImage(icon.getImage());
  DefaultTableModel modelo = (DefaultTableModel) TABRegistro.getModel();
         TABRegistro.setRowSorter(new TableRowSorter(modelo));

        readJTable();        
        
   
           

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     * @param desc
     */
    
     public void readJTableForDesc(String desc) {
        
        DefaultTableModel modelo = (DefaultTableModel) TABRegistro.getModel();
        modelo.setNumRows(0);
        ConsultaDAO cdao = new ConsultaDAO();
        Psicologo psicologo = new Psicologo();
        Paciente paciente = new Paciente();
        for (Consulta c : cdao.readForDesc(desc)) {

            
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
 
     
     
    
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane7 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        TBObservacoes = new javax.swing.JTextArea();
        TBBuscar = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        TBCausas = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        TBNumeroPsi = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TBHorario = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        TBNomePa = new javax.swing.JTextField();
        TBDataConsulta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TABRegistro = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        BBuscar = new javax.swing.JButton();
        TBNomePsi = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TBSintomas = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TBNumeroPa = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consultas");
        setResizable(false);
        setSize(new java.awt.Dimension(823, 566));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        TBObservacoes.setColumns(20);
        TBObservacoes.setRows(5);
        TBObservacoes.setText("Digite aqui");
        TBObservacoes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TBObservacoesKeyTyped(evt);
            }
        });
        jScrollPane3.setViewportView(TBObservacoes);

        TBCausas.setColumns(20);
        TBCausas.setRows(5);
        TBCausas.setText("Digite aqui");
        TBCausas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TBCausasKeyTyped(evt);
            }
        });
        jScrollPane6.setViewportView(TBCausas);

        jLabel8.setText("N?? Paciente");

        TBNumeroPsi.setEnabled(false);
        TBNumeroPsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBNumeroPsiActionPerformed(evt);
            }
        });

        jLabel10.setText("Paciente");

        jLabel5.setText("Psic??logo");

        TBHorario.setEnabled(false);

        jLabel11.setText("Campos Obrigat??rios *");

        jLabel2.setText("Data da Consulta");

        jLabel9.setText(" N?? Psic??logo");

        jLabel1.setText("* Sintomas");

        TBNomePa.setEnabled(false);
        TBNomePa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBNomePaActionPerformed(evt);
            }
        });

        TBDataConsulta.setEnabled(false);

        jLabel4.setText("* Causas");

        TABRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "N?? Consulta", "N?? Psic??logo", "Psic??logo", "N?? Paciente", "Paciente", "Data da Consulta", "Hor??rio", "Causas", "Sintomas", "Observa????es"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TABRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TABRegistroMouseClicked(evt);
            }
        });
        TABRegistro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TABRegistroKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(TABRegistro);

        jLabel7.setText("Busca pelo nome do paciente");

        BBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Pesquisar2.png"))); // NOI18N
        BBuscar.setBorderPainted(false);
        BBuscar.setContentAreaFilled(false);
        BBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBuscarActionPerformed(evt);
            }
        });

        TBNomePsi.setEnabled(false);
        TBNomePsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBNomePsiActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Alterar.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        TBSintomas.setColumns(20);
        TBSintomas.setRows(5);
        TBSintomas.setText("Digite aqui");
        TBSintomas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TBSintomasKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(TBSintomas);

        jLabel6.setText("* Observa????es");

        jLabel3.setText("Hor??rio");

        TBNumeroPa.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(508, 508, 508)
                                .addComponent(jLabel11))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1218, 1218, 1218)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1209, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(131, 131, 131))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel5)
                                    .addComponent(TBNumeroPsi, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TBNomePsi, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(63, 63, 63)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(TBNomePa, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TBNumeroPa, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8))
                                        .addGap(100, 100, 100)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(TBHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel7)
                                                .addComponent(TBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(69, 69, 69)
                                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(66, 66, 66)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(TBDataConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(312, 312, 312))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(BBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(249, 249, 249))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TBNumeroPsi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TBNumeroPa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TBHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(TBDataConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel10))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TBNomePsi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TBNomePa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(88, 88, 88)
                                .addComponent(jLabel1)
                                .addGap(109, 109, 109)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(BBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(TBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 52, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(15, 15, 15)))))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );

        jScrollPane7.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 1396, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 1058, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(1418, 1114));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     *
     */
    public void readJTable() {
   
        DefaultTableModel modelo = (DefaultTableModel) TABRegistro.getModel();
        modelo.setNumRows(0);
       
        ConsultaDAO cdao = new ConsultaDAO();
       
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
  
  
  
       
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       readJTable();
      
    }//GEN-LAST:event_formWindowActivated

    private void BBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBuscarActionPerformed
        readJTableForDesc(TBBuscar.getText());

    }//GEN-LAST:event_BBuscarActionPerformed

    private void TBNomePaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBNomePaActionPerformed

    }//GEN-LAST:event_TBNomePaActionPerformed

    private void TBNomePsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBNomePsiActionPerformed

    }//GEN-LAST:event_TBNomePsiActionPerformed

    private void TABRegistroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TABRegistroKeyReleased
        if(TABRegistro.getSelectedRow() !=-1){

            TBNumeroPsi.setText(TABRegistro.getValueAt(TABRegistro.getSelectedRow(),1).toString());
            TBNomePsi.setText(TABRegistro.getValueAt(TABRegistro.getSelectedRow(),2).toString());
            TBNumeroPa.setText(TABRegistro.getValueAt(TABRegistro.getSelectedRow(),3).toString());
            TBNomePa.setText(TABRegistro.getValueAt(TABRegistro.getSelectedRow(),4).toString());
            TBDataConsulta.setText(TABRegistro.getValueAt(TABRegistro.getSelectedRow(),5).toString());
            TBHorario.setText(TABRegistro.getValueAt(TABRegistro.getSelectedRow(),6).toString());
            TBCausas.setText(TABRegistro.getValueAt(TABRegistro.getSelectedRow(),7).toString());
            TBSintomas.setText(TABRegistro.getValueAt(TABRegistro.getSelectedRow(),8).toString());
            TBObservacoes.setText(TABRegistro.getValueAt(TABRegistro.getSelectedRow(),9).toString());

        }
    }//GEN-LAST:event_TABRegistroKeyReleased

    private void TABRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TABRegistroMouseClicked
        if(TABRegistro.getSelectedRow() !=-1){

            TBNumeroPsi.setText(TABRegistro.getValueAt(TABRegistro.getSelectedRow(),1).toString());
            TBNomePsi.setText(TABRegistro.getValueAt(TABRegistro.getSelectedRow(),2).toString());
            TBNumeroPa.setText(TABRegistro.getValueAt(TABRegistro.getSelectedRow(),3).toString());
            TBNomePa.setText(TABRegistro.getValueAt(TABRegistro.getSelectedRow(),4).toString());
            TBDataConsulta.setText(TABRegistro.getValueAt(TABRegistro.getSelectedRow(),5).toString());
            TBHorario.setText(TABRegistro.getValueAt(TABRegistro.getSelectedRow(),6).toString());
            TBCausas.setText(TABRegistro.getValueAt(TABRegistro.getSelectedRow(),7).toString());
            TBSintomas.setText(TABRegistro.getValueAt(TABRegistro.getSelectedRow(),8).toString());
            TBObservacoes.setText(TABRegistro.getValueAt(TABRegistro.getSelectedRow(),9).toString());
        }
    }//GEN-LAST:event_TABRegistroMouseClicked

    private void TBNumeroPsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBNumeroPsiActionPerformed

    }//GEN-LAST:event_TBNumeroPsiActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      if (TABRegistro.getSelectedRow() != - 1) {
             int confirma = JOptionPane.showConfirmDialog(null,"Confirma a altera????o desta Consulta? ","Aten????o",JOptionPane.YES_NO_OPTION);
        if (confirma== JOptionPane.YES_OPTION){
         
       //else{
          PacienteDAO pacientedao = new PacienteDAO();
          PsicologoDAO psicologodao = new PsicologoDAO();
         Consulta c = new Consulta();
         ConsultaDAO cdao = new ConsultaDAO();
        Paciente paciente = new Paciente();
         Psicologo psicologo = new Psicologo();
          paciente.setCpf((TBNumeroPa.getText()));
        c.setPaciente(paciente);
        c.setNome_paciente(TBNomePa.getText());
        c.setNome_psicologo(TBNomePsi.getText());
        psicologo.setCpf((TBNumeroPsi.getText()));
        c.setPsicologo(psicologo);
          c.setCausas(TBCausas.getText());
          c.setSintomas(TBSintomas.getText());
          c.setObservacoes(TBObservacoes.getText());
          c.setHora(TBHorario.getText());
          c.setData(TBDataConsulta.getText());
         c.setNumero((int)TABRegistro.getValueAt(TABRegistro.getSelectedRow(), 0));
        cdao.update(c);
        TBNomePa.setText("");
        TBNomePsi.setText("");
        TBNumeroPa.setText("");
        TBNumeroPsi.setText("");
        TBHorario.setText("");
        TBCausas.setText("Digite");
        TBSintomas.setText("Digite");
        TBObservacoes.setText("Digite");
        readJTable();
            
        // }
            
                   
        }
        else{
              }
        }
         else {
            JOptionPane.showMessageDialog(null, "Selecione uma consulta para alterar");
        
        }
      
     

    }//GEN-LAST:event_jButton1ActionPerformed

    private void TBObservacoesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TBObservacoesKeyTyped
      if (TBObservacoes.getText().length()>=1782){
      
          evt.consume();
          
      }
    }//GEN-LAST:event_TBObservacoesKeyTyped

    private void TBSintomasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TBSintomasKeyTyped
        if(TBSintomas.getText().length()>=274){
            
            evt.consume();
            
        }
    }//GEN-LAST:event_TBSintomasKeyTyped

    private void TBCausasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TBCausasKeyTyped
          if(TBCausas.getText().length()>=274){
            
            evt.consume();
            
        }
    }//GEN-LAST:event_TBCausasKeyTyped

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
            java.util.logging.Logger.getLogger(TeladeConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeladeConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeladeConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeladeConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeladeConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BBuscar;
    private javax.swing.JTable TABRegistro;
    private javax.swing.JTextField TBBuscar;
    private javax.swing.JTextArea TBCausas;
    private javax.swing.JTextField TBDataConsulta;
    private javax.swing.JTextField TBHorario;
    private javax.swing.JTextField TBNomePa;
    private javax.swing.JTextField TBNomePsi;
    private javax.swing.JTextField TBNumeroPa;
    private javax.swing.JTextField TBNumeroPsi;
    private javax.swing.JTextArea TBObservacoes;
    private javax.swing.JTextArea TBSintomas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    // End of variables declaration//GEN-END:variables
}
