package ru.javabegin.training.spring2.impls.pool;

import ru.javabegin.training.spring2.interfaces.Robot;
import ru.javabegin.training.spring2.interfaces.RobotPool;

import java.util.Collection;

public class T1000Pool implements RobotPool {

    private Collection<Robot> robotCollection;

    public T1000Pool() {
    }

    public T1000Pool(Collection<Robot> robotCollection) {
        this.robotCollection = robotCollection;
    }

    @Override
    public Collection<Robot> getRobotCollection() {
        return robotCollection;
    }

    public void setRobotCollection(Collection<Robot> robotCollection) {
        this.robotCollection = robotCollection;
    }

    public void action(){
        for (Robot robot : robotCollection)
            robot.action();
    }
}
