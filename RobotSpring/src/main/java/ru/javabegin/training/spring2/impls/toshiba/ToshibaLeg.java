package ru.javabegin.training.spring2.impls.toshiba;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import ru.javabegin.training.spring2.interfaces.Leg;

@Component
@Lazy
public class ToshibaLeg implements Leg {
	
	public void go(){
		System.out.println("Go to Toshiba!");
	}

}
