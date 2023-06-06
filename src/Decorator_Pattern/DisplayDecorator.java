package Decorator_Pattern;

/*
    다양한 추가 기능에 대한 추상 클래스
    합성 관계를 통해 RoadDisplay 객체에 대한 참조
    해당 클래스를 통해 기본 기능에 추가 기능 부여 가능
 */
public abstract class DisplayDecorator extends Display{
    private Display decoratedDisplay;

    public DisplayDecorator(Display decoratedDisplay) {
        this.decoratedDisplay = decoratedDisplay;
    }

    @Override
    public void draw() {
        decoratedDisplay.draw();     // 받아온 displaydraw() 출력
    }
}
