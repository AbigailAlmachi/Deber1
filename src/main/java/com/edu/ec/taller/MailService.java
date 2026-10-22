package com.edu.ec.taller;

 
import io.quarkus.arc.Unremovable;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import jakarta.inject.Singleton;
 
//@ApplicationScoped
//@RequestScoped
@Singleton
@Named ("mail")  
public class MailService implements Notificacion{
 
   

    @Override
    public void enviar(String destino, String mensaje) {

        System.out.println("Enviando correo a: " + destino);
        System.out.println("mensaje: " + mensaje);

        System.out.println("Correo enviado con exito");
        System.out.println("Fin del envio de correo");
    
    }
 
}