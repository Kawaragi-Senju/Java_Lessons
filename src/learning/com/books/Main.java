package learning.com.books;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("dfsf");
        Book book1 = new Book("dfsf");
        List<Book> list = new ArrayList<>();
        list.add(book);
        list.add(new Book("slkdaf"));
        list.add(new Book("slkdaf213"));
        System.out.println(list.contains(book1));
    }
}
