import framework.Factory;
import framework.Product;
import idcard.IDCardFactory;
public class main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("Youngjin Kim");
        Product card2 = factory.create("Sujeong Kim");
        Product card3 = factory.create("Chungyong Kim");
        card1.use();
        card2.use();
        card3.use();
    }
}
