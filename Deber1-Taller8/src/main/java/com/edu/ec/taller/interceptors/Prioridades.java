package com.edu.ec.taller.interceptors;

import jakarta.interceptor.Interceptor;

public interface Prioridades {

    int MEDIR_TIEMPO = Interceptor.Priority.LIBRARY_AFTER;
    int AUDITORIA    = Interceptor.Priority.LIBRARY_AFTER + 1;
    int SMS          = Interceptor.Priority.LIBRARY_AFTER + 2;
    int MAIL         = Interceptor.Priority.LIBRARY_AFTER + 3;
}