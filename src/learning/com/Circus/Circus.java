package learning.com.Circus;

public class Circus {
    int square;

    public Circus(int r){
        this.square = r;
    }


    public double showsquare(){
        return Math.PI * square * square;
    }
}

//1. Создать класс Circus (Круг) с полем square (площадь) конструктор которого принимает
//радиус круга. Определить в классе метод showSquare(), выводящий на экран площадь
//круга. Создать массив элементов класса Circus, вывести на экран их площадь. S = ПR 2