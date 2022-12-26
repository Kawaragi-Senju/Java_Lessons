package learning.com.rabotniki2;

public class Rabotnik {
    static int dailyMoney;
    static int otrDays;

    public Rabotnik(int dailymoney){
        this.dailyMoney = dailymoney;
    }

    public static int zp(int otrDays){
        return dailyMoney * otrDays;
    }

}
//Описать класс Работник и два поля в нем:
// дневная оплата,
//отработанные дни.
//Описать конструктор этого класса, принимающий дневную плату как аргумент.
//Описать метод подсчитатьЗарплату, возвращающий сумму, которую заработал сотрудник (дневная оплата * отработанные дни).
//Метод принимает в качестве аргумента отработанные дни.