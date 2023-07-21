package lpa.cardGameChallenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        List<Card> animalDeck = Card.generateDeck("Bird", "Fish", "Dog", "Cat", "Horse", "Whale", "Monkey");
        Card.printDeck(animalDeck, "Animal family deck", 7);
//        Animal family deck
//        FATHER (Bird) MOTHER (Bird) SON (Bird) DAUGHTER (Bird) GRANDPA (Bird) GRANDMA (Bird)
//        FATHER (Fish) MOTHER (Fish) SON (Fish) DAUGHTER (Fish) GRANDPA (Fish) GRANDMA (Fish)
//        FATHER (Dog) MOTHER (Dog) SON (Dog) DAUGHTER (Dog) GRANDPA (Dog) GRANDMA (Dog)
//        FATHER (Cat) MOTHER (Cat) SON (Cat) DAUGHTER (Cat) GRANDPA (Cat) GRANDMA (Cat)
//        FATHER (Horse) MOTHER (Horse) SON (Horse) DAUGHTER (Horse) GRANDPA (Horse) GRANDMA (Horse)
//        FATHER (Whale) MOTHER (Whale) SON (Whale) DAUGHTER (Whale) GRANDPA (Whale) GRANDMA (Whale)
//        FATHER (Monkey) MOTHER (Monkey) SON (Monkey) DAUGHTER (Monkey) GRANDPA (Monkey) GRANDMA (Monkey)

        Collections.shuffle(animalDeck);
        Card.printDeck(animalDeck, "Shuffled animal family deck", 6);
//        Shuffled animal family deck
//        FATHER (Bird) MOTHER (Whale) FATHER (Monkey) GRANDPA (Bird) GRANDPA (Monkey) GRANDMA (Horse) DAUGHTER (Fish)
//        GRANDPA (Whale) SON (Horse) SON (Cat) FATHER (Horse) DAUGHTER (Monkey) GRANDMA (Dog) DAUGHTER (Dog)
//        FATHER (Whale) GRANDMA (Monkey) DAUGHTER (Whale) DAUGHTER (Bird) SON (Dog) GRANDMA (Whale) SON (Monkey)
//        MOTHER (Fish) FATHER (Cat) FATHER (Fish) SON (Bird) MOTHER (Bird) GRANDPA (Cat) MOTHER (Dog)
//        GRANDMA (Bird) SON (Whale) SON (Fish) GRANDMA (Cat) DAUGHTER (Horse) MOTHER (Horse) MOTHER (Cat)
//        MOTHER (Monkey) FATHER (Dog) GRANDMA (Fish) DAUGHTER (Cat) GRANDPA (Horse) GRANDPA (Fish) GRANDPA (Dog)

        int playerNumber = 0;
        while (playerNumber < 2) {
            System.out.println("\nHow many players will play the game? (from 2 to 5 players)\n");
            playerNumber = scanner.nextInt();
        }
        System.out.println(playerNumber + " players  will start the game.");

        Player[] players = new Player[6];
        for (int player = 1; player <= playerNumber; player++) {

            players[player] = new Player("Player " + player, new ArrayList<>(animalDeck.subList(0 + (player - 1) * 7, 7 + (player - 1) * 7)));
            System.out.println(players[player].toString());
        }

//        5 players  will start the game.
//        Player 1
//        Hand:[FATHER (Bird), MOTHER (Whale), FATHER (Monkey), GRANDPA (Bird), GRANDPA (Monkey), GRANDMA (Horse), DAUGHTER (Fish)]
//        Player 2
//        Hand:[GRANDPA (Whale), SON (Horse), SON (Cat), FATHER (Horse), DAUGHTER (Monkey), GRANDMA (Dog), DAUGHTER (Dog)]
//        Player 3
//        Hand:[FATHER (Whale), GRANDMA (Monkey), DAUGHTER (Whale), DAUGHTER (Bird), SON (Dog), GRANDMA (Whale), SON (Monkey)]
//        Player 4
//        Hand:[MOTHER (Fish), FATHER (Cat), FATHER (Fish), SON (Bird), MOTHER (Bird), GRANDPA (Cat), MOTHER (Dog)]
//        Player 5
//        Hand:[GRANDMA (Bird), SON (Whale), SON (Fish), GRANDMA (Cat), DAUGHTER (Horse), MOTHER (Horse), MOTHER (Cat)]


    }

}
