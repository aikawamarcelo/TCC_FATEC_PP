/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Control.Conexao;
import Control.UsuarioDAO;
import Model.Usuario;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.sql.*;
import java.text.DateFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.jfree.data.time.Hour;

/**
 *
 * @author MARCELO
 */
public class TelaPrincipal extends javax.swing.JFrame {

    Connection conexao = null;

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {

        initComponents();
        ImageIcon icon = new ImageIcon(getClass().getResource("/Imagens/Emblema_Psicologia.png"));
        setIconImage(icon.getImage());
        conexao = Conexao.getConnection();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Psicólogo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Menuusu = new javax.swing.JMenu();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu11 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Principal");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("AMA CONSULT");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText(" SISTEMA DE GERENCIAMENTO ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setText("PARA PSICÓLOGOS");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Emblema_Psicologia.png"))); // NOI18N

        Psicólogo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Psicólogo.setText("Usuário");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Data");

        Menuusu.setText("Usuários");
        Menuusu.setEnabled(false);
        Menuusu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuusuActionPerformed(evt);
            }
        });

        jMenuItem15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Usuários.png"))); // NOI18N
        jMenuItem15.setText("Gerenciar Usuários");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        Menuusu.add(jMenuItem15);

        jMenuBar1.add(Menuusu);

        jMenu2.setText("Psicólogos");
        jMenu2.setEnabled(false);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Usuários.png"))); // NOI18N
        jMenuItem2.setText("Gerenciar Psicólogos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Pacientes");
        jMenu3.setEnabled(false);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Usuários.png"))); // NOI18N
        jMenuItem3.setText("Gerenciar Pacientes");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        jMenu5.setText("Consultas");

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Agendamento.png"))); // NOI18N
        jMenuItem4.setText("Agendar Consulta");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem4);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Recebimento.png"))); // NOI18N
        jMenuItem5.setText("Receber Consulta");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem5);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Gerenciamento de Consulta.png"))); // NOI18N
        jMenuItem6.setText("Gerenciar Consulta");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem6);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Contas à Pagar/Pagas ");
        jMenu6.setEnabled(false);

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Contas Pagar.png"))); // NOI18N
        jMenuItem7.setText("Gerenciar Contas a Pagar/Pagas");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem7);

        jMenuBar1.add(jMenu6);

        jMenu7.setText("Relatórios");

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Relatório.png"))); // NOI18N
        jMenu8.setText("Relatório de Psicólogos");

        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Usuários.png"))); // NOI18N
        jMenuItem9.setText("Gerenciar Relatório de Psicólogos");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem9);

        jMenu7.add(jMenu8);

        jMenu9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Relatório.png"))); // NOI18N
        jMenu9.setText("Relatório de Pacientes");

        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Usuários.png"))); // NOI18N
        jMenuItem10.setText("Gerenciar Relatório de Pacientes");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem10);

        jMenu7.add(jMenu9);

        jMenu10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Relatório.png"))); // NOI18N
        jMenu10.setText("Relatório de Consultas");

        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Gerenciamento de Consulta.png"))); // NOI18N
        jMenuItem11.setText("Gerenciar Relatório de Consultas");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem11);

        jMenu7.add(jMenu10);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Relatório.png"))); // NOI18N
        jMenu4.setText("Relatório de Contas à Receber/Recebidas");

        jMenuItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Recebimento.png"))); // NOI18N
        jMenuItem12.setText("Gerenciar Relatório de Contas a Receber/Recebidas");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem12);

        jMenu7.add(jMenu4);

        jMenu11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Relatório.png"))); // NOI18N
        jMenu11.setText("Relatório de Contas a Pagar/Pagas");
        jMenu11.setEnabled(false);

        jMenuItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Contas Pagar.png"))); // NOI18N
        jMenuItem13.setText("Gerenciar Relatório de Contas a Pagar/Pagas");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem13);

        jMenu7.add(jMenu11);

        jMenuBar1.add(jMenu7);

        jMenu1.setText("Ajuda");

        jMenuItem14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/livro manual.jpg"))); // NOI18N
        jMenuItem14.setText("Manual do Usuário");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem14);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 287, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Psicólogo)
                    .addComponent(jLabel5))
                .addGap(183, 183, 183))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(jLabel3))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Psicólogo)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel5)))
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addGap(39, 39, 39)
                .addComponent(jLabel3)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1071, 646));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        AgendarConsulta ac = new AgendarConsulta();
        ac.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed

        TelaCadastroUsuario tu = new TelaCadastroUsuario();

        tu.setVisible(true);

    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        TelaCadastroPsicologo tp = new TelaCadastroPsicologo();
        tp.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        TelaCadastroPaciente tp = new TelaCadastroPaciente();
        tp.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        CadastroContasPagar cp = new CadastroContasPagar();
        cp.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        TelaContasReceber cr = new TelaContasReceber();
        cr.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        TeladeConsulta c = new TeladeConsulta();
        c.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        RelatorioContasPagar ecp = new RelatorioContasPagar();
        ecp.setVisible(true);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        RelatorioPsicologos rp = new RelatorioPsicologos();
        rp.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        RelatorioPacientes rp = new RelatorioPacientes();
        rp.setVisible(true);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        ConsultaRelatorio cr = new ConsultaRelatorio();
        cr.setVisible(true);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        RelatorioContasReceber rcb = new RelatorioContasReceber();
        rcb.setVisible(true);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void MenuusuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuusuActionPerformed


    }//GEN-LAST:event_MenuusuActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
             try{
     
     Desktop.getDesktop().open(new File("C:\\Users\\MARCELO\\Documents\\AMAConsult\\MANUAL DO SISTEMA.pdf"));
         
     }  catch (IOException ex) {
       
           JOptionPane.showMessageDialog(null, "Ajuda não encontrada." );
         
     }
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        java.util.Date data = new java.util.Date();
     
       DateFormat formatador = DateFormat.getDateInstance(DateFormat.SHORT);
      jLabel5.setText(formatador.format(data));
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JMenu Menuusu;
    public static javax.swing.JLabel Psicólogo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    public static javax.swing.JMenu jMenu11;
    public static javax.swing.JMenu jMenu2;
    public static javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    public static javax.swing.JMenu jMenu5;
    public static javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    public static javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
}