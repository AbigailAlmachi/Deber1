package pa2_u1_cc_ka_deber1.negocio;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Pedido pedido = new Pedido(
                "Abigail", "laptop", 15000.0, "abigail@gmail.com");

        PedidoService pedidoService = new PedidoService();
        pedidoService.realizar(pedido);
    }
}