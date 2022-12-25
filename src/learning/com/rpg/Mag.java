package learning.com.rpg;

public class Mag extends Person{
    int mana;
    final static String MAG_NAME = "Mag";

    public Mag(int hp, String name, int mana){
        super(hp, name, MAG_NAME );
        this.mana = mana;
    }
}
