package main.exercise3and4;

import main.exercise2.Suit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
    private ArrayList<Card> deck;

    private Deck(ArrayList<Card> deck) {
        this.deck = deck;
    }

    public static Deck createDeckWithoutJokers() {
        ArrayList<Card> cards = new ArrayList<>();
        for (Suit s : Suit.values())
            for (int i = 2; i < 15; i++)
                cards.add(new Card(i, s));
        return new Deck(cards);
    }

    public static Deck createDeckWithJokers() {
        ArrayList<Card> cards = new ArrayList<>();
        for (Suit s : Suit.values())
            for (int i = 2; i < 15; i++)
                cards.add(new Card(i, s));
        cards.add(new Card(15, Suit.CLUBS));
        cards.add(new Card(15, Suit.HEARTS));
        return new Deck(cards);
    }

    public static Card receiveCardFromStandardDeck() {
        Deck deck = createDeckWithoutJokers();
        return deck.deck.get(new Random().nextInt(deck.deck.size()));
    }

    public void shuffle() {
        Collections.shuffle(deck);
    }

    public void sort() {
        Collections.sort(deck);
    }

    public Card dealCard() {
        return deck.remove(0);
    }

    public void returnCard(Card card) {
        if (!deck.contains(card)) deck.add(card);
        else System.out.println("Данная карта уже присутствует в колоде");
    }

    public boolean isEmpty(){
        return deck.isEmpty();
    }

    @Override
    public String toString() {
        return "Deck{" +
                deck +
                '}';
    }
}
