package uce.edu.ka.taller.PrestamodeLibros;

import jakarta.enterprise.context.ApplicationScoped;
import uce.edu.ka.taller.PrestamodeLibros.interceptors.Registro;

@ApplicationScoped
public class PrestamoService {

    @Registro
    public String realizar(Prestamo prestamo, String valor1) {

        System.out.println("Realizando prestamo...");
        System.out.println("Prestamo realizado para el usuario: " + prestamo.getUsuario());
        System.out.println("Libro: " + prestamo.getLibro());
        System.out.println("Dias de prestamo: " + prestamo.getDias());
        System.out.println("Correo: " + prestamo.getCorreo());
        System.out.println("Prestamo realizado con exito");
        return "Prestamo realizado exitosamente";
    }
}