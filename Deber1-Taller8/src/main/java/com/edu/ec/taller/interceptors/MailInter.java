package com.edu.ec.taller.interceptors;

import com.edu.ec.taller.Pedido;

import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Mail
@Interceptor
@Priority(Prioridades.MAIL)

public class MailInter {

     @AroundInvoke
    public Object enviarCorreo(InvocationContext context) throws Exception {

        System.out.println("[Mail] ANTES: preparando envio de correo...");

        Object resultado = context.proceed();

        Pedido pedido = (Pedido) context.getParameters()[0];
        System.out.println("[Mail] DESPUES: Enviando correo a: " + pedido.getCorreo());
        System.out.println("[Mail] Asunto: Confirmacion de pedido");
        System.out.println("[Mail] Correo enviado con exito");

        return resultado;
    }
}