/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MARCELO
 */
public class ContasReceber {
    private Consulta consulta;
    private String data_lancamento;
    private String data_recebimento;
    private double valor_a_receber;
    private String tipo;
    private String status;

    public ContasReceber(Consulta consulta, String data_lancamento, String data_recebimento, double valor_a_receber,String tipo,String status){
            this.consulta = consulta;
            this.data_lancamento = data_lancamento;
            this.data_recebimento = data_recebimento;
            this.valor_a_receber = valor_a_receber;
            this.tipo = tipo;
            this.status= status;
    }

    public ContasReceber() {
    }

    
    
    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public String getData_lancamento() {
        return data_lancamento;
    }

    public void setData_lancamento(String data_lancamento) {
   
            this.data_lancamento = data_lancamento;
      
    }

    public String getData_recebimento() {
        return data_recebimento;
    }

    public void setData_recebimento(String data_recebimento) {
       
            this.data_recebimento = data_recebimento;
       
    }

    public Double getValor_a_receber() {
        return valor_a_receber;
    }

    public void setValor_a_receber(double valor_a_receber) {
        this.valor_a_receber = valor_a_receber;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
