package learning.com.car;

public class Car {
    static byte tankVolume = 100;
    byte remaningFuel = tankVolume;

}
//Создать класс Car cо статической переменной  tankVolume (объем бака).  Присвоить переменной значение 100. Определить в классе нестатическую переменную remainingFuel (оставшееся топливо) изначально равное tankVolume (присвоить эту величину внутри конструктора) . Определить методы:
//Нестатический spendFuel( double spendedFuel),  «расходующий» топливо из оставшегося объема.
//Нестатический showRemainingFuel()  показывающий оставшееся топливо
//Статический showTankVolume() показывающий объем бака.
//Использовать showTankVolume() НЕ СОЗДАВ ОБЪЕКТ. Затем создать объект класса и использовать нестатические методы.