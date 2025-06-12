package com.pizza.com;

import java.util.List;

public class Pizza {
    private String size;
    private String dough;
    private List<String> toppings;

    public Pizza(String size, String dough, List<String> toppings) {
        this.size = size;
        this.dough = dough;
        this.toppings = toppings;
    }

    public void display() {
        System.out.println("Pizza size: " + size);
        System.out.println("Dough: " + dough);
        System.out.println("Toppings: " + toppings);
    }
}