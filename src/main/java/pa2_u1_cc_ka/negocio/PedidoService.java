package pa2_u1_cc_ka.negocio;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

//@RequestScoped // Delego el control al contenedor ArC
//@Singleton
@ApplicationScoped  
public class PedidoService {

    @Inject
    MailService mailService;

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
}