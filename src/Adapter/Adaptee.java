package Adapter;

public class Adaptee{
    Integer ac;
    public Adaptee(Integer ac) {
        this.ac = ac;
    }

    public void AC_output() {
        showAC();
    }
    public void showAC() {
        System.out.println("교류 " + ac);
    }

}


