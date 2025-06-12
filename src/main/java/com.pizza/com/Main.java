package com.pizza.com;

public class Main {
    public static void main(String[] args) {
        PizzaBuilder builder = new HawaiianPizzaBuilder();
        MasterPizza chef = new MasterPizza(builder);
        chef.makePizza();

        Pizza pizza = builder.getPizza();
        pizza.display();
    }
}