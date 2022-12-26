package learning.com.rabotniki2;

public class Trainee extends Rabotnik{
    static float minKoef;

    public Trainee (int dailyMoney, float minKoef){
        super(dailyMoney);
        this.minKoef = minKoef;
    }

    public static float zp(float minKoef, int otrDays){
        return minKoef *0.01f * dailyMoney * otrDays;
    }

}
//Описать класс Стажер, наследующий класс Работник. Определить в нем поле понижающий коэффициент.
//Определить в классе конструктор, принимающий два аргумента:
//понижающий коэффициент
//дневная плата
//При значении понижающего коэффициента> 1, вывести на экран надпись:
//«понижающий коэффициент задан неправильно!».
//Переопределить метод подсчитатьЗарплату так, чтобы тот считал зарплату по формуле:
//дневная оплата * отработанные дни * понижающий коэффициент.