package ru.javabegin.training.spring2.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.javabegin.training.spring2.impls.pool.T1000Map;
import ru.javabegin.training.spring2.impls.pool.T1000Pool;
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

		T1000Pool t1000Pool = (T1000Pool) context.getBean("t1000Pool");
		t1000Pool.action();

		T1000Map t1000Map = (T1000Map) context.getBean("t1000Map");
		t1000Map.action();

		T1000Pool t1000GoldenPool = (T1000Pool) context.getBean("t1000GoldenPool");
		t1000GoldenPool.action();
        System.out.println("t1000GoldenPool has " + t1000GoldenPool.getRobotCollection().size() + " elements.");

	}
}
