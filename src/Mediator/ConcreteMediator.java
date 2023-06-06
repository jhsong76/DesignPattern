package Mediator;

public class ConcreteMediator implements Mediator {
    private ColleagueA colleagueA;
    private ColleagueB colleagueB;

    public void setColleagueA(ColleagueA colleagueA) {
        this.colleagueA = colleagueA;
    }

    public void setColleagueB(ColleagueB colleagueB) {
        this.colleagueB = colleagueB;
    }
    public void sendMessage(String message, Colleague colleague) {
        if (colleague == colleagueA) {
            boolean isReceived = colleagueB.receiveMessage(message);
                if(isReceived) {
                    System.out.println("전달 성공");
                    colleagueA.receiveMessage("전달 성공");}
        } else {
            colleagueA.receiveMessage(message);
        }
    }
}
