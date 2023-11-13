package org.example.model;

import java.util.Arrays;

public class UnoCards {
    public String cardType;
    public String cardColor;
    public int cardVal;

    public UnoCards(String cardType, String cardColor, int cardVal){
        this.cardType = cardType;
        this.cardColor = cardColor;
        this.cardVal = cardVal;
    }

    @Override
    public String toString() {
        return "UnoCards{" +
                "cardType='" + cardType + '\'' +
                ", cardColor='" + cardColor + '\'' +
                ", cardVal=" + cardVal +
                '}';
    }
}
