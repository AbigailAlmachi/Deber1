package com.edu.ec.taller;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class Main implements QuarkusApplication {

    //inyeccion por atributo de la clase VentaService
    @Inject
    VentaService ventaService;

    public static void main(String[] args) {
        Quarkus.run(Main.class, args);
    }

    @Override
    public int run(String... args) {
        ventaService.realizar(1, "REGULAR", 100);
        ventaService.realizar(2, "VIP", 200);
        ventaService.realizar(3, "REGULAR", 300);
        ventaService.realizar(4, "VIP", 500);
        return 0;
    }
}