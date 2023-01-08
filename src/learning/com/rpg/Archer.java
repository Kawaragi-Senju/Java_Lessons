package learning.com.rpg;

public class Archer extends Person{
    int howArrows;
    final static String ARCHER_NAME = "Archer";
    public Archer(int howArrows, int hp, String name){
        super(hp, name, ARCHER_NAME);
        this.howArrows = howArrows;
    }

    @Override
    public void printInfo() {
        System.out.println(hp + ARCHER_NAME + name + howArrows);
    }
}
