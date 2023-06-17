package State;

public class VendingMachine {
    private VendingMachineState state;
    private int money;

    public VendingMachine() {
        this.state = new IdleState(); // 시작
    }

     public void setState(VendingMachineState state) {
        this.state = state;         // 상태가 전환될 때마다 호출되어 상태가 바뀐 것을 반영함.
     }

     public void selectItem() {
        state.selectItem(this);
     }

     public void insertMoney(int money) {
        state.insertMoney(this, money);
     }

     public void pressButton() {
        state.pressButton(this);
     }
}
