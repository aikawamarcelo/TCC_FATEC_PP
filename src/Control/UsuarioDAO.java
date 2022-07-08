/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Usuario;
import View.TelaCadastroUsuario;
import static View.TelaCadastroUsuario.CBPerfil;
import View.TelaLogin;
import View.TelaPrincipal;
import java.awt.Color;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.View;

/**
 *
 * @author MARCELO
 */
public class UsuarioDAO {
    
   Usuario u = new Usuario();
    
   public void createUser (Usuario u){
        
        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("insert into usuario(cpf,login,senha,perfil)values (?,?,?,?)");
            stmt.setString(1, u.getCpf());
            stmt.setString(2, u.getLogin());
            stmt.setString(3, u.getSenha());
            stmt.setString(4, u.getPerfil());
           
           
           stmt.executeUpdate();
      
             JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
            
            
            
            
        } catch (com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException e) {
            JOptionPane.showMessageDialog(null," CPF já cadastrado, tente outro!");
        }
        
        catch (Exception e2) {
            JOptionPane.showMessageDialog(null,"O(s) campo(s) de texto chegaram ao limite!");
        }
      
      
        finally{
            Conexao.closeConnection(con,stmt);
        }
            }
   
   public boolean checklogin(String login, String senha){
 TelaLogin tlo = new TelaLogin();
       Connection con = Conexao.getConnection();
       PreparedStatement stmt = null;
       ResultSet rs = null;
       boolean check = false;
       try {
             
           stmt = con.prepareStatement("SELECT * FROM usuario where login=? and senha=? ");
           stmt.setString(1, login);
           stmt.setString(2,senha);
        
           rs= stmt.executeQuery();
           if(rs.next()){
                  TelaPrincipal tl = new TelaPrincipal();
                   TelaCadastroUsuario tcu = new TelaCadastroUsuario();
                  
                   String perfil = rs.getString(4);
                    
             
             if(perfil.equals("Administrador")){
                   
                       tl.setVisible(true);
                      TelaPrincipal.Menuusu.setEnabled(true);
                      TelaPrincipal.jMenu2.setEnabled(true);
                      TelaPrincipal.jMenu3.setEnabled(true);
                      TelaPrincipal.jMenu6.setEnabled(true);
                      TelaPrincipal.jMenu5.setEnabled(true);
                      TelaPrincipal.jMenu11.setEnabled(true);
                       TelaPrincipal.Psicólogo.setText(rs.getString(2));
                         
                 tlo.dispose();
             }
               else{
                     tl.setVisible(true);
                     TelaPrincipal.Psicólogo.setText(rs.getString(2));   
                     tlo.dispose();
               }
               
             check=true;
             
           }
           
           
       } catch (SQLException ex) {
           Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
     
       finally{
           
           Conexao.closeConnection(con,stmt,rs);           
       }
       
       return check;
       
   }

   
    
   
   
   public List<Usuario> read (){
       
       
        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Usuario> usuarios = new ArrayList<>();
        try{
           
            stmt = con.prepareStatement( "select* from usuario" );
            rs = stmt.executeQuery();
            while(rs.next()){
                 
                Usuario usuario = new Usuario();
                usuario.setCpf(rs.getString("cpf"));
                usuario.setLogin(rs.getString("login"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setPerfil(rs.getString("perfil"));
                usuarios.add(usuario);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            
            Conexao.closeConnection(con, stmt, rs);
            
        }
          return usuarios;
    }
    
        public void delete(Usuario u){
        
        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        try{
            
            stmt = con.prepareStatement("delete from usuario where cpf = ? ");
            
        stmt.setString(1, u.getCpf());
            
               
               stmt.executeUpdate();
            
              JOptionPane.showMessageDialog(null, "Usuário excluído com sucesso! ");
            
        }
        catch(SQLException ex){
           
             JOptionPane.showMessageDialog(null,"Erro ao Excluir: " + ex);
        }
        finally{
            Conexao.closeConnection(con, stmt); 
        }
    }
     public List<Usuario> readForDesc(String desc) {

        Connection con = Conexao.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Usuario> usuarios = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM usuario WHERE login LIKE ?");
            stmt.setString(1, "%"+desc+"%");
            
            rs = stmt.executeQuery();

            while (rs.next()) {

                Usuario u = new Usuario();

                u.setCpf(rs.getString("cpf"));
                u.setLogin(rs.getString("login"));
                u.setSenha(rs.getString("senha"));
                u.setPerfil(rs.getString("perfil"));
              
                usuarios.add(u);
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conexao.closeConnection(con, stmt, rs);
        }
     
     
         return usuarios;



     }
         public void update(Usuario u){
    
        Connection con = Conexao.getConnection();
        
        PreparedStatement stmt = null;
        
        try{
            
            stmt = con.prepareStatement("UPDATE usuario SET login = ?,senha = ?,perfil=? WHERE cpf = ?");
            stmt.setString(1, u.getLogin());
            stmt.setString(2, u.getSenha());
            stmt.setString(3, u.getPerfil());
            stmt.setString(4, u.getCpf());
          
            
               
                stmt.executeUpdate();
           
             JOptionPane.showMessageDialog(null, "Usuário alterado com sucesso!");
            
            
            
             
            
        }
        catch (com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException e) {
            JOptionPane.showMessageDialog(null," CPF já cadastrado, tente outro!");
        }
        
        catch (Exception e2) {
            JOptionPane.showMessageDialog(null,"O(s) campo(s) de texto chegaram ao limite!");
        }
        finally{
            Conexao.closeConnection(con, stmt);
        }
}
        

    }
   

