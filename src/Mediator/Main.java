package Mediator;

public class Main {

public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();

        ColleagueA colleagueA = new ColleagueA(mediator);
        ColleagueB colleagueB = new ColleagueB(mediator);

        mediator.setColleagueA(colleagueA);
        mediator.setColleagueB(colleagueB);

        colleagueA.sendMessage("Hello from ColleagueA!");
        colleagueB.sendMessage("Hi from ColleagueB!");
        }
}