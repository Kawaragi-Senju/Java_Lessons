package learning.com.rpg;

public class Main {
    public static void main(String[] args) {
        Archer archer = new Archer(15, 100, "fsf");
        Mag mag = new Mag(100, "dsjkf", 100);
        Tank tank = new Tank(100, 100, "jsdk");
        Person [] m = {archer, mag, tank};
        for(int i = 0; i < 3; i++){
            System.out.println(m[i].name + ", " + m[i].className);
        }
    }
}
