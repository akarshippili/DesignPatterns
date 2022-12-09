package com.akarsh.designpatterns.Iterator;

public class MenuItem {

    private String name;
    private String description;
    private Float amount;

    private boolean vegan;

    public MenuItem(String name, String description, Float amount, boolean vegan) {
        this.name = name;
        this.description = description;
        this.amount = amount;
        this.vegan = vegan;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Float getAmount() {
        return amount;
    }

    public boolean isVegan() {
        return vegan;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", amount=" + amount +
                ", vegan=" + vegan +
                '}';
    }
}
