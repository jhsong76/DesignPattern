package State;

public class MoneyInsertedState implements VendingMachineState {
    public void selectItem(VendingMachine vendingMachine) {
        System.out.println("Item already selected");
    }

    public void insertMoney(VendingMachine vendingMachine, int money) {
        System.out.println("Money already inserted");
    }

    public void pressButton(VendingMachine vendingMachine) {
        System.out.println("Item dispensed");
        vendingMachine.setState(new IdleState());
    }
}
