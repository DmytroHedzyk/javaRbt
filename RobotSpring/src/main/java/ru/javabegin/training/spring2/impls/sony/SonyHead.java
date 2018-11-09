package ru.javabegin.training.spring2.impls.sony;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ru.javabegin.training.spring2.interfaces.Head;

@Component
@Qualifier("sonyHead")
@Scope("prototype")
public class SonyHead implements Head {
	
	public void calc(){
		System.out.println("Thinking about Sony...");
	}

}
