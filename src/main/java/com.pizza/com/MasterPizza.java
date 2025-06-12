package com.pizza.com;

public class MasterPizza {
    private PizzaBuilder builder;

    public MasterPizza(PizzaBuilder builder) {
        this.builder = builder;
    }

    public void makePizza() {
        builder.setSize();
        builder.setDough();
        builder.setToppings();
    }
}
