package com.edu.ec.taller;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;
import java.util.UUID;

// ApplicationScoped, una sola instancia para toda la aplicacion
// RT04: Qualifier @Named para diferenciar esta implementacion
@ApplicationScoped
@Named("regular")

//implementacion con el 5 %
public class DescuentoRegular implements CalculadoraDescuento {

    private String id = UUID.randomUUID().toString();

    @Override
    public double calcular(double monto) {
        System.out.println("DescuentoRegular id: " + id);
        return monto * 0.05;
    }
}