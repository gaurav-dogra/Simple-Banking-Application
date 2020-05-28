package banking;

public class Main {
    public static void main(String[] args) {
        BankingUI ui = new BankingUI();
        Controller controller = new Controller();
        ui.start(controller);
    }
}
