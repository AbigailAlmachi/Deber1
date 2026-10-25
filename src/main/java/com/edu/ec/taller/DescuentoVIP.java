package com.edu.ec.taller;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;
import java.util.UUID;

//ApplicationScoped, una sola instancia para toda la aplicacion
//Qualifier @Named para diferenciar esta implementacion
@ApplicationScoped
@Named("vip")

//implementacion con el 15 %
public class DescuentoVIP implements CalculadoraDescuento {

    // RT05: UUID para observar que la instancia se reutiliza
    private String id = UUID.randomUUID().toString();

    @Override
    public double calcular(double monto) {
        System.out.println("DescuentoVIP id: " + id);
        return monto * 0.15;
    }
}