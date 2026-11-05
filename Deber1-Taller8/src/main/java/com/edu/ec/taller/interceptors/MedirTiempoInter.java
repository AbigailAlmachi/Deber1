package com.edu.ec.taller.interceptors;

import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@MedirTiempo 
@Interceptor 
@Priority(Prioridades.MEDIR_TIEMPO)
public class MedirTiempoInter {

     @AroundInvoke
    public Object medir(InvocationContext context) throws Exception {

        long inicio = System.currentTimeMillis();
        System.out.println("[MedirTiempo] ANTES: iniciando medicion...");

        Object resultado = context.proceed();

        long fin = System.currentTimeMillis() - inicio;
        System.out.println("[MedirTiempo] DESPUES: tiempo total = " + fin + " ms");

        return resultado;
    }
}
