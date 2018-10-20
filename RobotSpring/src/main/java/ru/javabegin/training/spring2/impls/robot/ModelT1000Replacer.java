package ru.javabegin.training.spring2.impls.robot;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

public class ModelT1000Replacer implements MethodReplacer {
    @Override
    public Object reimplement(Object o, Method method, Object[] objects) {
        System.out.println("Method is replaced");
        return o;
    }
}
