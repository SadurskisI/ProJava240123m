package javaPro.homeworks.homework2;

import java.util.Random;
import java.util.Scanner;

import static javaPro.homeworks.homework2.CardNumber.getNumberOfCards;
import static javaPro.homeworks.homework2.Deck.getDeck;
import static javaPro.homeworks.homework2.GameDeck.gameDeck;
import static javaPro.homeworks.homework2.Players.getPlayers;
import static javaPro.homeworks.homework2.Shuffle.deckShuffle;

public class Deal {
    public static void main(String[] args) {

        final int cardsForPlayer = 5;
        int players;

        final Scanner sc = new Scanner(System.in);
        final Random random = new Random();

        Suits[] suits = Suits.values();
        Rank[] rank = Rank.values();

        final int numberOfCards = getNumberOfCards(suits, rank); // number of cards

        players = getPlayers(cardsForPlayer, sc, numberOfCards); // Подготовка количества игроков


        String[] deck = getDeck(suits, rank, numberOfCards); // deck initialization


        deckShuffle(random, numberOfCards, deck); // deck shuffling


        gameDeck(cardsForPlayer, players, deck); // the shuffled deck is displayed

    }




}

