package learning.com.mounths;

public enum Mounths {
    JANUARY("winter", 1),
    FEBRUARY("winter", 2),
    MARCH("spring", 3),
    APRIL("spring", 4 ),
    MAY("spring", 5),
    JUNE("summer", 6),
    JULY("summer", 7),
    AUGUST("summer", 8),
    SEPTEMBER("autumn", 9),
    OCTOBER("autumn", 10),
    NOVEMBER("autumn", 11),
    DECEMBER("winter", 12);
    String vremyagoda;
    int number;
    Mounths(String vremyagoda, int number){
        this.vremyagoda = vremyagoda;
    }

    static String checkMounth(Mounths ... mounths) {
        Mounths[] m = Mounths.values();
        for (int i = 0; i < m.length; i++) {
            if (m[i] == null) {

            }
        }
        return null;
    }
}
//    Создать перечисление «Месяцы» в котором будут перечислены все месяцы года подряд от января к декабрю. Каждый месяц будет относиться к определенному времени года.
//    Для того, чтобы указать к какому времени года относиться месяц можно использовать специальное поле внутри перечисления и задавать его значение в конструкторе.
//    Написать  метод checkMonth(Month m):
//        1.    В качестве аргумента в метод кладут месяц.
//        2.    Необходимо вывести на экран его имя на русском, его порядковый номер.
//        3.     Так же на экране вывести месяцы относящиеся к этому времени года.
//        Пример:
//        check(Month.January)
//        На экране должно быть выведено:
//        Январь 1 Февраль Декабрь
//        Для вывода попробуйте переопределить toString()