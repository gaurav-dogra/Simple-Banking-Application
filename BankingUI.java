package banking;

import java.util.Scanner;

public class BankingUI {

    public void start(Controller controller) {
        boolean loggedIn = false;
        boolean flag = true;
        Account account = null;

        while (flag) {

            if (!loggedIn) {

                String input = printMenu("1. Create account", "2. Log into account", "0. Exit");

                switch (input) {
                    case "1":
                        createAccount(controller);
                        break;

                    case "2":
                        account = login(controller);
                        if (account != null) {
                            System.out.println("\nYou have successfully logged in!");
                            loggedIn = true;
                        } else {
                            System.out.println("\nWrong card number or PIN!\n");
                        }
                        break;

                    case "0":
                        System.out.println("\nBye!");
                        flag = false;
                        break;
                    default:
                }
            } else {

                String input = printMenu("\n1. Balance", "2. Log out", "0. Exit");
                switch (input) {
                    case "1":
                        printBalance(account);
                        break;
                    case "2":
                        logOut();
                        loggedIn = false;
                        break;
                    case "0":
                        flag = false;
                    default:
                }
            }

        }
    }

    private Account login(Controller controller) {
        System.out.println("\nEnter your card number:");
        String cardNo = getInput();

        System.out.println("Enter your PIN:");
        String pin = getInput();

        return controller.login(cardNo, pin);
    }

    private String printMenu(String... lines) {
        for (String line : lines) {
            System.out.println(line);
        }
        return getInput();
    }

    private void createAccount(Controller controller) {
        Card card = controller.createAccount();
        System.out.format("\nYour card have been created\n" +
                "Your card number:\n" +
                "%s\n" +
                "Your card PIN:\n" +
                "%s\n\n", card.getCardNo(), card.getPin());
    }

    private void logOut() {
        System.out.println("\nYou have successfully logged out!\n");
    }

    private void printBalance(Account account) {
        double balance = account.getBalance();
        if (balance == (long) balance) {
            System.out.printf("\nBalance: %d\n", (long) balance);
        } else {
            System.out.printf("\nBalance: %s\n", balance);
        }
    }

    private String getInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}
