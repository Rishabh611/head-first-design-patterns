package com.headfirst.designpatterns.ch1STRATEGY;

public class MuteQuack implements QuackBehaviour{
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
