package ru.javabegin.training.springh1.impls;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import ru.javabegin.training.spring.impls.robot.ModelT1000;
import ru.javabegin.training.spring.interfaces.Hand;
import ru.javabegin.training.spring.interfaces.Head;
import ru.javabegin.training.spring.interfaces.Leg;

public class ModelT1000h1 extends ModelT1000 implements InitializingBean, DisposableBean {

    public ModelT1000h1() {
    }

    public ModelT1000h1(Hand hand, Leg leg, Head head) {
        super(hand, leg, head);
    }

    public ModelT1000h1(Hand hand, Leg leg, Head head, String color, int year, boolean soundEnabled) {
        super(hand, leg, head, color, year, soundEnabled);
    }

    public ModelT1000h1(String color, int year, boolean soundEnabled) {
        super(color, year, soundEnabled);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Bean " + this.toString() + " destroyed.");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean " + this.toString() + " created.");
    }
}
