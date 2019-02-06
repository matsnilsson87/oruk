/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oruk;

import oru.inf.InfDB;
import java.util.*;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


/**
 *
 * @author Jamie
 */
public class Email {
    
private static InfDB db;
    
    
public Email (InfDB db) {
        this.db = db;
    }


/*
    Den här klaassen innehåller allt som har med hantering av email (notiser) att göra.
    Det finns en unik metod för varje notis.

*/
//Kanske köras utan anropsparametrar, beror på hur notiserna ska funka.
public void skickaMail() {
    
        try{
            String host = "smtp.gmail.com";
            String user = "orukadm1n@gmail.com";
            String pass = "Adm1n123";
            String to = "jamie.jones@live.se";
            String from = "orukadm1n@gmail.com";
            String subject = "TestMail";
            String messageText = "Testbody heheheheh";
            boolean sessionDebug = false;

            Properties props = System.getProperties();

            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", host);
            props.put("mail.smtp.port", "587");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.required", "true");
            
            java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
            Session mailSession = Session.getDefaultInstance(props, null);
            mailSession.setDebug(sessionDebug);
            Message msg = new MimeMessage(mailSession);
            msg.setFrom(new InternetAddress(from));
            InternetAddress[] address = {new InternetAddress(to)};
            msg.setRecipients(Message.RecipientType.TO, address);
            msg.setSubject(subject); msg.setSentDate(new Date());
            msg.setText(messageText);
            
           Transport transport=mailSession.getTransport("smtp");
           transport.connect(host, user, pass);
           transport.sendMessage(msg, msg.getAllRecipients());
           transport.close();
           System.out.println("Meddelandet har skickats.");
           
        }catch(Exception ex)
        {
            System.out.println(ex);
        }

    }
    

    
    
}
