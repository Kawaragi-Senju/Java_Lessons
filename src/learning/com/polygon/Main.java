package learning.com.polygon;

public class Main {
    public static void main(String[] args) {
        int [] x = {3, 4, 6, 7, 8};
        int stor = 4;
        if(stor % 2 == 0) {
            Polygon polygon = new Polygon(5, x);
            Polygon polygon1 = new Polygon(5, 3);
            System.out.println();
        }else{
            Polygon polygon = new Polygon("");
        }

    }
}
// Создать класс Polygon (многоугольник) с полем perimeter. Определить три конструктора:
//Принимающий два аргумента число сторон и массив с длинами сторон. Например Polygon(3, array), где array ={3,4,5}
//Принимающий число сторон и величину, обозначающую длину каждой стороны (в данном случае, считаем, что многоугольник равносторонний)
//Конструктор без аргументов, выводящий надпись «многоугольник не определен»
//Определить метод showPerimeter().  Если периметр не вычислен, то вывести надпись «периметр неизвестен». Определить несколько объектов