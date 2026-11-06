package com.edu.ec.taller.interceptors;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

import jakarta.interceptor.*;

@InterceptorBinding
@Retention (RetentionPolicy.RUNTIME)
@Target ({ElementType.TYPE, ElementType.METHOD})    
public @interface Whatsapp {
    
}
