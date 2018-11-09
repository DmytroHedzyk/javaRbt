package ru.javabegin.training.spring2.impls.toshiba;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ru.javabegin.training.spring2.interfaces.Hand;

@Component
@Lazy
@Qualifier("toshibaHand")
@Scope("prototype")
public class ToshibaHand implements Hand {
	
	public void catchSomething(){
		System.out.println("Catched from Toshiba!");
	}

}
