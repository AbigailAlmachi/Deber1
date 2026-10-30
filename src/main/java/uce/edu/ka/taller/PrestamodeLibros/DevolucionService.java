package uce.edu.ka.taller.PrestamodeLibros;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@ApplicationScoped
public class DevolucionService {

    @Inject
    @Named("mail")
    private Notificacion notificacioncorreo;

    public void realizar(Devolucion devolucion) {

        System.out.println("Realizando devolucion...");
        System.out.println("Devolucion realizada por el usuario: " + devolucion.getUsuario());
        System.out.println("Libro: " + devolucion.getLibro());
        System.out.println("Dias de prestamo: " + devolucion.getDias());
        System.out.println("Correo: " + devolucion.getCorreo());
        System.out.println("Devolucion realizada con exito");

        String cuerpo = "Estimado " + devolucion.getUsuario() + ", la devolucion del libro " +
                devolucion.getLibro() + " tras " + devolucion.getDias() +
                " dias de prestamo ha sido realizada con exito";

        // Notificacion de la devolucion por correo electronico
        this.notificacioncorreo.enviar(devolucion.getCorreo(), cuerpo);
        this.notificacioncorreo.setCantidad(this.notificacioncorreo.getCantidad() + 1);
        System.out.println("Cantidad de correos enviados devolucion: " + this.notificacioncorreo.getCantidad());
        System.out.println("Nombre: " + this.notificacioncorreo.getNombre());
    }

}