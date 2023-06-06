package AdapterPattern_test2;
// Client 의뢰자의 역할
public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printStrong();
        p.printWeak();
    }
}
