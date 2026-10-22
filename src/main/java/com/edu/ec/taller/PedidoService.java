package com.edu.ec.taller;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.inject.spi.CDI;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.inject.Singleton;
 
 
@ApplicationScoped //delego el control al contenedor
//@RequestScoped
//@Singleton  
public class PedidoService {
    
    //--Inyeccion de dependencias por atributo
    /*@Inject
    private MailService mailService;*/


    //--Inyeccion de dependencias por constructor
    /*private MailService mailService;
    public PedidoService(MailService mailService) {//donde quiero inyectar se crea el constructor
        this.mailService = mailService;
    }*/

    //--Inyeccion de dependencias por metodo ->setters
    /*private MailService mailService;
    @Inject 
    public void setMailService(MailService mailService) {
        System.out.println("Inyectando dependencias por metodo");
        this.mailService = mailService;
    }*/
    @Inject 
    @Named ("mail")
    private Notificacion correoService;
    @Inject
    @Named ("sms")
    private Notificacion smsService;

    public void realizar(Pedido pedido ){

        //Inyeccion de dependencias por CDI (Lookup)
        //MailService mailService = CDI.current().select(MailService.class).get();


        System.out.println("Pedido realizado paa el cliente: " + pedido.getCliente());
        System.out.println("Producto: " + pedido.getProducto());
        System.out.println("Total : " + pedido.getTotal());
        System.out.println("Correo: " + pedido.getCorreo());

        //Notificacion de peiddo por correo

        this.correoService.enviar(pedido.getCorreo(), "Pedido realizado con exito");
        

        //Notificacion de peiddo por SMS

        this.smsService.enviar(pedido.getTelefono(), "Pedido realizado con exito");

 
        System.out.println("Pedido realizado con exito");
 
 
    }
 
}