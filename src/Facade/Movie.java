package Facade;

public class Movie {
    private String name = "";

    public Movie(String name) {
        this.name = name;
    }

    public void search_Movie() {
        System.out.println("영화를 찾다");
    }

    public void Charge_Movie() {
        System.out.println("영화를 결제하다");
    }

    public void play_Music() {
        System.out.println("영화 재생");
    }
}