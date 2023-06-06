package AdapterPattern_test;

public abstract class Animal {
    protected String name;

    // 생성자로 name 필드를 값을 지정할 수 있도록 함.
    public Animal(String name) {
        this.name = name;
    }

    // 추상 메서드 추가
    public abstract void sound();
}
