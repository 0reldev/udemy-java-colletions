package lpa.deckOfCards;

public enum Suit {
    CLUB, DIAMOND, HEART, SPADE;

    public char getImages() {
        return (new char[]{9827, 9830, 9829, 9824})[this.ordinal()];
    }
}