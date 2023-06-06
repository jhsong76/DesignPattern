package iterator;

public interface Iterator {
    boolean next(); // aggregator의 다음 구성 요소를 얻을 수 있도록. 얻을 수 있으면 true 반환
    Object current(); // 구성 데이터를 하나 얻어 반환, 구성 데이터에 대한 타입은 정해지지 않아야 하므로 오브젝트 타입으로 반환
}

