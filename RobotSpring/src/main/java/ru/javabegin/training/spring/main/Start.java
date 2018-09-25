package ru.javabegin.training.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ru.javabegin.training.spring.impls.robot.ModelT1000;

public class Start {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		ModelT1000 t1000 = (ModelT1000) context.getBean("t1000");
		t1000.action();

		System.out.println();

		ModelT1000 t1000Empty = (ModelT1000) context.getBean("t1000Empty");
		t1000Empty.action();

		System.out.println();

		ModelT1000 t1000C = (ModelT1000) context.getBean("t1000C");
		t1000C.action();

		ModelT1000 t1000C2 = (ModelT1000) context.getBean("t1000C2");
		t1000C2.action();
	}
}
