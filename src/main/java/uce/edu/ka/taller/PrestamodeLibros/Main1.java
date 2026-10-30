package uce.edu.ka.taller.PrestamodeLibros;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class Main1 implements QuarkusApplication {

    @Inject
    private PrestamoService prestamoService;

    @Inject
    private DevolucionService devolucionService;

    public static void main(String[] args) {

        Quarkus.run(Main1.class, args);

    }

    @Override
    public int run(String... args) {

        Prestamo prestamo = new Prestamo("Abigail", "Cien anos de soledad", 7.0, "abigail@gmail.com", "0984908315");
        prestamo.setTelefono("0984908315");
        this.prestamoService.realizar(prestamo, "1");

        return 0;
    }

}