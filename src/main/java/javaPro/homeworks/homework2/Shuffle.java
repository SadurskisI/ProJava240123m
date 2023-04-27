package javaPro.homeworks.homework2;

import java.util.Random;

public class Shuffle {
    protected static void deckShuffle(Random random, int numberOfCards, String[] deck) {
        for (int i = 0; i < numberOfCards; i++) {
            int card = i + (random.nextInt(numberOfCards - i)); // random card in the deck
            String temp = deck[card];
            deck[card] = deck[i];
            deck[i] = temp;
        }
    }
}
