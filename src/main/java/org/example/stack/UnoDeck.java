package org.example.stack;

import org.example.model.UnoCards;

public class UnoDeck {
    private int capacity;
    private int size;
    private UnoCards[] deck;

    public UnoDeck(int capacity){
        this.capacity = capacity;
        this.size = 0;
        this.deck = new UnoCards[capacity];
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        return size >= capacity;
    }

    public boolean push(UnoCards card){
        if(isFull()){
            return false;
        }
        deck[size++] = card;
        return true;
    }

    public UnoCards pop(){
        if(isEmpty()){
            return null;
        }
        UnoCards card = deck[size-1];
        deck[--size] = null;
        return card;
    }

    public void peek(){
        if(isEmpty()){return;}
        UnoCards item = deck[size-1];
        System.out.println(deck[size-1]);
    }
}
