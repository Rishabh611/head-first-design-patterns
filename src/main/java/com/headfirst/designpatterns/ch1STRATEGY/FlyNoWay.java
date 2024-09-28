package com.headfirst.designpatterns.ch1STRATEGY;

public class FlyNoWay implements FlyBehaviour{
    public void fly() {
        System.out.println("No Fly");
    }
}
