package com.edu.ec.taller.interceptors;

import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Whatsapp 
@Interceptor 
@Priority (Prioridades.WHATSAPP)
public class WhatsaapInter {
    
    @AroundInvoke 
    public Object enviarMensaje(InvocationContext context) throws Exception {

        System.out.println("[Whatsapp] ANTES: enviando mensaje de Whatsapp...");
        Object resultado = context.proceed();
        System.out.println("[Whatsapp] DESPUES: mensaje enviado correctamente");
        return resultado;
    }
}
