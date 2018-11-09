package ru.javabegin.training.spring2.config;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.javabegin.training.spring2.impls.robot.ModelT1000;
import ru.javabegin.training.spring2.interfaces.Hand;
import ru.javabegin.training.spring2.interfaces.Head;
import ru.javabegin.training.spring2.interfaces.Leg;

@Configuration
public class Config {

    @Bean(name = "t1000A1")
    @Qualifier(value = "t1000A1")
    public ModelT1000 getModelT1000A1(@Qualifier("sonyLeg") Leg leg, @Qualifier("toshibaHand") Hand hand,
                                      @Qualifier("sonyHead") Head head){
        return new ModelT1000(hand, leg, head);
    }

}
