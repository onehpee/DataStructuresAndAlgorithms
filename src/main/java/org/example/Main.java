package org.example;

import org.example.model.ShoppingItem;
import org.example.stack.Stack;


public class Main {
    public static void main(String[] args) {
        Stack cart = new Stack(5);

        cart.push(new ShoppingItem("pizza", 14.99));
        cart.push(new ShoppingItem("hotdog", 4.99));
        cart.push(new ShoppingItem("pancake", 9.99));
        cart.push(new ShoppingItem("coffee", 2.99));
        cart.push(new ShoppingItem("egusi", 78.99));
        cart.push(new ShoppingItem("waffle", 7.99));

     //  cart.pop();


       //cart.printStack();
        cart.peek();




    }
}