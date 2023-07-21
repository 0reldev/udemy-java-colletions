package lpa.cardGameChallenge;

import java.util.List;

public class Player {

    String name;
    List<Card> hand;

    public Player(String name, List<Card> hand) {
        this.name = name;
        this.hand = hand;
    }

    public String getName() {
        return name;
    }

    public List<Card> getHand() {
        return hand;
    }

    @Override
    public String toString() {
        return name + "\nHand:" + hand;
    }
}
