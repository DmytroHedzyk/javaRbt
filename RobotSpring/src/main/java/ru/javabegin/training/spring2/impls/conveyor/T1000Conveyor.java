package ru.javabegin.training.spring2.impls.conveyor;

import ru.javabegin.training.spring2.interfaces.Robot;
import ru.javabegin.training.spring2.interfaces.RobotConveyor;

public abstract class T1000Conveyor implements RobotConveyor {
    @Override
    public abstract Robot createRobot();
}
