package Factory;
public class StringDisplay extends AbstractDisplay {

    private String string;
    private int stringWidth;

    public StringDisplay(String string) {
        this.string = string;
        this.stringWidth = string.getBytes().length;
    }

    public void open() { printLine(); }

    public void print() {
        System.out.println("|" + string + "|");
    }

    public void close() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for(int i = 0; i < stringWidth; ++i) {
                System.out.print("-");
        }
        System.out.println("+");
    }
}
