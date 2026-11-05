package com.edu.ec.taller.interceptors;

import java.lang.annotation.*;
import jakarta.interceptor.InterceptorBinding;

@InterceptorBinding //indica que es un interceptor
@Retention(RetentionPolicy.RUNTIME)  //indica que la anotacion se mantiene en tiempo de ejecucion
@Target ({ElementType.TYPE, ElementType.METHOD})
public @interface  MedirTiempo {
    
}
