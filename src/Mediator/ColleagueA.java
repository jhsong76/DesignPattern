package Mediator;

public class ColleagueA implements Colleague {
    private Mediator mediator;

    public ColleagueA(Mediator mediator) {
        this.mediator = mediator;
    }

    public void sendMessage(String message) {
        mediator.sendMessage(message, this);
    }

    public boolean receiveMessage(String message) {
        System.out.println("ColleagueA received message: " + message);
        return true;
    }
}