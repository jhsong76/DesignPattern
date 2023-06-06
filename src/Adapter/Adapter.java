package Adapter;

public class Adapter extends Adaptee implements Print{
    public Adapter(){
        super(220-100);
    }
    @Override
    public void DC_output() {
        showDC();
    }
    public void showDC() {
        System.out.println("직류 " + this.ac);
    }
}
