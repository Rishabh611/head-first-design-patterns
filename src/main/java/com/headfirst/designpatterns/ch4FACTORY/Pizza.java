package main.java.com.headfirst.designpatterns.ch4FACTORY;

public class Pizza {
    Pizza orderPizza(){
        Pizza pizza = new Pizza();
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    private void prepare(){
        System.out.println("preparing");
    }

    private void bake() {
        System.out.println("Baking");
    }

    private void cut(){
        System.out.println("Cutting");
    }

    private void box() {
        System.out.println("Packing");
    }
}
