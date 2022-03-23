package main.exercise2;

public class CardC {
    static int[] maxRank = new int[]{1, 1, 1, 1};
    private final int rank;
    private final Suit suit;

    public CardC(int rank, Suit suit) {
        this.rank = rank;
        if (maxRank[suit.ordinal()] < this.rank) maxRank[suit.ordinal()] = this.rank;
        this.suit = suit;
    }

    public CardC(Suit suit) {
        this.rank = ++maxRank[suit.ordinal()];
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }
}