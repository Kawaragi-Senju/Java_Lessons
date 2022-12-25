package learning.com.polygon;

public class Polygon {
     int perimetr;
     int veli;
     int[] m;
     int stor;

     public Polygon(int stor, int[] m) {
          this.stor = stor;
          this.m = m;

     }

     public Polygon(int stor, int veli) { //если он равносторонний
          this.stor = stor;
          this.veli = veli;
     }


     static String showperimetr(int stor, int[] m) {
          if (stor % 2 == 0) {
               return "прямоугольник равносторонний";
          } else {
               return "Прямоугольник не равносторонний";
          }
     }
}
// Создать класс Polygon (многоугольник) с полем perimeter. Определить три конструктора:
//Принимающий два аргумента число сторон и массив с длинами сторон. Например Polygon(3, array), где array ={3,4,5}
//Принимающий число сторон и величину, обозначающую длину каждой стороны (в данном случае, считаем, что многоугольник равносторонний)
//Конструктор без аргументов, выводящий надпись «многоугольник не определен»
//Определить метод showPerimeter().  Если периметр не вычислен, то вывести надпись «периметр неизвестен». Определить несколько объектов