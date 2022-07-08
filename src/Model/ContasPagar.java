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
public class ContasPagar {
    private int numero;
    private String data_pagamento;
    private String descricao;
    private double valor_a_pagar;
    private String data_vencimento;
    private String data_lancamento;
    private String status; 

    public ContasPagar(int numero, String data_pagamento, String descricao, double valor_a_pagar, String data_vencimento, String data_lancamento, String status) {
        this.numero = numero;
        this.data_pagamento = data_pagamento;
        this.descricao = descricao;
        this.valor_a_pagar = valor_a_pagar;
        this.data_vencimento = data_vencimento;
        this.data_lancamento = data_lancamento;
       
        this.status = status;
    }


    public ContasPagar() {
    
    
    }

    
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getData_pagamento() {
        return data_pagamento;
    }

    public void setData_pagamento(String data_pagamento) {
   
            this.data_pagamento = data_pagamento;
        
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor_a_pagar() {
        return valor_a_pagar;
    }

    public void setValor_a_pagar(double valor_a_pagar) {
        this.valor_a_pagar = valor_a_pagar;
    }

    public String getData_vencimento() {
        return data_vencimento;
    }

    public void setData_vencimento(String data_vencimento) {

            this.data_vencimento = data_vencimento;
        
    }

    public String getData_lancamento() {
        return data_lancamento;
    }

    public void setData_lancamento(String data_lancamento) {
      
            this.data_lancamento = data_lancamento;
       
    }

 

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
    
    
}
