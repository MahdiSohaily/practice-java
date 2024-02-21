package com.mahdi;

public class DeckOfCardsTest {

    public static void main(String[] args) {
        double x = 1.0;
        double y = 2.0;

        // Get the floating-point number adjacent to x in the direction of y
        double result = Math.nextAfter(x, y);

        System.out.println("Next after " + x + " in the direction of " + y + " is: " + result);
    }
}
