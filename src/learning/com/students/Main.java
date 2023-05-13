package learning.com.students;

public class Main {
    public static void main(String[] args) {
        Journal journal = new Journal();
        Student student = new Student("Ivan", 4, 5, 3);
        Student student1 = new Student("Petr", 5, 5, 4);
        Student student2 = new Student("Kolya", 4, 3,3);
        Student student3 = new Student("dfs", 3, 2,3);
        Student student4 = new Student("adfg", 5, 5,5);
        journal.add(student);
        journal.add(student1);
        journal.add(student2);
        journal.add(student3);
        journal.add(student4);
        journal.expel();
    }
}

//    Создать класс Студент с полями:
//        Имя
//        Оценка по математическому анализу
//        Оценка по Физике
//        Оценка по Электротехнике
//        Объявить метод посчитатьСреднийБалл
//
//        Создать класс журнал, хранящий коллекцию объектов класса Студент
//        Объявить метод зачислить, к-ый добавляет студента в журнал. У студента должны быть заполнены все существующие поля.
//        Объявить метод зачислитьВсех, зачисляющий группу студентов
//        Объявить метод отчислить, удаляющий из журнала всех студентов со средним баллом ниже 3. На экран вывести имена отчисленных студентов.
//        Объявить метод содержит, проверяющий, существует ли данный студент в журнале. Метод принимает экземпляр студента в качестве аргумента.
