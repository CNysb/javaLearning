package com.JavaSpringLearning.Service.Impl;

import org.springframework.aop.support.DelegatingIntroductionInterceptor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class StarProxy{
    public static SuperStar createProxy(SuperStar superStar){
        SuperStar start = (SuperStar) Proxy.newProxyInstance(
                StarProxy.class.getClassLoader(),
                superStar.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if ("sing".equals(method.getName())){
                            System.out.println("agent get 1m");
                        } else if ("dance".equals(method.getName())){
                            System.out.println("agent get 2m");
                        }
                        Object res = method.invoke(superStar,args);
                        return res;
                    }
                }
        );
                return start;
    }
}
