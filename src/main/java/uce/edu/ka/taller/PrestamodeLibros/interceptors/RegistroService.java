package uce.edu.ka.taller.PrestamodeLibros.interceptors;

import java.time.LocalDateTime;

import jakarta.inject.Singleton;

@Singleton
public class RegistroService {

    public void guardarEnlaBase(String usuario, double dias, String correo) {
        System.out.println("Guardando en la base de datos: Usuario: " + usuario + ", Dias: " + dias + ", Correo: " + correo);
        System.out.println("Con fecha y hora: " + LocalDateTime.now());
    }
}