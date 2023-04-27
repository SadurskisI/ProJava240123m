package javaPro.homeworks.homework2;

public class CardNumber {
    protected static int getNumberOfCards(Suits[] suits, Rank[] rank) {
        final int numberOfCards = suits.length * rank.length;
        return numberOfCards;
    }
}
