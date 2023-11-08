package org.example.model;

public class ShoppingItem {
    public String name;

    public double price;

    public ShoppingItem(String name, double price){
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "ShoppingItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
