package com.pizza.com;

import java.util.Arrays;

public class HawaiianPizzaBuilder implements PizzaBuilder {
    private String size;
    private String dough;
    private java.util.List<String> toppings;

    @Override
    public void setSize() {
        this.size = "Large";
    }

    @Override
    public void setDough() {
        this.dough = "Thick";
    }

    @Override
    public void setToppings() {
        this.toppings = Arrays.asList("Ham", "Pineapple");
    }

    @Override
    public Pizza getPizza() {
        return new Pizza(size, dough, toppings);
    }
}