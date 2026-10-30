package uce.edu.ka.taller.PrestamodeLibros.interceptors;

import java.lang.reflect.Parameter;

import jakarta.inject.Inject;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;
import uce.edu.ka.taller.PrestamodeLibros.Prestamo;

@Registro
@Interceptor
public class RegistroInterceptor {

    @Inject
    private RegistroService registroService;

    @AroundInvoke
    public Object interceptar(InvocationContext context) throws Exception {

        // Ejecuta el metodo interceptado
        Object resultado = context.proceed();

        System.out.println("Retorno: " + resultado);

        String nombreMetodo = context.getMethod().getName();
        System.out.println("Registro: Se esta ejecutando el metodo " + nombreMetodo);
        System.out.println("Ejecuto todo lo que quiero que haga el interceptor.");

        Parameter[] parametros = context.getMethod().getParameters();
        for (Parameter parametro : parametros) {
            System.out.println("Parametro: " + parametro.getName());
        }

        Object[] valores = context.getParameters();

        Prestamo prestamo = (Prestamo) valores[0];

        String usuario = prestamo.getUsuario();
        double dias = prestamo.getDias();
        String correo = prestamo.getCorreo();

        this.registroService.guardarEnlaBase(usuario, dias, correo);
        System.out.println("Mensaje luego de que se ejecuta el metodo interceptado");
        return resultado;
    }
}