package main.exercise2;

public class CardB {
    private final int rank;
    private final Suit suit;

    public CardB(int rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }
}

