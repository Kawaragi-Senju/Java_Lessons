package learning.com.switcher;

public class Switcher{
    Tech technic;
    public void setTech(Tech technic){
        this.technic = technic;
    }

    public void turnOnTechnic(){
        technic.turnOn();
    }

    public void turnOffTechnic(){
        technic.turnOff();
    }
}
