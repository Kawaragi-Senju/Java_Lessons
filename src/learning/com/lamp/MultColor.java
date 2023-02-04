package learning.com.lamp;

public class MultColor implements Lamp{
    @Override
    public void shining() {
        System.out.println("Shining");
    }

    public void oldSchoolShining(){
        Lamp.super.shining();
    }
}
