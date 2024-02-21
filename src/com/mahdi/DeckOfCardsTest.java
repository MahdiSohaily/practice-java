package com.mahdi;

import java.util.Arrays;

public class DeckOfCardsTest {

    public static void main(String[] args) {
        System.out.println("Mahdi".endsWith("i"));
        System.out.println("Mahdi".equals("mahdi"));
        System.out.println(String.format("Mahdi %d", 3));

        System.out.println("Mahdi Rezaei Rezaei".replaceFirst("Rezaei","Sohaily" ));
        System.out.println(Arrays.toString("Mahdi Rezaei Sohaily".split(" ")));

    }
}
