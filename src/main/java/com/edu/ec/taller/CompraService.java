package com.edu.ec.taller;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.ws.rs.ApplicationPath;

@ApplicationScoped 
public class CompraService {

     @Inject 
     @Named ("mail")
     private Notificacion notificacioncCorreo;

     public void realizar(Compra compra ){

        System.out.println("Pedido realizado paa el cliente: " + compra.getCliente());
        System.out.println("Producto: " + compra.getProducto());
        System.out.println("Total : " + compra.getTotal());
        System.out.println("Correo: " + compra.getCorreo());

        //Notificacion de peiddo por correo

        this.notificacioncCorreo.enviar(compra.getCorreo(), "Pedido realizado con exito");
        this.notificacioncCorreo.setCantidad(this.notificacioncCorreo.getCantidad()+1);
        System.out.println("Cantidad de correos enviados: " + this.notificacioncCorreo.getCantidad());
        
        System.out.println("Nombre:" + this.notificacioncCorreo.getNombre());
     }


}
