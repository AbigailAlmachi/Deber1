package uce.edu.ka.taller.PrestamodeLibros;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Named;

@Dependent
@Named("mail")
public class MailService implements Notificacion {

    private Integer cantidad = 0;
    private String nombre;

    @Override
    public void enviar(String destino, String mensaje) {
        System.out.println("Enviando correo a: " + destino);
        System.out.println("Mensaje: " + mensaje);
        System.out.println("Correo enviado con exito.");
        System.out.println("Fin del envio de correo");
    }

    @Override
    public Integer getCantidad() {
        return cantidad;
    }

    @Override
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}