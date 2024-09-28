package com.headfirst.designpatterns.ch3DECORATOR;

public abstract class CondimentDecorator extends Beverage{
    Beverage beverage;
    public abstract String getDescription();
}
