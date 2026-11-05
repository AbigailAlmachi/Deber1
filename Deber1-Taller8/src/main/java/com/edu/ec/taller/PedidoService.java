package com.edu.ec.taller;

import com.edu.ec.taller.interceptors.Auditoria;
import com.edu.ec.taller.interceptors.Mail;
import com.edu.ec.taller.interceptors.MedirTiempo;
import com.edu.ec.taller.interceptors.Sms;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped //delego el control al contenedor
public class PedidoService {

    @MedirTiempo
    @Auditoria
    @Sms
    @Mail
    public String realizar(Pedido pedido) {
        long init = System.currentTimeMillis();
        try {
            Thread.sleep(1500);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(":::::::::::::::::::::::::::::: \nRealizando pedido....");
        System.out.println("Pedido realizado para el cliente: " + pedido.getCliente());
        System.out.println("Producto: " + pedido.getProducto());
        System.out.println("Total: " + pedido.getTotal());
        System.out.println("Correo: " + pedido.getCorreo());
        System.out.println("Telefono: " + pedido.getTelefono());
        System.out.println("Pedido realizado con exito. \n :::::::::::::::::::::::::::::: ");
        long fin = System.currentTimeMillis() - init;
        System.out.println("[PedidoService] Se ha ejecutado correctamente \nTiempo de ejecucion : " + fin);
        return "[PedidoService] = Pedido procesado";
    }

}