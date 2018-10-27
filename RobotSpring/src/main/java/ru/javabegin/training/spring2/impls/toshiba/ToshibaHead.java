package ru.javabegin.training.spring2.impls.toshiba;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import ru.javabegin.training.spring2.interfaces.Head;

@Component
@Lazy
public class ToshibaHead implements Head {
	
	public void calc(){
		System.out.println("Thinking about Toshiba...");
	}

}
