package main.exercise3and4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Deck deck = Deck.createDeckWithJokers();
        Card[] cards = new Card[]{deck.dealCard(), deck.dealCard(), deck.dealCard()};
        System.out.println(Arrays.toString(cards));
        deck.returnCard(cards[0]);
        deck.returnCard(cards[2]);
        deck.returnCard(cards[0]);
        deck.returnCard(cards[0]);
        System.out.println(deck);
        deck.shuffle();
        System.out.println(deck);
        deck.sort();
        System.out.println(deck);
        while (!deck.isEmpty()) {
            deck.dealCard();
        }
        System.out.println(deck);
    }
}
