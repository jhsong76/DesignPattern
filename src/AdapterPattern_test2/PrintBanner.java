package AdapterPattern_test2;

// Banner가 PrintBanner를 가지고 있다. (집합관계)
// Target 역할을 실제로 충족시키는 역할
public class PrintBanner extends Banner implements Print{
    public PrintBanner(String string){
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong(){
        showWithAster();
    }
}
