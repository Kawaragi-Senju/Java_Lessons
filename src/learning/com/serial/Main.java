package learning.com.serial;

import java.io.*;

public class Main {
    public static void main(String[] args) {
     City city = new City();
     city.setName("SFkls");
     city.setPopulation(124313556);
     city.setCoordinate("safdvdvsr");
        serialize(city);
        System.out.println(deserialize());
    }


    public static boolean serialize(City c){
        try {
            FileOutputStream asd = new FileOutputStream("C:\\File\\file.sr");
            ObjectOutputStream asw = new ObjectOutputStream(asd);
            asw.writeObject(c);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static City deserialize(){
        try {
            FileInputStream asd = new FileInputStream("C:\\File\\file.sr");
            ObjectInputStream asw = new ObjectInputStream(asd);
            return (City)asw.readObject();
        } catch (Exception e) {
            return null;
        }
    }

}
