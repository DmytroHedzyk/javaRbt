package ru.javabegin.training.spring2.impls.robot;

import ru.javabegin.training.spring2.interfaces.Hand;
import ru.javabegin.training.spring2.interfaces.Head;
import ru.javabegin.training.spring2.interfaces.Leg;
import ru.javabegin.training.spring2.interfaces.Robot;

public abstract class BaseModel implements Robot {
    private Hand hand;
    private Leg leg;
    private Head head;

    public BaseModel() {
        System.out.println(this + " - ModelBase constructor");
    }

    public BaseModel(Hand hand, Leg leg, Head head) {
        this();
        this.hand = hand;
        this.leg = leg;
        this.head = head;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }
}
