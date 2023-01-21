package learning.com.switcher2;

public class Tv implements TechTv{
    @Override
    public void turnOffTv() {
        System.out.println("Tv is working");
    }

    @Override
    public void turnOnTv() {
        System.out.println("Tv is not working");
    }
}
