package learning.com.switcher;

public abstract class Tech {
    public abstract void turnOn();

   final public void turnOff(){
        System.out.println("Tech is turned off");
    }
}
