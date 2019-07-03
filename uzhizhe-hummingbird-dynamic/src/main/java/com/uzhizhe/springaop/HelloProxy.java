package com.uzhizhe.springaop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author qingjiang.li
 * @since 2019-07-03 11:05 AM
 */
public class HelloProxy implements InvocationHandler {

    private Object target;

    public Object bind(Object target) {
        this.target = target;
        return Proxy.newProxyInstance(this.target.getClass().getClassLoader(), this.target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        System.out.println("logger start ...");
        result = method.invoke(this.target, args);
        System.out.println("logger end ...");
        return result;
    }
}
