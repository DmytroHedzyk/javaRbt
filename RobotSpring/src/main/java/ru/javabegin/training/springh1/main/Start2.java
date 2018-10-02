package ru.javabegin.training.springh1.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.javabegin.training.springh1.impls.ModelT1000h1;

public class Start2 {
    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext2.xml");
        ModelT1000h1 t1000h1 = (ModelT1000h1) applicationContext.getBean("t1000h1");
    }
}
