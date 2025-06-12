package com.pizza.com;

public interface PizzaBuilder {
    void setSize();
    void setDough();
    void setToppings();
    Pizza getPizza();
}