package iterator;

public class Item {
    private String name;
    private int cost;
    // 이름과 가격 필드가 있고,

    // 생성자를 통해 두 값을 지정
    public Item(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    // 문자열로 반환해주는 메서드인 toString을 재정의
    // 아이템 객체 자체를 문자열로 반환할 때 자동으로 호출해주는 것.
    @Override
    public String toString() {
        return "(" + name + "," + cost + ")";
    }
}
