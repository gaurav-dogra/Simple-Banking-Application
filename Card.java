package banking;

import java.util.concurrent.ThreadLocalRandom;

public class Card {
    public static final String IIN = "400000";
    private final String cardNo;
    private final String pin;

    {
        long random9DigitsLong = ThreadLocalRandom.current().nextLong(1_000_000_000L);
        String random9DigitsString = String.format("%09d", random9DigitsLong);
        Character checkSum = luhnAlgorithm(IIN + random9DigitsString);
        cardNo = IIN + random9DigitsString + checkSum;

        int pinInt = ThreadLocalRandom.current().nextInt(0, 10000);
        this.pin = String.format("%04d", pinInt);
    }

    private Character luhnAlgorithm(String s) {
        int sum = 0;

        for (int i = 0; i < 15; i++) {
            int intValue;
            if ((i + 1) % 2 != 0) {
                intValue = Character.getNumericValue(s.charAt(i));
                intValue *= 2;
                if (intValue > 9) {
                    intValue -= 9;
                }
            } else {
                intValue = Character.getNumericValue(s.charAt(i));
            }
            sum += intValue;
        }
        int returnValue = sum % 10;
        if (returnValue != 0) {
            returnValue = 10 - returnValue;
        }
        return (char)(returnValue + '0');
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
