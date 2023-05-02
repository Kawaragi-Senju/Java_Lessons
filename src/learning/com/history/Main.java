package learning.com.history;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        HistoricalDatePrinter<HistricalDateAndPeople> histricalDateAndPeopleHistoricalDatePrinter = new HistoricalDatePrinter<>();
        HistricalDateAndPeople histricalDateAndPeople = new HistricalDateAndPeople();
        histricalDateAndPeople.date = new GregorianCalendar(1990, Calendar.SEPTEMBER, 24);
        histricalDateAndPeople.dateDescription = "fsdfssgrsf";
        histricalDateAndPeople.info = new String[]{"fdsf", "dsafd", "fdksfs"};
        histricalDateAndPeopleHistoricalDatePrinter.print(histricalDateAndPeople);
    }
}
//    Создать абстрактный класс ИсторическаяДата. Определить в нем два поля:
//        Calendar  date
//        String dateDescription
//        Определить в нем метод toString() который выводить на экран дату и ее описание.  Конструктор класса должен принимать значения для обоих полей.
//        Реализовать наследника этого – класс ИсторическаяДатаИЛюди, который имеет дополнительное поле – массив СвязанныеС ДатойЛюди.
//        Это поле так же должно приниматься в конструкторе.
//        Переопределить toString()
//        таким образом, чтобы помимо даты и ее описания выводилась надпись: «Связанные личности:» и далее список людей, связанных с этой датой.
//        Реализовать класс HistoricalDatePrinter. Использовать в нем обобщения таким образом, чтобы класс работал только с ИсторическаяДата и его наследниками.
//        Создать метод print() принимающий на вход объект обобщенного типа и вызывающий у него метод toString().
//        В main() созать объект ИсторическаяДатаИЛюди и HistoricalDatePrinter. Использовать последний для вывода даты на экран.
