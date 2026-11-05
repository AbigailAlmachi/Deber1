package com.edu.ec.taller.interceptors;

import com.edu.ec.taller.Pedido;

import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Sms
@Interceptor
@Priority(Prioridades.SMS)
public class SmsInter {

   @AroundInvoke
    public Object enviarSms(InvocationContext context) throws Exception {

        System.out.println("[Sms] ANTES: preparando envio de SMS...");

        Object resultado = context.proceed();

        Pedido pedido = (Pedido) context.getParameters()[0];
        System.out.println("[Sms] DESPUES: Enviando SMS al telefono: " + pedido.getTelefono());
        System.out.println("[Sms] Mensaje: Su pedido de " + pedido.getProducto() + " fue confirmado");
        System.out.println("[Sms] SMS enviado con exito");

        return resultado;
    }
}