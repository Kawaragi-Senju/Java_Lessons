package learning.com.rpg;

public class Tank extends Person{
    int shield;
    final static String TANK_NAME = "Tank";

    public Tank(int shield, int hp, String name){
        super(hp, name, TANK_NAME);
        this.shield = shield;
    }

    @Override
    public void printInfo(){
        System.out.println(hp + TANK_NAME + name + shield);
    }
}
