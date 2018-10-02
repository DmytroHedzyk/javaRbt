package ru.javabegin.training.spring2.impls.toshiba;

import ru.javabegin.training.spring2.interfaces.Hand;

public class ToshibaHand implements Hand {
	
	public void catchSomething(){
		System.out.println("Catched from Toshiba!");
	}

}
