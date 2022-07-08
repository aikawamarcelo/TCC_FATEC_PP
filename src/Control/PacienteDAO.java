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
public class PacienteDAO {
    

    
    public void createPaciente(Paciente p){
    
    Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
            
        try{
        stmt = con.prepareStatement("insert into paciente(cpf,nome,telefone,email,sexo,data_nascimento,estado_civil,cep,rua,numero_endereco,estado,bairro,cidade) values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
           
            stmt.setString(1, p.getCpf());
            stmt.setString(2, p.getNome());
            stmt.setString(3, p.getTelefone());
            stmt.setString(4, p.getEmail());
            stmt.setString(5, p.getSexo());
            stmt.setString(6, p.getData_nascimento());
            stmt.setString(7, p.getEstado_civil());
            stmt.setString(8, p.getCep());
            stmt.setString(9, p.getRua());
            stmt.setInt(10, p.getNumero_endereco());
            stmt.setString(11, p.getEstado());
            stmt.setString(12, p.getBairro());
           stmt.setString(13, p.getCidade());
          
            
           int adicionado=stmt.executeUpdate();
           
           if(adicionado>0){
               
                 JOptionPane.showMessageDialog(null, "Paciente cadastrado com sucesso!");
               
           }
           
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
    
    public List<Paciente> read() {
    
        
         Connection con = Conexao.getConnection();
          String sql = "select * from paciente";
        PreparedStatement stmt = null;
        ResultSet rs = null;
   
         List <Paciente> pacientes = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while(rs.next()){

                
                Paciente  paciente = new Paciente();
                
                 paciente.setCpf(rs.getString("cpf")); 
                 paciente.setNome(rs.getString("nome"));
                 paciente.setTelefone(rs.getString("telefone"));
                 paciente.setEmail(rs.getString("email"));
                 paciente.setSexo(rs.getString("sexo"));
                 paciente.setData_nascimento(rs.getString("data_nascimento")); 
                 paciente.setEstado_civil(rs.getString("estado_civil"));
                  paciente.setCep(rs.getString("cep"));
                 paciente.setRua(rs.getString("rua"));
                 paciente.setNumero_endereco(rs.getInt("numero_endereco")); 
                 paciente.setEstado(rs.getString("estado"));
                 paciente.setBairro(rs.getString("bairro"));
                 paciente.setCidade(rs.getString("cidade"));
                 pacientes.add(paciente);
            }
        
        }
        
        
        catch (SQLException ex) {
           System.out.println("Erro: " + ex);
        }finally{
            
            Conexao.closeConnection(con, stmt, rs);
            
        }
    
               return pacientes;
    
    
    }
    
    
     public List<Paciente> pesquisarPaciente() {
    
        
         Connection con = Conexao.getConnection();
          String sql = "select * from paciente";
        PreparedStatement stmt = null;
        ResultSet rs = null;
   
         List <Paciente> pacientes = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while(rs.next()){

                
                Paciente  paciente = new Paciente();
                
                 paciente.setCpf(rs.getString("cpf")); 
                 paciente.setNome(rs.getString("nome"));
               
                 pacientes.add(paciente);
            }
        
        }
        
        
        catch (SQLException ex) {
           System.out.println("Erro: " + ex);
        }finally{
            
            Conexao.closeConnection(con, stmt, rs);
            
        }
    
               return pacientes;
    
    
    }
    
     
     public List<Paciente> pesquisarDadosPaciente() {
    
        
         Connection con = Conexao.getConnection();
          String sql = "select * from paciente";
        PreparedStatement stmt = null;
        ResultSet rs = null;
   
         List <Paciente> pacientes = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while(rs.next()){

                
                Paciente  paciente = new Paciente();
                
                 paciente.setNome(rs.getString("nome")); 
                 paciente.setEmail(rs.getString("email"));
               
                 pacientes.add(paciente);
            }
        
        }
        
        
        catch (SQLException ex) {
           System.out.println("Erro: " + ex);
        }finally{
            
            Conexao.closeConnection(con, stmt, rs);
            
        }
    
               return pacientes;
    
    
    }
    
    public void update(Paciente paciente){
    
        Connection con = Conexao.getConnection();
        
        PreparedStatement stmt = null;
      
        try{
            
            stmt = con.prepareStatement("UPDATE paciente SET nome = ?,telefone=?,email=?,sexo=?,data_nascimento=?,estado_civil=?,cep=?,rua=?,numero_endereco=?,estado=?,bairro=?,cidade=? WHERE cpf= ?");
            stmt.setString(1,paciente.getNome());
            stmt.setString(2,paciente.getTelefone());
            stmt.setString(3,paciente.getEmail());
            stmt.setString(4,paciente.getSexo());  
            stmt.setString(6,paciente.getData_nascimento());
            stmt.setString(5,paciente.getEstado_civil());
            stmt.setString(7,paciente.getCep());
            stmt.setString(8,paciente.getRua());
            stmt.setInt(9,paciente.getNumero_endereco());
            stmt.setString(10,paciente.getEstado());
            stmt.setString(11,paciente.getBairro());
            stmt.setString(12,paciente.getCidade());
            stmt.setString(13,paciente.getCpf());
                
            
            int alterado=stmt.executeUpdate();
           
           if(alterado>0){
               
                JOptionPane.showMessageDialog(null, "Paciente alterado com sucesso! ");
               
           }
             
            
              
            
        }
        catch (com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException e) {
            JOptionPane.showMessageDialog(null," CPF já cadastrado, tente outro!");
        } catch (Exception e2) {
            JOptionPane.showMessageDialog(null,"O(s) campo(s) de texto chegaram ao limite!");
        }
        
       
        finally{
            Conexao.closeConnection(con, stmt);
        }
    }

 public void delete(Paciente paciente){
    
        Connection con = Conexao.getConnection();
        
        PreparedStatement stmt = null;
        
        try{
            
            stmt = con.prepareStatement("DELETE FROM  paciente WHERE cpf= ?");
        
               stmt.setString(1,  paciente.getCpf());
            
               
               stmt.executeUpdate();
            
              JOptionPane.showMessageDialog(null, "Paciente excluído com sucesso! ");
            
        }
        catch(SQLException ex){
           
             JOptionPane.showMessageDialog(null,"Exclua o número da consulta agendada no agendamento de consulta e/ou nas contas a receber");
        }
        finally{
            Conexao.closeConnection(con, stmt);
        }
                                   }
        
         public List<Paciente> readForDesc( String desc) {
    
        
         Connection con = Conexao.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
    
         List <Paciente> pacientes = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement(" SELECT * FROM paciente WHERE nome LIKE ?");
            stmt.setString(1,"%" + desc + "%");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                
                
                 Paciente paciente = new Paciente();
                paciente.setCpf(rs.getString("cpf"));
                paciente.setNome(rs.getString("nome"));
                paciente.setTelefone(rs.getString("telefone"));
                paciente.setEmail(rs.getString("email"));
                paciente.setSexo(rs.getString("sexo"));
                paciente.setData_nascimento(rs.getString("data_nascimento"));
                paciente.setEstado_civil(rs.getString("estado_civil"));
                paciente.setCep(rs.getString("cep"));
                paciente.setRua(rs.getString("rua"));
                paciente.setNumero_endereco(rs.getInt("numero_endereco"));
                paciente.setEstado(rs.getString("estado"));
                paciente.setBairro(rs.getString("bairro"));
                paciente.setCidade(rs.getString("cidade"));
                pacientes.add(paciente);
            }
        
        }
        
        
        catch (SQLException ex) {
            Logger.getLogger(ContasPagarDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            
            Conexao.closeConnection(con, stmt, rs);
            
        }
    
               return pacientes;
    
    
    }
 
        
    }
    
    
    
    
    

