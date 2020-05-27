package banking;

public class Account {
    Card card = new Card();

    public String getCardNo() {
        return card.getCardNo();
    }

    public String getCardPin() {
        return card.getPin();
    }

    public Card getCard() {
        return card;
    }
}
