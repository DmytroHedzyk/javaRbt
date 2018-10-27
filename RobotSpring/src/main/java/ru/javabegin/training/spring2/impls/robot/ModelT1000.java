package ru.javabegin.training.spring2.impls.robot;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ru.javabegin.training.spring2.interfaces.Robot;
import ru.javabegin.training.spring2.interfaces.Hand;
import ru.javabegin.training.spring2.interfaces.Head;
import ru.javabegin.training.spring2.interfaces.Leg;

@Component
public class ModelT1000 extends BaseModel implements InitializingBean, DisposableBean {


	private String color;
	private int year;
	private boolean soundEnabled;

	@Autowired
	private Hand hand;
	@Autowired
	private Head head;
	@Autowired
	private Leg leg;

	public ModelT1000() {
	}

	public ModelT1000(Hand hand, Leg leg, Head head, String color, int year, boolean soundEnabled) {
		super(hand, leg, head);
		this.color = color;
		this.year = year;
		this.soundEnabled = soundEnabled;
	}

    public ModelT1000(String color, int year, boolean soundEnabled) {
        this.color = color;
        this.year = year;
        this.soundEnabled = soundEnabled;
    }

    @Bean
	@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public ModelT1000 model1(){
		return new ModelT1000();
	}

	@Override
	public Hand getHand() {
		return hand;
	}

	@Override
	public void setHand(Hand hand) {
		this.hand = hand;
	}

	@Override
	public Head getHead() {
		return head;
	}

	@Override
	public void setHead(Head head) {
		this.head = head;
	}

	@Override
	public Leg getLeg() {
		return leg;
	}

	@Override
	public void setLeg(Leg leg) {
		this.leg = leg;
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
		super.getHead().calc();
		super.getHand().catchSomething();
		super.getLeg().go();
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
	public void destroy() {
		System.out.println(this + " object destroyed.");
	}

	@Override
	public void afterPropertiesSet(){
		System.out.println(this + " afterPropertiesSet()");
	}
}
