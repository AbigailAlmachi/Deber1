package pa2_u1_cc_ka_deber1.negocio;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Entrada entrada = new Entrada(
                "Abigail", "Avengers", 12.5, "abigail@gmail.com");

        EntradaService entradaService = new EntradaService();
        entradaService.realizar(entrada);
    }
}