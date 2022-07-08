/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.ContasPagar;
import Model.Paciente;
import Model.Psicologo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author MARCELO
 */
public class PsicologoDAO {
   
    
    public boolean createPsicologo(Psicologo p){
        
        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("insert into psicologo(cpf,email,nome,telefone,sexo,estado_civil,data_nascimento,cep,rua,numero_endereco,estado,bairro,cidade)values (?,?,?,?,?,?,?,?,?,?,?,?,?)");
        
            stmt.setString(1, p.getCpf());
            stmt.setString(2, p.getEmail());
            stmt.setString(3, p.getNome());
            stmt.setString(4, p.getTelefone());
            stmt.setString(5, p.getSexo());
            stmt.setString(6, p.getEstado_civil());
            stmt.setString(7, p.getData_nascimento());
            stmt.setString(8, p.getCep());
            stmt.setString(9, p.getRua());
            stmt.setInt(10,p.getNumero_endereco());
            stmt.setString(11, p.getEstado());
            stmt.setString(12, p.getBairro());
            stmt.setString(13, p.getCidade());
           
           int adicionado=stmt.executeUpdate();
           
           if(adicionado>0){
               
                 JOptionPane.showMessageDialog(null, "Psicólogo cadastrado com sucesso!");
               
           }
        
            return true;
          
        }
        
           catch (com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException e) {
                   JOptionPane.showMessageDialog(null, "CPF já cadastrado, tente outro!");
           
            return false;
        }
        
        catch (Exception e2) {
            JOptionPane.showMessageDialog(null,"O(s) campo(s) de texto chegaram ao limite!");
            return false;
        }
        
        finally{
            Conexao.closeConnection(con,stmt);
        }
    
    }
    
    public List<Psicologo> read() {
    
        
         Connection con = Conexao.getConnection();
         
        PreparedStatement stmt = null;
        ResultSet rs = null;
   
         List <Psicologo> psicologos = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement( "select * from psicologo");
            rs = stmt.executeQuery();
            
            while(rs.next()){

                
                Psicologo  psicologo = new Psicologo();
                
                 psicologo.setCpf(rs.getString("cpf"));
                 psicologo.setEmail(rs.getString("email"));
                 psicologo.setNome(rs.getString("nome"));
                 psicologo.setTelefone(rs.getString("telefone"));
                 psicologo.setSexo(rs.getString("sexo"));     
                 psicologo.setEstado_civil(rs.getString("estado_civil"));
                 psicologo.setData_nascimento(rs.getString("data_nascimento"));
                 psicologo.setCep(rs.getString("cep"));
                 psicologo.setRua(rs.getString("rua"));
                 psicologo.setNumero_endereco(rs.getInt("numero_endereco")); 
                 psicologo.setEstado(rs.getString("estado"));
                 psicologo.setBairro(rs.getString("bairro"));
                 psicologo.setCidade(rs.getString("cidade"));
                 psicologos.add(psicologo);
                
            }
        
        }
        
        
        catch (SQLException ex) {
           System.out.println("Erro: " + ex);
        }finally{
            
            Conexao.closeConnection(con, stmt, rs);
            
        }
    
               return psicologos;
    
    
    }
    
     public List<Psicologo> pesquisarPsicologo() {
    
        
         Connection con = Conexao.getConnection();
         
        PreparedStatement stmt = null;
        ResultSet rs = null;
   
         List <Psicologo> psicologos = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement( "select * from psicologo");
            rs = stmt.executeQuery();
            
            while(rs.next()){

                
                Psicologo  psicologo = new Psicologo();
                
                 psicologo.setCpf(rs.getString("cpf"));
                 
                 psicologo.setNome(rs.getString("nome"));
                
                 psicologos.add(psicologo);
                
            }
        
        }
        
        
        catch (SQLException ex) {
           System.out.println("Erro: " + ex);
        }finally{
            
            Conexao.closeConnection(con, stmt, rs);
            
        }
    
               return psicologos;
    
    
    }
    
     public List<Psicologo> pesquisarDadosPsicologo() {
    
        
         Connection con = Conexao.getConnection();
         
        PreparedStatement stmt = null;
        ResultSet rs = null;
   
         List <Psicologo> psicologos = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement( "select * from psicologo");
            rs = stmt.executeQuery();
            
            while(rs.next()){

                
                Psicologo  psicologo = new Psicologo();
                
                 psicologo.setCpf(rs.getString("cpf")); 
                 psicologo.setNome(rs.getString("nome"));
                 psicologo.setEmail(rs.getString("email"));
                 psicologos.add(psicologo);
                
            }
        
        }
        
        
        catch (SQLException ex) {
           System.out.println("Erro: " + ex);
        }finally{
            
            Conexao.closeConnection(con, stmt, rs);
            
        }
    
               return psicologos;
    
    
    }
public void update(Psicologo psicologo){
    
        Connection con = Conexao.getConnection();
        
        PreparedStatement stmt = null;
      
        try{
            
            stmt = con.prepareStatement("UPDATE psicologo SET nome = ?, email=?,telefone=?,sexo=?,estado_civil=?,data_nascimento=?,cep=?,rua=?,numero_endereco=?,estado=?,bairro=?,cidade=? WHERE cpf= ?");
            stmt.setString(1, psicologo.getNome());
            stmt.setString(2, psicologo.getEmail());
            stmt.setString(3, psicologo.getTelefone());
            stmt.setString(4, psicologo.getSexo());   
            stmt.setString(5, psicologo.getEstado_civil());
            stmt.setString(6,psicologo.getData_nascimento());
            stmt.setString(7,psicologo.getCep());
            stmt.setString(8, psicologo.getRua());
            stmt.setInt(9, psicologo.getNumero_endereco());
            stmt.setString(10, psicologo.getEstado());
            stmt.setString(11, psicologo.getBairro());
            stmt.setString(12,psicologo.getCidade());
            stmt.setString(13,psicologo.getCpf());
                int alterado =stmt.executeUpdate();
           
           if(alterado>0){
               
                 JOptionPane.showMessageDialog(null, " Psicólogo alterado com sucesso! ");
               
           }
               
            
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
        
 public void delete(Psicologo psicologo){
    
        Connection con = Conexao.getConnection();
        
        PreparedStatement stmt = null;
        
        try{
            
            stmt = con.prepareStatement("DELETE FROM psicologo WHERE cpf= ?");
        
               stmt.setString(1, psicologo.getCpf());
            
               
               stmt.executeUpdate();
            
              JOptionPane.showMessageDialog(null, "Psicólogo excluído com sucesso! ");
            
        }
        catch(SQLException ex){
           
             JOptionPane.showMessageDialog(null,"Exclua o número da consulta agendada no agendamento de consulta e/ou nas contas a receber");
        }
        finally{
            Conexao.closeConnection(con, stmt);
        }
}
  
     public List<Psicologo> readForDesc( String desc) {
    
        
         Connection con = Conexao.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
    
         List <Psicologo> psicologos = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement(" SELECT * FROM psicologo WHERE nome LIKE ?");
            stmt.setString(1,"%" + desc + "%");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                
                
                Psicologo psicologo = new Psicologo ();
                psicologo.setCpf(rs.getString("cpf"));
                psicologo.setEmail(rs.getString("email"));
                psicologo.setNome(rs.getString("nome"));
                psicologo.setTelefone(rs.getString("telefone"));
                psicologo.setSexo(rs.getString("sexo"));
                psicologo.setEstado_civil(rs.getString("estado_civil"));
                psicologo.setData_nascimento(rs.getString("data_nascimento"));
                psicologo.setCep(rs.getString("cep"));
                psicologo.setRua(rs.getString("rua"));
                psicologo.setNumero_endereco(rs.getInt("numero_endereco"));
                psicologo.setEstado(rs.getString("estado"));
                psicologo.setBairro(rs.getString("bairro"));
                psicologo.setCidade(rs.getString("cidade"));
                psicologos.add(psicologo);
            }
        
        }
        
        
        catch (SQLException ex) {
            Logger.getLogger(ContasPagarDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            
            Conexao.closeConnection(con, stmt, rs);
            
        }
    
               return psicologos;
    
    
    }
 

    }
    

