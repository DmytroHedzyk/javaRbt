package ru.javabegin.training.spring2.impls.toshiba;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import ru.javabegin.training.spring2.interfaces.Hand;

@Component
@Lazy
public class ToshibaHand implements Hand {
	
	public void catchSomething(){
		System.out.println("Catched from Toshiba!");
	}

}
