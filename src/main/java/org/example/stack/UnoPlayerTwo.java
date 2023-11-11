package org.example.stack;

public class UnoPlayerTwo {
    private int capacity;
    private int size;
    private UnoPlayerTwo[] hand;

    public void isUno(){
        if(size == 1){
            System.out.println("UNO!");
        }
    }

    public void isEmpty(){
        if(size == 0){
            System.out.println("UNO OUT!");
        }
    }

    public boolean isFull(){
        return size >= capacity;
    }
}
