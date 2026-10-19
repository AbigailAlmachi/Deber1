package pa2_u1_cc_ka_deber1.negocio;

public class EntradaService {
    public void realizar(Entrada entrada) {
        System.out.println("Realizada compra de entrada...");
        System.out.println(entrada.getCliente());
        System.out.println(entrada.getPelicula());
        System.out.println(entrada.getTotal());
        System.out.println(entrada.getCorreo());

        MailService mailService = new MailService();

        String asunto = "Confirmacion de compra de entrada";
        String cuerpo = "Estimado " + entrada.getCliente()
                + ", su entrada para la pelicula " + entrada.getPelicula()
                + " por un total de $" + entrada.getTotal()
                + " ha sido confirmada con exito";

        mailService.enviar(entrada.getCorreo(), asunto, cuerpo);
    }
}