/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.ContasPagar;
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
public class ContasPagarDAO {
    
 
    
    
    public void createContasPagar(ContasPagar cp){
        
        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        try{
            
            stmt = con.prepareStatement("insert into contaspagar (data_pagamento,descricao,valor_a_pagar,data_vencimento,data_lancamento,status) values (?,?,?,?,?,?)");
          
            stmt.setString(1, cp.getData_pagamento());
            stmt.setString(2, cp.getDescricao());
             stmt.setDouble(3, cp.getValor_a_pagar());
             stmt.setString(4, cp.getData_vencimento());
             stmt.setString(5, cp.getData_lancamento());
             stmt.setString(6, cp.getStatus());
            
           
           
            stmt.executeUpdate();
            
              JOptionPane.showMessageDialog(null, "Conta cadastrada com sucesso!");
            
          
        } catch (com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException e) {
            JOptionPane.showMessageDialog(null, "Insira um número de conta válido ou não registrado");
        }
        
         catch (Exception e2) {
            JOptionPane.showMessageDialog(null,"O(s) campo(s) de texto chegaram ao limite!");
        }
        
      
        finally{
            Conexao.closeConnection(con,stmt);
        }
    
    
    }
    
    public List<ContasPagar> read() {
    
        
         Connection con = Conexao.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
    
         List <ContasPagar> contasapagar = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement(" SELECT * FROM contaspagar");
            rs = stmt.executeQuery();
            
            while(rs.next()){
         
                ContasPagar cp = new ContasPagar();
                 cp.setNumero(rs.getInt("numero"));
                cp.setData_pagamento(rs.getString("data_pagamento"));
                cp.setDescricao(rs.getString("descricao"));
                cp.setValor_a_pagar(rs.getDouble("valor_a_pagar"));
                cp.setData_vencimento(rs.getString("data_vencimento"));
                 cp.setData_lancamento(rs.getString("data_lancamento"));
                 cp.setStatus(rs.getString("status"));
                   contasapagar.add(cp);
            }
        
        }
        
        
        catch (SQLException ex) {
            Logger.getLogger(ContasPagarDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            
            Conexao.closeConnection(con, stmt, rs);
            
        }
    
               return contasapagar;
    
    
    }
    
    public void update(ContasPagar cp){
    
        Connection con = Conexao.getConnection();
        
        PreparedStatement stmt = null;
      
        try{
            
            stmt = con.prepareStatement("UPDATE contaspagar SET status = ?, data_pagamento = ?,descricao=?,valor_a_pagar=?,data_vencimento=?,data_lancamento=? WHERE numero = ?");
            stmt.setString(1, cp.getStatus());
            stmt.setString(2, cp.getData_pagamento());
            stmt.setString(3, cp.getDescricao());
            stmt.setDouble(4, cp.getValor_a_pagar());   
            stmt.setString(5, cp.getData_vencimento());
             stmt.setString(6, cp.getData_lancamento());
            stmt.setInt(7, cp.getNumero());
               
               stmt.executeUpdate();
            
              JOptionPane.showMessageDialog(null, "Conta atualizada com sucesso! ");
            
        }
        catch(SQLException ex){
            System.out.println("Erro ao Atualizar: " + ex);
        }
        finally{
            Conexao.closeConnection(con, stmt);
        }
    }
    
    public void delete(ContasPagar cp){
    
        Connection con = Conexao.getConnection();
        
        PreparedStatement stmt = null;
        
        try{
            
            stmt = con.prepareStatement("DELETE FROM contaspagar WHERE numero= ?");
        
               stmt.setInt(1, cp.getNumero());
            
               
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
    
     public List<ContasPagar> readForDesc( String desc) {
    
        
         Connection con = Conexao.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
    
         List <ContasPagar> contasapagar = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement(" SELECT * FROM contaspagar WHERE status LIKE ?");
            stmt.setString(1,desc+"%");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                
                
                 ContasPagar cp = new ContasPagar();
                 cp.setNumero(rs.getInt("numero"));
                cp.setData_pagamento(rs.getString("data_pagamento"));
                cp.setDescricao(rs.getString("descricao"));
                cp.setValor_a_pagar(rs.getDouble("valor_a_pagar"));
                cp.setData_vencimento(rs.getString("data_vencimento"));
                 cp.setData_lancamento(rs.getString("data_lancamento"));
                 cp.setStatus(rs.getString("status"));
                   contasapagar.add(cp);
            }
        
        }
        
        
        catch (SQLException ex) {
            Logger.getLogger(ContasPagarDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            
            Conexao.closeConnection(con, stmt, rs);
            
        }
    
               return contasapagar;
    
    
    }
    
    
    
}
