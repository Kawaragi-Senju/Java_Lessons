package learning.com.soldat;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("azdf", Zvaniya.PRIVATE);
        Person person1 = new Person("azdf", Zvaniya.SERGEANT);
        Person person2 = new Person("azdf", Zvaniya.SERGEANT);
        Person person3 = new Person("azdf", Zvaniya.GENERAL);

        Person[] p = {person, person1, person2, person3};
        Zvaniya[] zv = Zvaniya.values();
        for(int i = 0; i < p.length; i++){
            int pr = 0;
            for (int j = 0; j < zv.length; j++){
                if(zv[j] == p[i].zv){
                    pr += 1;
                }
            }
        }
    }
}