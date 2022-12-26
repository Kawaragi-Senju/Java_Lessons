package learning.com.car;

public class Car {
    final static byte tankVolume = 100;
    static byte remaningFuel;

    public Car(byte remaningFuel){
        this.remaningFuel = tankVolume;
    }
    public static double spendFuel(byte drived){
        return (drived);
    }

    public static byte showRemaningFuel(byte remaningFuel, byte drived){
        return (byte) (remaningFuel - drived);
    }

    public static byte showTankVolume() {
        return tankVolume;
    }
}
//Создать класс Car cо статической переменной  tankVolume (объем бака).  Присвоить переменной значение 100. Определить в классе нестатическую переменную remainingFuel (оставшееся топливо) изначально равное tankVolume (присвоить эту величину внутри конструктора) . Определить методы:
//Нестатический spendFuel( double spendedFuel),  «расходующий» топливо из оставшегося объема.
//Нестатический showRemainingFuel()  показывающий оставшееся топливо
//Статический showTankVolume() показывающий объем бака.
//Использовать showTankVolume() НЕ СОЗДАВ ОБЪЕКТ. Затем создать объект класса и использовать нестатические методы.