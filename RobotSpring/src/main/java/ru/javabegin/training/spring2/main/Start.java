package ru.javabegin.training.spring2.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.javabegin.training.spring2.impls.robot.ModelT1000;
import ru.javabegin.training.spring2.interfaces.RobotConveyor;

public class Start {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("all_context.xml");
		ModelT1000 t1000 = (ModelT1000) context.getBean("t1000");
		t1000.action();

		RobotConveyor robotConveyor = (RobotConveyor) context.getBean("t1000Conveyor");
		ModelT1000 t10000 = (ModelT1000) robotConveyor.createRobot();
		ModelT1000 t10001 = (ModelT1000) robotConveyor.createRobot();
		ModelT1000 t10002 = (ModelT1000) robotConveyor.createRobot();

		System.out.println(t1000);
		System.out.println(t10001);
		System.out.println(t10002);

		ModelT1000 t1000Replaced = (ModelT1000) context.getBean("t1000Replaced");
		t1000Replaced.action();

	}
}
