package com.edu.ec.taller.interceptors;

import java.time.LocalDateTime;

import com.edu.ec.taller.Pedido;

import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Auditoria
@Interceptor
@Priority(Prioridades.AUDITORIA)
public class AuditoriaInterceptor {

    @AroundInvoke
    public Object auditar(InvocationContext context) throws Exception {

        // ANTES del método
        System.out.println("[Auditoria] ANTES: Se está ejecutando el método: " + context.getMethod().getName());
        System.out.println("[Auditoria] Ejecuto todo lo que quiero que haga el interceptor");
        System.out.println("[Auditoria] Parámetro: " + context.getMethod().getParameters()[0].getName());

        Pedido pedido = (Pedido) context.getParameters()[0];
        System.out.println("[Auditoria] Guardando en la base de datos la auditoria: "
                + pedido.getCliente() + ", " + pedido.getTotal() + ", " + pedido.getCorreo());
        System.out.println("[Auditoria] Con fecha y hora: " + LocalDateTime.now());

        // Ejecuta el método interceptado
        Object resultado = context.proceed();

        // DESPUES del método
        System.out.println("[Auditoria] DESPUES: Mensaje luego de que se ejecuta el método interceptado");

        return resultado;
    }
}