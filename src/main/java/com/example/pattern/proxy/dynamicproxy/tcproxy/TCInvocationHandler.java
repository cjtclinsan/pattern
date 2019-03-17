package com.example.pattern.tcproxy;

import java.lang.reflect.Method;

public interface TCInvocationHandler {

    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable;
}
