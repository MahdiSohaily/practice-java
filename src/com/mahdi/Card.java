package com.mahdi;

public class Card {
    private final String face;
    private final String suite;

    public Card(String face, String suite) {
        this.face = face;
        this.suite = suite;
    }

    public String toString() {
        return face + " of " + suite;
    }
}
