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

    public boolean push(ShoppingItem item){
        if(isFull()){
            return false;
        }
        cart[size++] = item;
        return true;
    }

    public boolean pop(){
        if(isEmpty()){
            return false;
        }
        cart[--size] = null;
        return true;
    }

    public void peek(){
        if(isEmpty()){return;}
        ShoppingItem item = cart[size-1];
        System.out.println(cart[size-1].name);
    }

    public void printStack(){
        for (int i = size-1; i >= 0; i--){
            System.out.println(cart[i]);
        }
    }
}


