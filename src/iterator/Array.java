package iterator;

public class Array implements Aggregator{
    private Item[] items;
    // items의 구성 데이터는 생성자를 통해서 구현
    public Array(Item[] items) {
        this.items = items;
    }

    public Item getItem(int index) {
        // 배열 인덱스를 통해서 구성 데이터를 얻을 수 있는,
        return items[index];
    }

    // 배열 구성 데이터의 개수를 얻을 수 있는,
    public int getCount(){
        return items.length;
    }

    @Override
    public Iterator iterator() {
        return new ArrayIterator(this); // 생성해서 반환
    }
}
