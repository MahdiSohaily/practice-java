package com.mahdi;

import java.security.SecureRandom;

public class CardDuck {
    private final Card [] deck;
    private int currentCard;
    private final int NUMBER_OF_CARDS = 52;
    private final SecureRandom randomNumber = new SecureRandom();

    public CardDuck() {
        String[] faces = { "Ace", "Deuce", "Three", "Four", "Five", "Six",
                "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };

        deck = new Card[NUMBER_OF_CARDS];
        currentCard = 0;

        for(int count =0 ; count < deck.length; count +=1) {
            deck[count] = new Card(faces[count % 13], suits[count/13]);
        }
    }
    public void shuffle() {
        for (int first = 0; first < deck.length ; first += 1) {
            int second = randomNumber.nextInt(0, NUMBER_OF_CARDS);
            Card temp = deck [first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    }
    // deal one Card
    public Card dealCard()
    {
        if ( currentCard < deck.length)
            return deck[currentCard++]; // return current Card in array
        else
            return null; // return null to indicate that all Cards were dealt
    }
}
