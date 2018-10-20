package ru.javabegin.training.spring2.impls.pool;

import ru.javabegin.training.spring2.interfaces.Robot;
import ru.javabegin.training.spring2.interfaces.RobotMap;

import java.util.Map;

public class T1000Map implements RobotMap {

    private Map<Integer, Robot> robotMap;

    public T1000Map(Map<Integer, Robot> robotMap) {
        this.robotMap = robotMap;
    }

    @Override
    public Map<Integer, Robot> getRobotMap() {
        return robotMap;
    }

    public void setRobotMap(Map<Integer, Robot> robotMap) {
        this.robotMap = robotMap;
    }

    public void action(){
        for (Robot robot : robotMap.values())
            robot.action();
    }
}
