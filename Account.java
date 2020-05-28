package banking;

public class Account {
    private Card card = new Card();
    private double balance = 0;

    public Card getCard() {
        return card;
    }

    public double getBalance() {
        return balance;
    }
}
