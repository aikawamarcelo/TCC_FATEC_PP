/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

/**
 *
 * @author MARCELO
 */
public class Email {
  //public String email;
  //public String senha;

 private String nome;
 private String senha;
 private String assunto;
 private String mensagem;
 private String destinatario;

    public Email(String assunto, String mensagem, String destinatario) {
        this.assunto = assunto;
        this.mensagem = mensagem;
        this.destinatario = destinatario;
    }

  

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public void enviar(){

   SimpleEmail email = new SimpleEmail();
      email.setSSLOnConnect(true);
      email.setHostName("smtp.gmail.com");
       email.setSslSmtpPort("465");
      email.setAuthenticator(new DefaultAuthenticator(nome,senha));
      try{
        email.setFrom(nome);
        email.setDebug(true);
        
        email.setSubject(this.assunto);
        email.setMsg(this.mensagem);
        email.addTo(this.destinatario);
        
        email.send();
        
    }catch(EmailException e){
    
        e.printStackTrace();
    
    
    }

      
      
    }



}
