package lpa.cardGameChallenge;

import java.util.ArrayList;
import java.util.List;

public record Card(String familyName, FamilyMember familyMember) {

    public Card(String familyName, FamilyMember familyMember) {
        this.familyName = familyName;
        this.familyMember = familyMember;
    }

    @Override
    public String toString() {
        return "%s (%s)".formatted(familyMember, familyName);
    }

    public static List<Card> generateDeck(String... familyNames) {
        List<Card> deck = new ArrayList<>();
        for (String name : familyNames) {
            for (FamilyMember member : FamilyMember.values()) {
                deck.add(new Card(name, member));
            }
        }
        return deck;
    }

    public static void printDeck(List<Card> deck, String description, int rows) {
        System.out.println("-".repeat(20));
        if (description != null) {
            System.out.println(description);
        }
        int cardsInRow = deck.size() / rows;
        for (int i = 0; i < rows; i++) {
            int startIndex = i * cardsInRow;
            int endIndex = startIndex + cardsInRow;
            deck.subList(startIndex, endIndex).forEach(c -> System.out.print(c + " "));
            System.out.println();
        }
    }
}
