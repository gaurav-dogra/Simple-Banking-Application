package banking;

import java.util.concurrent.ThreadLocalRandom;

public class Card {
    private final String cardNo;
    private final String pin;

    {
        long random9DigitsLong = ThreadLocalRandom.current().nextLong(1_000_000_000L);
        String random9DigitsString = String.format("%09d", random9DigitsLong);
        cardNo = "400000" + random9DigitsString + '0';

        int pinInt = ThreadLocalRandom.current().nextInt(0, 10000);
        this.pin = String.format("%04d", pinInt);
    }

    public String getCardNo() {
        return cardNo;
    }

    public String getPin() {
        return pin;
    }

    @Override
    public boolean equals(Object obj) {
        return this.getCardNo().equals(((Card) obj).getCardNo()) && this.getPin().equals(((Card) obj).getPin());
    }
}
