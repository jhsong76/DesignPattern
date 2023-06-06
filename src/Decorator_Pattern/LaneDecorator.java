package Decorator_Pattern;

/*
    차선 추가 해주는 클래스
    설정된 기존 기능을 수행하고, 추가적으로 차선 표시
    drawLane(): 클래스 내부에서는 차선 표시 기능만 직접적으로 제공
    -> 기본 도로가 출력되는 내용은 나오지 않는다
 */
public class LaneDecorator extends DisplayDecorator{
    public LaneDecorator(Display decoratedDisplay) {
        super(decoratedDisplay);
    }

    @Override
    public void draw() {
        super.draw();
        drawLane();
    }
    private void drawLane() {
        System.out.println(" +차선 표시");
    }
}
