package lpa.cardGameChallenge;

import java.util.Collections;
import java.util.List;

public class Main {

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
        Card.printDeck(animalDeck, "Shuffled animal family deck", 7);
//        GRANDMA (Bird) SON (Bird) DAUGHTER (Bird) GRANDMA (Cat) SON (Fish) FATHER (Bird)
//        MOTHER (Dog) MOTHER (Bird) GRANDMA (Fish) MOTHER (Fish) FATHER (Whale) SON (Dog)
//        DAUGHTER (Fish) MOTHER (Monkey) GRANDMA (Whale) GRANDMA (Monkey) MOTHER (Horse) FATHER (Dog)
//        GRANDPA (Bird) GRANDPA (Whale) SON (Monkey) GRANDPA (Monkey) DAUGHTER (Dog) FATHER (Monkey)
//        MOTHER (Whale) GRANDPA (Fish) SON (Cat) DAUGHTER (Monkey) GRANDMA (Dog) FATHER (Cat)
//        DAUGHTER (Cat) DAUGHTER (Whale) SON (Horse) FATHER (Fish) GRANDMA (Horse) DAUGHTER (Horse)
//        GRANDPA (Horse) SON (Whale) MOTHER (Cat) GRANDPA (Dog) FATHER (Horse) GRANDPA (Cat)

    }



}
