package javaPro.homeworks.homework2;

import java.util.Random;

public class Deck {
    protected static int getNumberOfCards(Suits[] suits, Rank[] rank) {
        final int numberOfCards = suits.length * rank.length;
        return numberOfCards;
    }
    protected static String[] getDeck(Suits[] suits, Rank[] rank, int numberOfCards) {
        String[] deck = new String[numberOfCards];
        for (int i = 0; i < rank.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deck[suits.length * i + j] = rank[i] + " " + suits[j];
            }
        }
        return deck;
    }

    protected static void deckShuffle(Random random, int numberOfCards, String[] deck) {
        for (int i = 0; i < numberOfCards; i++) {
            int card = i + (random.nextInt(numberOfCards - i)); // random card in the deck
            String temp = deck[card];
            deck[card] = deck[i];
            deck[i] = temp;
        }
    }
    protected static void gameDeck(int cardsForPlayer, int players, String[] deck) {
        for (int i = 0; i < players * cardsForPlayer; i++) {
            System.out.println(deck[i]);

            if (i % cardsForPlayer == cardsForPlayer - 1)
                System.out.println();
        }
    }
}
