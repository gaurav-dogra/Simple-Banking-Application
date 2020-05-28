package banking;

import java.util.Scanner;

public class BankingUI {

    public void start(Controller controller) {
        boolean flag = true;

        while (flag) {

            printMainMenu();
            int input = getInput();

            switch (input) {
                case 1:
                    createAccount(controller);
                    break;
                case 2:
                    logIn(controller);
                    break;
                case 0:
                    System.out.println("\nBye!");
                    flag = false;
                    break;
            }
        }

    }

    private void createAccount(Controller controller) {
        Card card = controller.createAccount();
        System.out.format("\nYour card have been created\n" +
                "Your card number:\n" +
                "%s\n" +
                "Your card PIN:\n" +
                "%s\n", card.getCardNo(), card.getPin());
    }

    private void printLogMenu() {
        System.out.println("\n1. Balance\n" +
                "2. Log out\n" +
                "0. Exit");
    }

    private void logIn(Controller controller) {

        System.out.println("\nEnter your card number:");
        String cardNo = getStringInput();

        System.out.println("Enter your PIN:");
        String pin = getStringInput();

        Account account = controller.login(cardNo, pin);
        if (account != null) {
            System.out.println("\nYou have successfully logged in!");
            boolean flag = true;

            while (flag) {

                printLogMenu();
                int input = getInput();
                switch (input) {
                    case 1:
                        printBalance(account);
                        break;
                    case 2:
                        logOut();
                        flag = false;
                        break;
                    case 0:
                        flag = false;
                        System.out.println("\nBye!");
                }
            }

        } else {
            System.out.println("\nWrong card number or PIN!");
        }
    }

    private void logOut() {
        System.out.println("\nYou have successfully logged out!");
    }

    private void printBalance(Account account) {
        double balance = account.getBalance();
        if (balance == (long) balance) {
            System.out.printf("\nBalance: %d\n", (long) balance);
        } else {
            System.out.printf("\nBalance: %s\n", balance);
        }
    }

    private String getStringInput() {
        String input = "";
        Scanner scanner = new Scanner(System.in);
        try {
            input = scanner.next();
            scanner.nextLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return input;
    }

    private int getInput() {
        int input;
        Scanner scanner = new Scanner(System.in);
        try {
            input = scanner.nextInt();
            scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Wrong input");
            return 0;
        }
        return input;
    }

    private void printMainMenu() {
        System.out.println("\n1. Create account\n" +
                "2. Log into account\n" +
                "0. Exit");
    }
}
