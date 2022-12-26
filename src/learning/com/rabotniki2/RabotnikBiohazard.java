package learning.com.rabotniki2;

public class RabotnikBiohazard extends Rabotnik{
     int percent;

     public RabotnikBiohazard (int percent, int dailyMoney){
          super(dailyMoney);
     }
     public static float zp(float percent, int otrDays){
          return (otrDays  * dailyMoney) + (dailyMoney/100 * percent) ;
     }
}
//Описать класс РаботникВредногоПроизводства, наследующий класс Работник. Определить в нем поле надбавка.
//Определить в классе конструктор, принимающий два аргумента:
//Надбавка
//Дневная плата
//Переопределить метод подсчитатьЗарплату так, чтобы тот считал зарплату по формуле:
//дневная оплата * отработанные дни + надбавка.
//Метод принимает в качестве аргумента отработанные дни.