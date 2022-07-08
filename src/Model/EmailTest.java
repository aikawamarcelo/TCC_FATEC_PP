/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author MARCELO
 */
public class EmailTest {
    public static void main(String [] args){
   
        Email email = new Email(
                 "Assunto da Barbearia",
                "Mensagem padrão do sistema da barbearia",
                "marceloaikawa@hotmail.com");
        
        email.enviar();
    
    }
}
