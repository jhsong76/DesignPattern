package AdapterPattern_test;
// 부모클래스
public class Dog extends Animal{
    // 생성자 추가
    public Dog(String name){
        super(name);
    }

    // 추상메서드 추가
    @Override
    public void sound(){
        System.out.println(name + " Barking");
    }
}
