package com.headfirst.designpatterns.ch3DECORATOR;

public class HouseBlend extends Beverage{
    public HouseBlend () {
        description = "House blend coffee";
    }

    public double cost() {
        return .89;
    }
}
