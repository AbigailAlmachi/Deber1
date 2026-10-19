package pa2_u1_cc_ka_deber1.negocio;

public class PedidoService {
    public void realizar(Pedido pedido) {
        System.out.println("Realizado pedido...");
        System.out.println(pedido.getCliente());
        System.out.println(pedido.getProducto());
        System.out.println(pedido.getTotal());
        System.out.println(pedido.getCorreo());

        MailService mailService = new MailService();

        String asunto = "Confirmacion de pedido";
        String cuerpo = "Estimado " + pedido.getCliente()
                + ", su pedido de " + pedido.getProducto()
                + " por un total de $" + pedido.getTotal()
                + " ha salido con exito";

        mailService.enviar(pedido.getCorreo(), asunto, cuerpo);
    }
}