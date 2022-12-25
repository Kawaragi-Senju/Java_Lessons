package learning.com.polygon;

public class Main {
    public static void main(String[] args) {
        int x = 0;
        int[] m = {3, 3, 3, 3, 3};
        for (int i = 0; i < m.length; i++){
            x += m[i];
        }
        Polygon polygon = new Polygon(5, m);
        System.out.println(Polygon.showperimetr(5, m));
        System.out.println(x);
    }
}
// Создать класс Polygon (многоугольник) с полем perimeter. Определить три конструктора:
//Принимающий два аргумента число сторон и массив с длинами сторон. Например Polygon(3, array), где array ={3,4,5}
//Принимающий число сторон и величину, обозначающую длину каждой стороны (в данном случае, считаем, что многоугольник равносторонний)
//Конструктор без аргументов, выводящий надпись «многоугольник не определен»
//Определить метод showPerimeter().  Если периметр не вычислен, то вывести надпись «периметр неизвестен». Определить несколько объектов