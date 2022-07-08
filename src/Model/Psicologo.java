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
public class Psicologo {
   
    private String cpf;
    private String email;
    private String nome;
    private String telefone;
    private String sexo;
    private String estado_civil;
    private String data_nascimento; 
    private int numero_endereco;
    private String cep;
    private String rua;
    private String estado;
    private String bairro;
    private String cidade;
   
   
   
   

    /**
     *
     */
    

  public Psicologo() {
    
    }

    public Psicologo(String cpf, String email, String nome, String telefone, String sexo, String estado_civil, String data_nascimento, int numero_endereco, String cep, String rua, String estado, String bairro, String cidade) {
     
        this.cpf = cpf;
        this.email = email;
        this.nome = nome;
        this.telefone = telefone;
        this.sexo = sexo;
        this.estado_civil = estado_civil;
        this.data_nascimento = data_nascimento;
        this.numero_endereco = numero_endereco;
        this.cep = cep;
        this.rua = rua;
        this.estado = estado;
        this.bairro = bairro;
        this.cidade = cidade;
        
    }



    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

  
  

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        
            this.data_nascimento = data_nascimento;
       
    }

    public int getNumero_endereco() {

         return this.numero_endereco;
 
    }

    public void setNumero_endereco(int numero_endereco) {
        this.numero_endereco = numero_endereco;
    }

   
  
    
    
}
