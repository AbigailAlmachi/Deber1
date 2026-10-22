package pa2_u1_cc_ka.negocio;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.inject.spi.CDI;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

//@RequestScoped // Delego el control al contenedor ArC
//@Singleton
@ApplicationScoped  
public class PedidoService {

    
    @Inject
   private  MailService mailService2; 

   
   /* 
       private  MailService mailService;
 
       //inyeccion de dependencias por constructor
    @Inject 
    public PedidoService(MailService mailService) {
        this.mailService = mailService;
    }
    */

    /* 
       private MailService mailService;
    
       //inyeccion de dependencias por setter
       @Inject 
        public void setMailService(MailService mailService) {
            System.out.println("Inyectando MailService en PedidoService...");   
        this.mailService = mailService;
    }
    */

    /* 

    public void realizar(Pedido pedido) {
        System.out.println("Realizado pedido...");
        System.out.println(pedido.getCliente());
        System.out.println(pedido.getProducto());
        System.out.println(pedido.getTotal());
        System.out.println(pedido.getCorreo());

        String asunto = "Confirmacion de pedido";
        String cuerpo = "Estimado " + pedido.getCliente()
                + ", su pedido de " + pedido.getProducto()
                + " por un total de $" + pedido.getTotal()
                + " ha salido con exito";

        mailService.enviar(pedido.getCorreo(), asunto, cuerpo);
    }
        */

    public void realizar(Pedido pedido) {

        //lookup de la clase MailService
        MailService mailService = CDI.current().select(MailService.class).get();

    System.out.println("Realizando pedido....");
    System.out.println("Pedido realizado para el cliente: " + pedido.getCliente());
    System.out.println("Producto: " + pedido.getProducto());
    System.out.println("Total: " + pedido.getTotal());
    System.out.println("Correo: " + pedido.getCorreo());
        System.out.println("Pedido realizado con éxito.");

    String asunto = "Confirmación de pedido";
    String cuerpo = "Estimado " + pedido.getCliente() + ", su pedido de "
        + pedido.getProducto() + " por un total de $" + pedido.getTotal()
        + " ha sido realizado con éxito.";
    mailService.enviar(pedido.getCorreo(), asunto, cuerpo);
    }
}