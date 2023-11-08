package org.example.stack;

import org.example.model.ShoppingItem;

public class Stack {
    private int capacity;
    private int size;
    private ShoppingItem [] cart;

    public Stack(int capacity){
        this.capacity = capacity;
        this.size = 0;
        this.cart = new ShoppingItem[capacity];
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        return size >= capacity;
    }
}
