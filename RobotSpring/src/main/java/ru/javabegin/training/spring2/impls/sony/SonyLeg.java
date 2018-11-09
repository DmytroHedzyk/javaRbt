package ru.javabegin.training.spring2.impls.sony;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ru.javabegin.training.spring2.interfaces.Leg;

@Component
@Qualifier("sonyLeg")
@Scope("prototype")
public class SonyLeg implements Leg {
	
	public void go(){
		System.out.println("Go to Sony!");
	}

}
