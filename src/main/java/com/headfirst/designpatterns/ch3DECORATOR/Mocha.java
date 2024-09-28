package com.headfirst.designpatterns.ch3DECORATOR;

public class Mocha extends CondimentDecorator{
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public double cost() {
        if (beverage.size == Size.TALL){
            return beverage.cost() + 0.20;
        } else if (beverage.size == Size.GRANDE){
            return beverage.cost() + 0.40;
        } else{
            return beverage.cost() + 0.60;
        }
    }
}
