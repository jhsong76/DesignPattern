package Command;

/*
    Invoker 클래스로 Command 의 레퍼런스를 가지고 있다.
    실질적으로 버튼이 눌렸을 때 어떤 동작이 수행되는지 세팅
 */
public class Button {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void press() {
        command.execute();
    }
}
