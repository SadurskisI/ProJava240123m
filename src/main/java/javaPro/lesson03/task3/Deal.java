package javaPro.lesson03.task3;

import java.util.Scanner;

public class Deal {
    public static void main(String[] args) {

        int cardsForPlayer = 6;
        int players;

        String[] suits = {"clubs","diamonds","hearts","spades"};
        String[] ranks = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};

        int cardsInDeck = suits.length * ranks.length;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввидите колическво игроков");

        players = scanner.nextInt();

        String[] deck = new String[cardsInDeck];

        int counter = 0;
        for (int i = 0; i < ranks.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deck[counter++] = ranks[i] + " " + suits[j];
            }
        }

    }
}
