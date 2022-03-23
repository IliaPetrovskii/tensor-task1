package main.exercise3and4;

import main.exercise2.Suit;

import java.util.Objects;

public class Card implements Comparable<Card>{
    private final int rank;
    private final Suit suit;

    public Card(int rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public boolean checkStandardDeck() {
        if (2 <= rank && rank <= 14) return true;
        else return rank == 15 && (suit == Suit.CLUBS || suit == Suit.HEARTS);
    }

    public boolean checkIsStronger(Card card) {
        return suit == card.getSuit() && rank > card.getRank();
    }

    public static int compare(Card firstCard, Card secondCard){
        return firstCard.compareTo(secondCard);
    }

    @Override
    public String toString() {
        String str;
        switch (rank) {
            case 11:
                str = "Jack";
                break;
            case 12:
                str = "Queen";
                break;
            case 13:
                str = "King";
                break;
            case 14:
                str = "Ace";
                break;
            case 15:
                if (suit == Suit.CLUBS) return "Black Joker";
                else if (suit == Suit.HEARTS) return "Colored Joker";
                else str = String.valueOf(rank);
                break;
            default:
                str = String.valueOf(rank);
                break;
        }
        return str + " of " + suit.name();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (this == obj)
            return true;
        if (!(obj instanceof Card))
            return false;
        Card card = (Card) obj;
        return rank == card.rank && suit.equals(card.suit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rank, suit);
    }

    @Override
    public int compareTo(Card card) {
        if(suit.ordinal() < card.getSuit().ordinal()) return -1;
        else if(suit.ordinal() > card.getSuit().ordinal()) return 1;
        else return rank - card.getRank();
    }
}
