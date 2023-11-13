package org.example;

import org.example.model.ShoppingItem;
import org.example.model.UnoCards;
import org.example.stack.Stack;
import org.example.stack.UnoDeck;

import java.util.Collection;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {
//        Stack cart = new Stack(5);
//
//        cart.push(new ShoppingItem("pizza", 14.99));
//        cart.push(new ShoppingItem("hotdog", 4.99));
//        cart.push(new ShoppingItem("pancake", 9.99));
//        cart.push(new ShoppingItem("coffee", 2.99));
//        cart.push(new ShoppingItem("egusi", 78.99));
//        cart.push(new ShoppingItem("waffle", 7.99));

     //  cart.pop();


       //cart.printStack();
       //cart.peek();

        UnoDeck deck = new UnoDeck(108);


        deck.push(new UnoCards("number","red",0));
        deck.push(new UnoCards("number","red",1));
        deck.push(new UnoCards("number","red",1));
        deck.push(new UnoCards("number","red",2));
        deck.push(new UnoCards("number","red",2));
        deck.push(new UnoCards("number","red",3));
        deck.push(new UnoCards("number","red",3));
        deck.push(new UnoCards("number","red",4));
        deck.push(new UnoCards("number","red",4));
        deck.push(new UnoCards("number","red",5));
        deck.push(new UnoCards("number","red",5));
        deck.push(new UnoCards("number","red",6));
        deck.push(new UnoCards("number","red",6));
        deck.push(new UnoCards("number","red",7));
        deck.push(new UnoCards("number","red",7));
        deck.push(new UnoCards("number","red",8));
        deck.push(new UnoCards("number","red",8));
        deck.push(new UnoCards("number","red",9));
        deck.push(new UnoCards("number","red",9));

        deck.push(new UnoCards("number","blue",0));
        deck.push(new UnoCards("number","blue",1));
        deck.push(new UnoCards("number","blue",1));
        deck.push(new UnoCards("number","blue",2));
        deck.push(new UnoCards("number","blue",2));
        deck.push(new UnoCards("number","blue",3));
        deck.push(new UnoCards("number","blue",3));
        deck.push(new UnoCards("number","blue",4));
        deck.push(new UnoCards("number","blue",4));
        deck.push(new UnoCards("number","blue",5));
        deck.push(new UnoCards("number","blue",5));
        deck.push(new UnoCards("number","blue",6));
        deck.push(new UnoCards("number","blue",6));
        deck.push(new UnoCards("number","blue",7));
        deck.push(new UnoCards("number","blue",7));
        deck.push(new UnoCards("number","blue",8));
        deck.push(new UnoCards("number","blue",8));
        deck.push(new UnoCards("number","blue",9));
        deck.push(new UnoCards("number","blue",9));

        deck.push(new UnoCards("number","green",0));
        deck.push(new UnoCards("number","green",1));
        deck.push(new UnoCards("number","green",1));
        deck.push(new UnoCards("number","green",2));
        deck.push(new UnoCards("number","green",2));
        deck.push(new UnoCards("number","green",3));
        deck.push(new UnoCards("number","green",3));
        deck.push(new UnoCards("number","green",4));
        deck.push(new UnoCards("number","green",4));
        deck.push(new UnoCards("number","green",5));
        deck.push(new UnoCards("number","green",5));
        deck.push(new UnoCards("number","green",6));
        deck.push(new UnoCards("number","green",6));
        deck.push(new UnoCards("number","green",7));
        deck.push(new UnoCards("number","green",7));
        deck.push(new UnoCards("number","green",8));
        deck.push(new UnoCards("number","green",8));
        deck.push(new UnoCards("number","green",9));
        deck.push(new UnoCards("number","green",9));

        deck.push(new UnoCards("number","yellow",0));
        deck.push(new UnoCards("number","yellow",1));
        deck.push(new UnoCards("number","yellow",1));
        deck.push(new UnoCards("number","yellow",2));
        deck.push(new UnoCards("number","yellow",2));
        deck.push(new UnoCards("number","yellow",3));
        deck.push(new UnoCards("number","yellow",3));
        deck.push(new UnoCards("number","yellow",4));
        deck.push(new UnoCards("number","yellow",4));
        deck.push(new UnoCards("number","yellow",5));
        deck.push(new UnoCards("number","yellow",5));
        deck.push(new UnoCards("number","yellow",6));
        deck.push(new UnoCards("number","yellow",6));
        deck.push(new UnoCards("number","yellow",7));
        deck.push(new UnoCards("number","yellow",7));
        deck.push(new UnoCards("number","yellow",8));
        deck.push(new UnoCards("number","yellow",8));
        deck.push(new UnoCards("number","yellow",9));
        deck.push(new UnoCards("number","yellow",9));

        deck.push(new UnoCards("skip","yellow",0));
        deck.push(new UnoCards("skip","yellow",1));

        deck.push(new UnoCards("skip","green",0));
        deck.push(new UnoCards("skip","green",1));

        deck.push(new UnoCards("skip","blue",0));
        deck.push(new UnoCards("skip","blue",1));

        deck.push(new UnoCards("skip","red",0));
        deck.push(new UnoCards("skip","red",1));

        deck.push(new UnoCards("reverse","green",0));
        deck.push(new UnoCards("reverse","green",1));

        deck.push(new UnoCards("reverse","yellow",0));
        deck.push(new UnoCards("reverse","yellow",1));

        deck.push(new UnoCards("reverse","red",0));
        deck.push(new UnoCards("reverse","red",1));

        deck.push(new UnoCards("reverse","blue",0));
        deck.push(new UnoCards("reverse","blue",1));

        deck.push(new UnoCards("wild card","black",0));
        deck.push(new UnoCards("wild card","black",1));
        deck.push(new UnoCards("wild card","black",2));
        deck.push(new UnoCards("wild card","black",3));

        deck.push(new UnoCards("wild draw 4","black",0));
        deck.push(new UnoCards("wild draw 4","black",1));
        deck.push(new UnoCards("wild draw 4","black",2));
        deck.push(new UnoCards("wild draw 4","black",3));

        //Collections.shuffle(deck);










    }
}