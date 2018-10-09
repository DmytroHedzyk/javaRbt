package ru.javabegin.training.spring3.spring2.impls.robot;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import ru.javabegin.training.spring3.spring2.interfaces.Hand;
import ru.javabegin.training.spring3.spring2.interfaces.Head;
import ru.javabegin.training.spring3.spring2.interfaces.Leg;
import ru.javabegin.training.spring3.spring2.interfaces.Robot;

public class ModelT1000 extends BaseRobot implements InitializingBean, DisposableBean {

	private Hand hand;
	private Leg leg;
	private Head head;

	private String color;
	private int year;
	private boolean soundEnabled;


	public ModelT1000() {
	}

	public ModelT1000(Hand hand, Leg leg, Head head) {
		super();
		this.hand = hand;
		this.leg = leg;
		this.head = head;
	}

	public ModelT1000(Hand hand, Leg leg, Head head, String color, int year, boolean soundEnabled) {
		this.hand = hand;
		this.leg = leg;
		this.head = head;
		this.color = color;
		this.year = year;
		this.soundEnabled = soundEnabled;
	}

    public ModelT1000(String color, int year, boolean soundEnabled) {
        this.color = color;
        this.year = year;
        this.soundEnabled = soundEnabled;
    }

    public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public boolean isSoundEnabled() {
		return soundEnabled;
	}

	public void setSoundEnabled(boolean soundEnabled) {
		this.soundEnabled = soundEnabled;
	}

	@Override
	public void action() {
		head.calc();
		hand.catchSomething();
		leg.go();
        System.out.println("color: " + color);
        System.out.println("year: " + year);
        System.out.println("can play sound: " + soundEnabled);
	}

	@Override
	public void dance() {
		System.out.println("T1000 is dancing!");
	}


	public void initObject(){
		System.out.println("Object " + this.toString() + " initialized.");
	}

	public void destroyObject(){
		System.out.println("Object " + this.toString() + " destroyed.");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Bean " + this.toString() + " destroyed.");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Bean " + this.toString() + " created. AfterPropertiesSet");
	}
}
