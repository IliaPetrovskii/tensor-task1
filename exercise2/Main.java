package main.exercise2;

public class Main {
    public static void main(String[] args) {
        CardC card1 = new CardC(2, Suit.DIAMONDS);
        CardC card2 = new CardC(4, Suit.DIAMONDS);
        CardC card3 = new CardC(Suit.DIAMONDS);
        CardC card4 = new CardC(8, Suit.HEARTS);
        CardC card5 = new CardC(6, Suit.SPADES);
        CardC card6 = new CardC(9, Suit.CLUBS);
        CardC card7 = new CardC(Suit.HEARTS);
        CardC card8 = new CardC(Suit.HEARTS);
        CardC card9 = new CardC(Suit.HEARTS);
        System.out.printf("%d, %d, %d\n", card1.getRank(), card2.getRank(), card3.getRank());
        System.out.printf("%d, %d, %d\n", card4.getRank(), card5.getRank(), card6.getRank());
        System.out.printf("%d, %d, %d\n", card7.getRank(), card8.getRank(), card9.getRank());
    }
}
