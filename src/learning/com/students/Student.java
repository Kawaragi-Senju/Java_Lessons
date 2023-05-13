package learning.com.students;

public class Student {
    String name;
    int math;
    int physic;
    int electrical_engineering;

    public Student(String name, int math, int physic, int electrical_engineering) {
        this.name = name;
        this.math = math;
        this.physic = physic;
        this.electrical_engineering = electrical_engineering;
    }

    public int middleMark() {
        return ((math + physic + electrical_engineering) / 3);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Student)) {
            return false;
        }
        Student student;
        student = (Student) o;
        return ((student.name.equals(this.name))
                && (student.math == this.math)
                && student.physic == this.physic
                && student.electrical_engineering == this.electrical_engineering);
    }
}
//    Создать класс Студент с полями:
//        Имя
//        Оценка по математическому анализу
//        Оценка по Физике
//        Оценка по Электротехнике
//        Объявить метод посчитатьСреднийБалл
