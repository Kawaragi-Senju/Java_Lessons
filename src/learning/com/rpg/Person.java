package learning.com.rpg;

public abstract class Person {
    int hp;
    String name;
    String className;

    public Person(int hp, String name, String className){
        this.hp = hp;
        this.className = className;
        this.name = name;
    }

    public abstract void printInfo();
}
