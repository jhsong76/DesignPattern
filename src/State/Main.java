package State;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.selectItem();
        vendingMachine.insertMoney(10);
        vendingMachine.pressButton();

        vendingMachine.selectItem();
        vendingMachine.pressButton();

        vendingMachine.insertMoney(5);
        vendingMachine.insertMoney(10);
        vendingMachine.pressButton();
    }
}
