package com.edu.ec.taller;

import jakarta.enterprise.context.Dependent;
import java.util.UUID;

//Dependent, su ciclo de vida depende del bean que la recibe
@Dependent
public class Auditoria {

    private String id = UUID.randomUUID().toString();

    public void registrar(String operacion) {
        System.out.println("Auditoria id: " + id);
        System.out.println("Operacion: " + operacion);
    }
}