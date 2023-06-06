package AdapterPattern_test2;
// 이미 준비되어 있는 메소드를 제공하는 역할
public class Banner {
    private String string;

    public Banner(String string){
        this.string = string;
    }

    public void showWithParen() {
        System.out.println("(" + string + ")");
    }

    public void showWithAster() {
        System.out.println("*" + string + "*");
    }
}
