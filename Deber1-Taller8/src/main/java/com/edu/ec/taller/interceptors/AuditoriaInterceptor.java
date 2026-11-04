package com.edu.ec.taller.interceptors;

import com.edu.ec.taller.AuditoriaService;
import com.edu.ec.taller.Pedido;
import jakarta.annotation.Priority;
import jakarta.inject.Inject;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;
import java.lang.reflect.Parameter;

// 2da parte: el interceptor se asocia a la anotación @Auditoria
@Auditoria
@Interceptor
@Priority(Interceptor.Priority.APPLICATION) // necesario en Quarkus para activar el interceptor
public class AuditoriaInterceptor {

    @Inject
    private AuditoriaService auditoriaService;

    @AroundInvoke
    public Object interceptar(InvocationContext context) throws Exception {

        String nombreMetodo = context.getMethod().getName();
        System.out.println("Auditoria: Se está ejecutando el método: " + nombreMetodo);
        System.out.println("Ejecuto todo lo que quiero que haga el interceptor");

        Parameter[] parametros = context.getMethod().getParameters();
        for (Parameter parametro : parametros) {
            System.out.println("Parámetro: " + parametro.getName());
        }

        Object[] valores = context.getParameters();
        Pedido pedido = (Pedido) valores[0];
        
        String cliente = pedido.getCliente();
        double total = pedido.getTotal();
        String correo = pedido.getCorreo();

        this.auditoriaService.guardarEnLaBaseDeDatos(cliente, total, correo);

        // Todo lo que está arriba se ejecuta antes de que se ejecute el método interceptado
        Object resultado = context.proceed(); // ejecuta el método interceptado

        System.out.println("Mensaje luego de que se ejecuta el método interceptado");
        return resultado;
    }
}