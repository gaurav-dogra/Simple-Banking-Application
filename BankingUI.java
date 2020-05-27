package banking;

import java.util.Scanner;

public class BankingUI {


    public void start(Controller controller) {

        while (true) {

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
                    System.out.println("Bye!");
                    break;
            }
        }

    }

    private void logIn(Controller controller) {
        System.out.println("Enter your card number:");
        String cardNo = getStringInput();

        System.out.println("Enter your PIN:");
        String pin = getStringInput();

        if (controller.login(cardNo, pin)) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Wrong card number or PIN!");
        }
    }

    private String getStringInput() {
        String input = "";

        try (Scanner scanner = new Scanner(System.in)) {
            input = scanner.next();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return input;
    }

    private void createAccount(Controller controller) {
        Card card = controller.createAccount();
        // is it okay for view to have model object?? i.e. Card
        System.out.format("Your card have been created\n" +
                "Your card number:\n" +
                "%s\n" +
                "Your card PIN:\n" +
                "%s", card.getCardNo(), card.getPin());
    }

    private int getInput() {
        int input;

        try (Scanner scanner = new Scanner(System.in)) {
            input = scanner.nextInt();
            scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Wrong input");
            return 0;
        }
        return input;
    }

    private void printMainMenu() {
        System.out.println("1. Create account\n" +
                "2. Log into account\n" +
                "0. Exit\n");
    }
}
