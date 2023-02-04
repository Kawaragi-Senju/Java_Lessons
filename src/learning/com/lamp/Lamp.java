package learning.com.lamp;

public interface Lamp {

     default void shining(){
         System.out.println("Shining Yellow");
    }

    default  void turnOffLamp(){
        System.out.println("Turning off");
    }

}
