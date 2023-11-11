package org.example.stack;

import org.example.model.ShoppingItem;

public class UnoDeck {
    private int capacity;
    private int size;
    private UnoDeck[] deck;

    public UnoDeck(int capacity){
        this.capacity = capacity;
        this.size = 0;
        this.deck = new UnoDeck[capacity];
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        return size >= capacity;
    }

    public boolean push(UnoDeck card){
        if(isFull()){
            return false;
        }
        deck[size++] = card;
        return true;
    }

    public UnoDeck pop(){
        if(isEmpty()){
            return null;
        }
        UnoDeck card = deck[size-1];
        deck[--size] = null;
        return card;
    }

    public void peek(){
        if(isEmpty()){return;}
        UnoDeck item = deck[size-1];
        System.out.println(deck[size-1]);
    }
}
