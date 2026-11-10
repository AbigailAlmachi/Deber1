package com.edu.ec.taller;

import com.edu.ec.taller.extensiones.NotificacionExtension;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped 
public class CompraService {

     public void realizar(Compra compra, NotificacionExtension notificacionExtension) {

      System.out.println("Realizando compra...");
      System.out.println("Pedido realizado para el cliente: " + compra.getCliente());
      System.out.println("Producto: " + compra.getProducto());
      System.out.println("Total : " + compra.getTotal());
      System.out.println("Correo: " + compra.getCorreo());
      System.out.println("Compra realizada con exito.");
       
     //aqui voy a programar el envio de la notificacion
      notificacionExtension.enviar("Su pedido a sido realizado con exito", compra.getCliente());

      }
}


