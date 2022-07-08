/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Consulta;
import Model.ContasReceber;
import Model.Paciente;
import Model.Psicologo;
import Model.Usuario;
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
public class ContasReceberDAO {
    
public void createContasReceber(ContasReceber cr){
        
    
  
    
        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        try{
            
            
            stmt = con.prepareStatement("insert into contasreceber (consulta_numero,data_lancamento,data_recebimento,valor_a_receber,tipo,status) values (?,?,?,?,?,?)");
            stmt.setInt(1, cr.getConsulta().getNumero());
            stmt.setString(2, cr.getData_lancamento());
            stmt.setString(3, cr.getData_recebimento());
            stmt.setDouble(4, cr.getValor_a_receber());
            stmt.setString(5, cr.getTipo());
            stmt.setString(6, cr.getStatus());
             int adicionado = stmt.executeUpdate();
            if(adicionado>0){
           
                JOptionPane.showMessageDialog(null, "Conta cadastrada com sucesso!");
            
            
            
            } 
           
            
        } catch (com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException e) {
            JOptionPane.showMessageDialog(null, "Insira um número de consulta válido ou não registrado");
        }
        
         catch (Exception e2) {
            JOptionPane.showMessageDialog(null,"O(s) campo(s) de texto chegaram ao limite!");
        }
       
       
        finally{
            Conexao.closeConnection(con,stmt);
        }
  

}


      

     public List<ContasReceber> read() {
    
      
         Connection con = Conexao.getConnection();
         
        PreparedStatement stmt = null;
        ResultSet rs = null;
   
         List <ContasReceber> contasareceber = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement( "select * from contasreceber");
            rs = stmt.executeQuery();
            
            while(rs.next()){

                ContasReceber cr  = new ContasReceber();
                
                Consulta consulta = new Consulta();
                
                 consulta.setNumero(rs.getInt("consulta_numero"));
                 cr.setConsulta(consulta);
                 cr .setData_lancamento(rs.getString("data_lancamento"));
                 cr .setData_recebimento(rs.getString("data_recebimento"));
                 cr .setValor_a_receber(rs.getDouble("valor_a_receber"));
                 cr .setTipo(rs.getString("tipo"));
                 cr .setStatus(rs.getString("status"));
         
                
                 
              contasareceber.add(cr);
            }
        
        }
     
        catch (SQLException ex) {
           System.out.println("Erro: " + ex);
        }finally{
            
            Conexao.closeConnection(con, stmt, rs);
            
        }
    
               return  contasareceber;
    

     }
     
     public void update(ContasReceber cr){
    
        Connection con = Conexao.getConnection();
        
        PreparedStatement stmt = null;
      
        try{
            
            stmt = con.prepareStatement("UPDATE contasreceber SET data_lancamento = ?, data_recebimento=?,valor_a_receber=?,tipo=?,status=? where consulta_numero=?");
            stmt.setString(1, cr.getData_lancamento());
            stmt.setString(2, cr.getData_recebimento());
            stmt.setDouble(3, cr.getValor_a_receber());   
            stmt.setString(4, cr.getTipo());
            stmt.setString(5, cr.getStatus());
            stmt.setInt(6,cr.getConsulta().getNumero());
               
               stmt.executeUpdate();
            
              JOptionPane.showMessageDialog(null, "Conta alterada com sucesso! ");
            
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
public void delete(ContasReceber cr){
    
        Connection con = Conexao.getConnection();
        
        PreparedStatement stmt = null;
        
        try{
            
            stmt = con.prepareStatement("DELETE FROM contasreceber WHERE consulta_numero= ?");
        
               stmt.setInt(1, cr.getConsulta().getNumero());
            
               
               stmt.executeUpdate();
            
              JOptionPane.showMessageDialog(null, "Conta excluída com sucesso! ");
            
        }
        catch(SQLException ex){
           
             JOptionPane.showMessageDialog(null,"Erro ao Excluir: " + ex);
        }
        finally{
            Conexao.closeConnection(con, stmt);
        }
}       
  
 public List<ContasReceber> readForDesc( String desc) {
    
        
         Connection con = Conexao.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
    
         List <ContasReceber> contasareceber = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement(" SELECT * FROM contasreceber WHERE consulta_numero LIKE ?");
            stmt.setString(1,"%" + desc + "%");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                ContasReceber cr = new ContasReceber();
                Consulta c = new Consulta();
              c.setNumero(rs.getInt("consulta_numero"));
                    cr.setConsulta(c);
                cr.setData_lancamento(rs.getString("data_lancamento"));
               cr.setData_recebimento(rs.getString("data_recebimento"));
               cr.setValor_a_receber(rs.getDouble("valor_a_receber"));
               cr.setTipo(rs.getString("tipo"));
                cr.setStatus(rs.getString("status"));
             
               
                contasareceber.add(cr);
            }
        
        }
         catch (SQLException ex) {
            Logger.getLogger(ContasReceberDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            
            Conexao.closeConnection(con, stmt, rs);
            
        }
    
               return contasareceber;
    
    
    }    
     
}
