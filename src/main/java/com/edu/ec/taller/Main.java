package com.edu.ec.taller;

 
import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;
 
@QuarkusMain
public class Main implements QuarkusApplication{
 
    @Inject
    private PedidoService pedidoService;
 
    public static void main(String[] args) {
        Quarkus.run(Main.class, args);
    }
 
    @Override
    public int run(String... args) {        
        System.out.println("Iniciando Aplicacion quarkus");
 
        Pedido pedido =  new Pedido("Juan Peres", "laptop",150, "juansdsd" );
        this.pedidoService.realizar(pedido);
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
        return 0;
    }
 
}