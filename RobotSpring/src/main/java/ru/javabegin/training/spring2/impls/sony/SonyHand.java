package ru.javabegin.training.spring2.impls.sony;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ru.javabegin.training.spring2.interfaces.Hand;

@Component
@Qualifier(value = "sonyHand")
@Scope("prototype")
public class SonyHand implements Hand {
	
	public void catchSomething(){
		System.out.println("Catched from Sony!!");
	}

}
