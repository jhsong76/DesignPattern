package Mediator;

public class ColleagueB implements Colleague {
    private Mediator mediator;

    public ColleagueB(Mediator mediator) {
        this.mediator = mediator;
    }

    public void sendMessage(String message) {
        mediator.sendMessage(message, this);
    }

    public boolean receiveMessage(String message) {
        System.out.println("ColleagueB received message: " + message);
        return true;
    }
}