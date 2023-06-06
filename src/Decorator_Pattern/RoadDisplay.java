package Decorator_Pattern;

// 기본 도로 표시를 클래스
public class RoadDisplay extends Display{
    @Override
    public void draw() {
        System.out.println("기본 도로 표시");
    }
}
