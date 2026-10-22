package pa2_u1_cc_ka.negocio;

import io.quarkus.arc.Unremovable;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Singleton;

//@RequestScoped // Delego el control al contenedor ArC
@Singleton 
public class MailService {
    public void enviar(String correo, String asunto, String cuerpo) {
        System.out.println("Enviando correo a: " + correo);
        System.out.println("Asunto: " + asunto);
        System.out.println("Cuerpo: " + cuerpo);
        System.out.println("Correo enviado con exito");
    }
}