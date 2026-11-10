package com.edu.ec.taller;

import com.edu.ec.taller.extensiones.NotificacionExtensionMail;
import com.edu.ec.taller.extensiones.NotificacionExtensionSMS;
import com.edu.ec.taller.extensiones.NotificacionExtensionWhatsApp;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class Main implements QuarkusApplication{
 
    @Inject
    private CompraService compraService;

    @Inject 
    private NotificacionExtensionMail notificacionExtensionMail;

    @Inject
    private NotificacionExtensionSMS notificacionExtensionSMS;

    @Inject 
    private NotificacionExtensionWhatsApp notificacionExtensionWhatsApp;

 
    public static void main(String[] args) {
        Quarkus.run(Main.class, args);
    }
 
    @Override
    public int run(String... args) {    
    
        System.out.println("Iniciando Aplicacion quarkus");

        System.out.println("--------------------------------------------------");

        Compra compra = new Compra("Abigail", "celular", 1200, "abigail@gmail.com");
        compraService.realizar(compra, this.notificacionExtensionMail);
    
        System.out.println("--------------------------------------------------");

        Compra compra2 = new Compra("Pedro", "laptop", 2000, "pedro@gmail.com");
        compraService.realizar(compra2, this.notificacionExtensionSMS);

        System.out.println("--------------------------------------------------");

        Compra compra3 = new Compra("Jimin", "Iphone", 100000, "jimin@gmail.com");
        compraService.realizar(compra3, this.notificacionExtensionWhatsApp);
        System.out.println("--------------------------------------------------");


        return 0;
    }
 
}