package State;

public interface VendingMachineState {
    void selectItem(VendingMachine vendingMachine);
    void insertMoney(VendingMachine vendingMachine, int money);
    void pressButton(VendingMachine vendingMachine);
}
