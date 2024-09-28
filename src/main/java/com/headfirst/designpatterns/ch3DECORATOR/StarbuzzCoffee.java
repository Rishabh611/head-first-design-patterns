package com.headfirst.designpatterns.ch3DECORATOR;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();

        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        beverage.setSize(Beverage.Size.GRANDE);
        
        beverage = new Mocha(beverage);


        System.out.println(beverage.getDescription() + " $" + beverage.cost());
    }
}
