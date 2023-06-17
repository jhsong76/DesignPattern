package State;

public class IdleState implements VendingMachineState{
    public void selectItem(VendingMachine vendingMachine) {
        System.out.println("Item selected");
        vendingMachine.setState(new ItemSelectedState());
    }

    public void insertMoney(VendingMachine vendingMachine, int money) {
        System.out.println("No item selected");
    }

    public void pressButton(VendingMachine vendingMachine) {
        System.out.println("No item selected");
    }
}
