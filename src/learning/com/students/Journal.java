package learning.com.students;

import java.util.LinkedList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Journal{
    private List<Student> list = new LinkedList<>();

    public void add(Student s){
        list.add(s);
    }

    public void addAll(Collection<Student> studentCollection){
        list.addAll(studentCollection);
    }

    public void expel() {
        Iterator<Student> iter;
        iter = list.iterator();
        float i;
        do {
            Student student = iter.next();
            i = student.middleMark();
            if (i < 3) {
                System.out.println(student.name);
                iter.remove();
            }
        } while (iter.hasNext());
    }

    public boolean exist(Student s){
       return list.contains(s);
    }

}
//        Объявить метод зачислить, к-ый добавляет студента в журнал. У студента должны быть заполнены все существующие поля.
//        Объявить метод зачислитьВсех, зачисляющий группу студентов
//        Объявить метод отчислить, удаляющий из журнала всех студентов со средним баллом ниже 3. На экран вывести имена отчисленных студентов.
//        Объявить метод содержит, проверяющий, существует ли данный студент в журнале. Метод принимает экземпляр студента в качестве аргумента.

