package banking;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    List<Account> accounts = new ArrayList<>();

    public Account login(String cardNo, String pin) {

        for (Account account : accounts) {
            Card card = account.getCard();
            if (card.getCardNo().equals(cardNo) && card.getPin().equals(pin)) {
                return account;
            }
        }
        return null;
    }

    public Card createAccount() {
        Account account = new Account();
        accounts.add(account);
        return account.getCard();
    }
}