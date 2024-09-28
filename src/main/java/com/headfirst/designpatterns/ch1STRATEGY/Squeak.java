package com.headfirst.designpatterns.ch1STRATEGY;

public class Squeak implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
