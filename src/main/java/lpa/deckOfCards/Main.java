package lpa.deckOfCards;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Card> deck = Card.getStandardDeck();
        Card.printDeck(deck);
//        Current deck
//        2♣(0) 3♣(1) 4♣(2) 5♣(3) 6♣(4) 7♣(5) 8♣(6) 9♣(7) 10♣(8) J♣(9) Q♣(10) K♣(11) A♣(12)
//        2♦(0) 3♦(1) 4♦(2) 5♦(3) 6♦(4) 7♦(5) 8♦(6) 9♦(7) 10♦(8) J♦(9) Q♦(10) K♦(11) A♦(12)
//        2♥(0) 3♥(1) 4♥(2) 5♥(3) 6♥(4) 7♥(5) 8♥(6) 9♥(7) 10♥(8) J♥(9) Q♥(10) K♥(11) A♥(12)
//        2♠(0) 3♠(1) 4♠(2) 5♠(3) 6♠(4) 7♠(5) 8♠(6) 9♠(7) 10♠(8) J♠(9) Q♠(10) K♠(11) A♠(12)

        Card[] cardArray = new Card[13];
        Card aceOfHearts = Card.getFaceCard(Suit.HEART, 'A');
        Arrays.fill(cardArray, aceOfHearts);
        Card.printDeck(Arrays.asList(cardArray), "Aces of Hearts", 1);
//        Aces of Hearts
//        A♥(12) A♥(12) A♥(12) A♥(12) A♥(12) A♥(12) A♥(12) A♥(12) A♥(12) A♥(12) A♥(12) A♥(12) A♥(12)

        List<Card> cards = new ArrayList<>(52);
        Collections.fill(cards, aceOfHearts);
        System.out.println(cards);
        System.out.println("cards.size() = " + cards.size());
//        []
//        cards.size() = 0

        List<Card> acesOfHearts = Collections.nCopies(13, aceOfHearts);
        Card.printDeck(acesOfHearts, "Aces of Hearts", 1);
//        Aces of Hearts
//        A♥(12) A♥(12) A♥(12) A♥(12) A♥(12) A♥(12) A♥(12) A♥(12) A♥(12) A♥(12) A♥(12) A♥(12) A♥(12)

        Card kingOfClubs = Card.getFaceCard(Suit.CLUB, 'K');
        List<Card> kingsOfClubs = Collections.nCopies(13, kingOfClubs);
        Card.printDeck(kingsOfClubs, "Kings of Clubs", 1);
//        Kings of Clubs
//        K♣(11) K♣(11) K♣(11) K♣(11) K♣(11) K♣(11) K♣(11) K♣(11) K♣(11) K♣(11) K♣(11) K♣(11) K♣(11)

        Collections.addAll(cards, cardArray);
        Collections.addAll(cards, cardArray);
        Card.printDeck(cards, "Card collection with Aces added", 2);
//        Card collection with Aces added
//        A♥(12) A♥(12) A♥(12) A♥(12) A♥(12) A♥(12) A♥(12) A♥(12) A♥(12) A♥(12) A♥(12) A♥(12) A♥(12)
//        A♥(12) A♥(12) A♥(12) A♥(12) A♥(12) A♥(12) A♥(12) A♥(12) A♥(12) A♥(12) A♥(12) A♥(12) A♥(12)

        Collections.copy(cards, kingsOfClubs);
        Card.printDeck(cards, "Card collection with Kings copied.", 2);
//        Card collection with Kings copied.
//        K♣(11) K♣(11) K♣(11) K♣(11) K♣(11) K♣(11) K♣(11) K♣(11) K♣(11) K♣(11) K♣(11) K♣(11) K♣(11)
//        A♥(12) A♥(12) A♥(12) A♥(12) A♥(12) A♥(12) A♥(12) A♥(12) A♥(12) A♥(12) A♥(12) A♥(12) A♥(12)

        cards = List.copyOf(kingsOfClubs);
        Card.printDeck(cards, "List copy of Kings", 1);
//        Card collection with Kings copied
//        K♣(11) K♣(11) K♣(11) K♣(11) K♣(11) K♣(11)
//        K♣(11) K♣(11) K♣(11) K♣(11) K♣(11) K♣(11)

        List<Card> deck2 = Card.getStandardDeck();
        Card.printDeck(deck2);

        Collections.shuffle(deck2);
        Card.printDeck(deck2, "Shuffled deck", 4);
//        Shuffled deck
//        4♦(2) K♥(11) 3♠(1) K♠(11) 8♦(6) 9♣(7) 10♥(8) 2♥(0) 7♦(5) 7♥(5) 10♠(8) 3♦(1) K♣(11)
//        4♥(2) 8♣(6) 9♥(7) J♠(9) A♣(12) 5♦(3) J♦(9) A♥(12) Q♦(10) 6♥(4) 6♠(4) 10♣(8) Q♠(10)
//        A♦(12) 5♣(3) 9♠(7) A♠(12) 6♣(4) 2♦(0) 5♠(3) 2♠(0) 9♦(7) J♥(9) 8♠(6) 4♠(2) 5♥(3)
//        J♣(9) Q♣(10) Q♥(10) 4♣(2) 6♦(4) K♦(11) 3♣(1) 8♥(6) 3♥(1) 2♣(0) 10♦(8) 7♠(5) 7♣(5)


        Collections.reverse(deck2);
        Card.printDeck(deck2, "Reversed deck of cards:", 4);
//        Reversed deck of cards:
//        7♣(5) 7♠(5) 10♦(8) 2♣(0) 3♥(1) 8♥(6) 3♣(1) K♦(11) 6♦(4) 4♣(2) Q♥(10) Q♣(10) J♣(9)
//        5♥(3) 4♠(2) 8♠(6) J♥(9) 9♦(7) 2♠(0) 5♠(3) 2♦(0) 6♣(4) A♠(12) 9♠(7) 5♣(3) A♦(12)
//        Q♠(10) 10♣(8) 6♠(4) 6♥(4) Q♦(10) A♥(12) J♦(9) 5♦(3) A♣(12) J♠(9) 9♥(7) 8♣(6) 4♥(2)
//        K♣(11) 3♦(1) 10♠(8) 7♥(5) 7♦(5) 2♥(0) 10♥(8) 9♣(7) 8♦(6) K♠(11) 3♠(1) K♥(11) 4♦(2)


        var sortingAlgorithm = Comparator.comparing(Card::rank)
                .thenComparing(Card::suit);
        Collections.sort(deck, sortingAlgorithm);
        Card.printDeck(deck, "Standard deck sorted by rank, suit", 13);
//        Standard deck sorted by rank, suit
//        2♣(0) 2♦(0) 2♥(0) 2♠(0)
//        3♣(1) 3♦(1) 3♥(1) 3♠(1)
//        4♣(2) 4♦(2) 4♥(2) 4♠(2)
//        5♣(3) 5♦(3) 5♥(3) 5♠(3)
//        6♣(4) 6♦(4) 6♥(4) 6♠(4)
//        7♣(5) 7♦(5) 7♥(5) 7♠(5)
//        8♣(6) 8♦(6) 8♥(6) 8♠(6)
//        9♣(7) 9♦(7) 9♥(7) 9♠(7)
//        10♣(8) 10♦(8) 10♥(8) 10♠(8)
//        J♣(9) J♦(9) J♥(9) J♠(9)
//        Q♣(10) Q♦(10) Q♥(10) Q♠(10)
//        K♣(11) K♦(11) K♥(11) K♠(11)
//        A♣(12) A♦(12) A♥(12) A♠(12)

        Collections.reverse(deck);
        Card.printDeck(deck, "Sorted by rank, suit reversed", 13);
//        Sorted by rank, suit reversed
//        A♠(12) A♥(12) A♦(12) A♣(12)
//        K♠(11) K♥(11) K♦(11) K♣(11)
//        Q♠(10) Q♥(10) Q♦(10) Q♣(10)
//        J♠(9) J♥(9) J♦(9) J♣(9)
//        10♠(8) 10♥(8) 10♦(8) 10♣(8)
//        9♠(7) 9♥(7) 9♦(7) 9♣(7)
//        8♠(6) 8♥(6) 8♦(6) 8♣(6)
//        7♠(5) 7♥(5) 7♦(5) 7♣(5)
//        6♠(4) 6♥(4) 6♦(4) 6♣(4)
//        5♠(3) 5♥(3) 5♦(3) 5♣(3)
//        4♠(2) 4♥(2) 4♦(2) 4♣(2)
//        3♠(1) 3♥(1) 3♦(1) 3♣(1)
//        2♠(0) 2♥(0) 2♦(0) 2♣(0)

        List<Card> kings = new ArrayList<>(deck.subList(4, 8));
        Card.printDeck(kings, "Kings in deck", 1);
//        Kings in deck
//        K♠(11) K♥(11) K♦(11) K♣(11)

        List<Card> tens = new ArrayList<>(deck.subList(16, 20));
        Card.printDeck(tens, "Tens in deck", 1);
//        Tens in deck
//        10♠(8) 10♥(8) 10♦(8) 10♣(8)

        int subListIndex = Collections.indexOfSubList(deck, tens);
        System.out.println("Sublist index for tens = " + subListIndex);
//        Sublist index for tens = 16

        System.out.println("Contains = " + deck.containsAll(tens));
//        Contains = true

        boolean disjoint = Collections.disjoint(deck, tens);
        System.out.println("disjoint = " + disjoint);
//        disjoint = false

        boolean disjoint2 = Collections.disjoint(kings, tens);
        System.out.println("disjoint = " + disjoint2);
//        disjoint = true
    }
}
