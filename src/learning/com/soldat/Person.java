package learning.com.soldat;

public class Person {
    String name;
    Zvaniya zv;

    public Person(String name, Zvaniya zv) {
        this.name = name;
        this.zv = zv;
    }

    public  int compare(Person p) {
        int internalZV = zv.ordinal();
        int externalZv = p.zv.ordinal();
        if(externalZv < internalZV) {
            return 1;
        } else if (externalZv == internalZV ){
            return 0;
        } else {
            return -1;
        }
    }
}
