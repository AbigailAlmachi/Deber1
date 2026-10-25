package com.edu.ec.taller;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.util.UUID;

//ApplicationScoped, una sola instancia para toda la aplicacion
@ApplicationScoped
public class VentaService {

    private String id = UUID.randomUUID().toString();

    // inyeccion por atributo
    @Inject
    @Named("regular")
    CalculadoraDescuento descuentoRegular;

    @Inject
    @Named("vip")
    CalculadoraDescuento descuentoVip;

    private Auditoria auditoria;

    @Inject
    public VentaService(Auditoria auditoria) {
        this.auditoria = auditoria;
    }

    public void realizar(int numero, String tipo, double monto) {
        System.out.println("---------------------");
        System.out.println("Bienvenido...");
        System.out.println("VentaService id: " + id);
        System.out.println("Venta " + numero + " - Tipo: " + tipo);

        CalculadoraDescuento calculadora = descuentoRegular;
        if (tipo.equals("VIP")) {
            calculadora = descuentoVip;
        }

        double descuento = calculadora.calcular(monto);
        double total = monto - descuento;

        System.out.println("Monto: $" + monto);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total: $" + total);

        auditoria.registrar("Venta " + numero + " realizada");
        System.out.println("---------------------");
    }
}