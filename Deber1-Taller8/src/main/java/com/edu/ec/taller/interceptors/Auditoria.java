package com.edu.ec.taller.interceptors;

import java.lang.annotation.*;
import jakarta.interceptor.InterceptorBinding;

//1era parte de la creacion de un interceptor, se crea una anotacion para poder usarla en los metodos que se quieren interceptar
@InterceptorBinding //indica que es un interceptor
@Retention(RetentionPolicy.RUNTIME)  //indica que la anotacion se mantiene en tiempo de ejecucion
@Target ({ElementType.TYPE, ElementType.METHOD})  //indica que la anotacion se puede aplicar a clases y metodos
public @interface Auditoria {


}
