package com.edu.ec.taller;

import jakarta.inject.Named;
import jakarta.inject.Singleton;

@Singleton 
@Named ("sms")
public class SmsServices implements Notificacion{

    @Override
    public void enviar(String destino, String mensaje) {
        System.out.println("Enviando SMS a: " + destino);
        System.out.println("mensaje: " + mensaje);

        System.out.println("SMS enviado con exito");
        System.out.println("Fin del envio de SMS");
    }

}
