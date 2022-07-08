/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Consulta;
import Model.Paciente;
import Model.Psicologo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author MARCELO
 */
public class ConsultaDAO {
  
        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
     
            public void createConsulta(Consulta consulta){
              
                
                try {  
           
                stmt = con.prepareStatement("insert into consulta (data,hora,causas,sintomas,observacoes,valor,nome_psicologo,Psicologo_cpf,nome_paciente,Paciente_cpf) values (?,?,?,?,?,?,?,?,?,?)");
          
            
         
            stmt.setString(1, consulta.getData());
            stmt.setString(2, consulta.getHora());
            stmt.setString(3, consulta.getCausas());
            stmt.setString(4, consulta.getSintomas());
            stmt.setString(5, consulta.getObservacoes());
            stmt.setDouble(6, consulta.getValor());
            stmt.setString(7, consulta.getNome_psicologo());
            stmt.setString(8,consulta.getPsicologo().getCpf());
            stmt.setString(9, consulta.getNome_paciente());
            stmt.setString(10,consulta.getPaciente().getCpf());
            stmt.executeUpdate();
            
              JOptionPane.showMessageDialog(null, "Consulta agendada com sucesso!");
          
            
        } catch (com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException e) {
            JOptionPane.showMessageDialog(null, "Dados não cadastrados,tente outro CPF!");
           
        }
                       
         catch (Exception e2) {
            JOptionPane.showMessageDialog(null,"O(s) campo(s) de texto chegaram ao limite!");
        }
        
                
                
        finally{
            Conexao.closeConnection(con,stmt);
        }
  
            }
            
            public List<Consulta> read() {
    
      
         Connection con = Conexao.getConnection();
         
        PreparedStatement stmt = null;
        ResultSet rs = null;
   
         List <Consulta> consultas = new ArrayList<>();
        
        try {
          //  stmt = con.prepareStatement( "SELECT * FROM bdpsicologia.consulta_view");
           stmt = con.prepareStatement(" select* from bdpsicologia.consulta_view");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){

                Consulta consulta = new Consulta();
                
                 consulta.setNumero(rs.getInt("numero"));
                 consulta .setData(rs.getString("data"));
                 consulta .setHora(rs.getString("hora"));
                 consulta .setCausas(rs.getString("causas"));
                 consulta .setSintomas(rs.getString("sintomas"));
                 consulta .setObservacoes(rs.getString("observacoes"));
                 consulta .setValor(rs.getDouble("valor"));
                 Paciente paciente = new Paciente();
                 consulta.setPaciente(paciente);
                 paciente.setCpf(rs.getString("cpf"));
                 consulta.setNome_paciente(rs.getString("nome_paciente"));
             
                 Psicologo psicologo = new Psicologo();
                 consulta.setNome_psicologo(rs.getString("nome_psicologo"));
                 psicologo.setCpf(rs.getString("pcpf"));
                 consulta.setPsicologo(psicologo); 
              
          
                 
              consultas.add(consulta);
            }
        
        }
        
        
        catch (SQLException ex) {
           System.out.println("Erro: " + ex);
        }finally{
            
            Conexao.closeConnection(con, stmt, rs);
            
        }
    
               return  consultas;
    
    
    }
            
            public void update(Consulta consulta){
    
        Connection con = Conexao.getConnection();
        
        PreparedStatement stmt = null;
      
        try{
            
            stmt = con.prepareStatement("UPDATE consulta SET data = ?,hora=?,causas=?,sintomas=?,observacoes=?,valor=?,nome_psicologo=?,Psicologo_cpf=?,nome_paciente=?,Paciente_cpf=? where numero=?");
            stmt.setString(1, consulta.getData());
            stmt.setString(2, consulta.getHora());
            stmt.setString(3, consulta.getCausas());
            stmt.setString(4, consulta.getSintomas());   
            stmt.setString(5, consulta.getObservacoes());
            stmt.setDouble(6,consulta.getValor());
            stmt.setString(7, consulta.getNome_psicologo());
            stmt.setString(8, consulta.getPsicologo().getCpf());
            stmt.setString(9, consulta.getNome_paciente());
            stmt.setString(10,consulta.getPaciente().getCpf());
            stmt.setInt(11,consulta.getNumero());
               
               stmt.executeUpdate();
            
              JOptionPane.showMessageDialog(null, "Consulta alterada com sucesso! ");
            
        }
        catch (com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException e) {
            JOptionPane.showMessageDialog(null, "Insira um número de consulta válido ou não registrado");
        }
        
         catch (Exception e2) {
            JOptionPane.showMessageDialog(null,"O(s) campo(s) de texto chegaram ao limite!");
        }
        
        finally{
            Conexao.closeConnection(con, stmt);
        }
    }    
          
     public void delete(Consulta consulta){
    
        Connection con = Conexao.getConnection();
        
        PreparedStatement stmt = null;
        
        try{
            
            stmt = con.prepareStatement("DELETE FROM consulta WHERE numero= ?");
        
               stmt.setInt(1, consulta.getNumero());
            
               
               stmt.executeUpdate();
            
              JOptionPane.showMessageDialog(null, "Consulta excluída com sucesso! ");
            
        }
        catch(SQLException ex){
           
             JOptionPane.showMessageDialog(null,"Exclua primeiro o Contas a Receber");
        }
        finally{
            Conexao.closeConnection(con, stmt);
        }
}       
 public List<Consulta> readForDesc( String desc) {
    
        
         Connection con = Conexao.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
    
         List <Consulta> consultas = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM bdpsicologia.consulta_view WHERE nome_paciente LIKE ?");
            stmt.setString(1,"%"+desc + "%");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                
                
                      Consulta consulta = new Consulta();
                
                  consulta.setNumero(rs.getInt("numero"));
                 consulta .setData(rs.getString("data"));
                 consulta .setHora(rs.getString("hora"));
                 consulta .setCausas(rs.getString("causas"));
                 consulta .setSintomas(rs.getString("sintomas"));
                 consulta .setObservacoes(rs.getString("observacoes"));
                 consulta .setValor(rs.getDouble("valor"));
                 Paciente paciente = new Paciente();
                 consulta.setPaciente(paciente);
                 paciente.setCpf(rs.getString("cpf"));
                 Psicologo psicologo = new Psicologo();
                 consulta.setNome_psicologo(rs.getString("nome_psicologo"));
                 psicologo.setCpf(rs.getString("pcpf"));
                 consulta.setPsicologo(psicologo); 
                 consulta.setNome_paciente(rs.getString("nome_paciente"));
                 consultas.add(consulta);
            }
        
        }
        
        
        catch (SQLException ex) {
            Logger.getLogger(ConsultaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            
            Conexao.closeConnection(con, stmt, rs);
            
        }
    
     return consultas;
    
    } 
 
   public List<Consulta> pesquisarNumeroConsulta() {
    
      
         Connection con = Conexao.getConnection();
         
        PreparedStatement stmt = null;
        ResultSet rs = null;
   
         List <Consulta> consultas = new ArrayList<>();
        
        try {
          //  stmt = con.prepareStatement( "SELECT * FROM bdpsicologia.consulta_view");
           stmt = con.prepareStatement(" select* from bdpsicologia.consulta_view");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){

                Consulta consulta = new Consulta();
                
                 consulta.setNumero(rs.getInt("numero"));
                
                 
              consultas.add(consulta);
            }
        
        }
        
        
        catch (SQLException ex) {
           System.out.println("Erro: " + ex);
        }finally{
            
            Conexao.closeConnection(con, stmt, rs);
            
        }
    
               return  consultas;
    
    
    }
 
}
      

