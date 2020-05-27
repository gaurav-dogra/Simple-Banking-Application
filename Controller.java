package banking;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    List<Account> accounts = new ArrayList<>();

    public boolean login(String cardNo, String pin) {
        accounts.forEach(account -> {
            Card card = account.getCard();
            if (card.getCardNo().equals(cardNo) && card.getPin().equals(pin)) {
                return true; // ERROR description: Unexpected return value
            }
        });

        return false;
    }

    public Card createAccount() {
        Account account = new Account();
        accounts.add(account);
        return account.getCard();
    }
}