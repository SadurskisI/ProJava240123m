package javaPro.homeworks.homework2;

public class GameDeck {
    protected static void gameDeck(int cardsForPlayer, int players, String[] deck) {
        for (int i = 0; i < players * cardsForPlayer; i++) {
            System.out.println(deck[i]);

            if (i % cardsForPlayer == cardsForPlayer - 1)
                System.out.println();
        }
    }
}
