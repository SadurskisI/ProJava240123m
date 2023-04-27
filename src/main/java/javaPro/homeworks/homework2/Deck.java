package javaPro.homeworks.homework2;

public class Deck {
    protected static String[] getDeck(Suits[] suits, Rank[] rank, int numberOfCards) {
        String[] deck = new String[numberOfCards];
        for (int i = 0; i < rank.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deck[suits.length * i + j] = rank[i] + " " + suits[j];
            }
        }
        return deck;
    }
}
