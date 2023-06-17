package State;

public class ItemSelectedState implements VendingMachineState{
    public void selectItem(VendingMachine vendingMachine) {
        System.out.println("item already selected");
    }

    public void insertMoney(VendingMachine vendingMachine, int money) {
        System.out.println("Money inserted");
        vendingMachine.setState(new MoneyInsertedState());
    }

    public void pressButton(VendingMachine vendingMachine) {
        System.out.println("No money inserted");
    }
}
