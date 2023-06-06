package iterator;

public class ArrayIterator implements Iterator{
    private Array array;
    private int index;

    public ArrayIterator(Array array) {
        this.array = array;
        this.index = -1;
    }

    @Override
    public boolean next() {
        index++; // 인덱스 값을 증가 시킨 후
        return index < array.getCount(); // 인덱스값이 배열에 유효한지 반환
    }

    @Override
    public Object current() {
        return array.getItem(index); // 현재 인덱스 값에 해당하는 구성 데이터 자체를 반환
    }
}
