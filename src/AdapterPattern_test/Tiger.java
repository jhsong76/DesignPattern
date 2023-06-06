package AdapterPattern_test;

public class Tiger {
    // name 필드는 생성자가 아닌 setName 메서드를 활용해 지정
    private String name;

    void setName(String name) {
        this.name = name;
    }

    String getName(){
        return name;
    }

    void roar() {
        System.out.println("growl");
    }
}
