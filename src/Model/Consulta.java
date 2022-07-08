/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MARCELO
 */
public class Consulta {
    private int numero;
    private String data;
    private String hora;
    private String causas;
    private String sintomas;
    private String observacoes;
    private double valor;
    private String nome_psicologo;
    private Psicologo psicologo;        
    private Paciente paciente;
    private String nome_paciente;
    
    
    
    public Consulta() {
    }

    public Consulta(int numero, String data,String hora,String causas, String sintomas, String observacoes, double valor, Paciente paciente, Psicologo psicologo) {
        this.numero = numero;
        this.data = data;
        this.hora= hora;
        this.causas = causas;
        this.sintomas = sintomas;
        this.observacoes = observacoes;
        this.valor = valor;
        this.paciente=paciente;
        this.psicologo = psicologo;
                
    }

    

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Psicologo getPsicologo() {
        return psicologo;
    }

    public void setPsicologo(Psicologo psicologo) {
        this.psicologo = psicologo;
    }

    public String getData() {
        return data;
    }
public void setData(String data) {
       
            this.data = data;
       
    }

    public String getNome_psicologo() {
        return nome_psicologo;
    }

    public void setNome_psicologo(String nome_psicologo) {
        this.nome_psicologo = nome_psicologo;
    }

    public String getNome_paciente() {
        return nome_paciente;
    }

    public void setNome_paciente(String nome_paciente) {
        this.nome_paciente = nome_paciente;
    }



    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    
  
    
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

  
   
   


    public String getCausas() {
        return causas;
    }

    public void setCausas(String causas) {
        this.causas = causas;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    

    
    
}
