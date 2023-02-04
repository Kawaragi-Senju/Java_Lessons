package learning.com.book;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        book.author = "Sfds";
        book.name = "LOTR";

        Book book1 = new Book();
        book1.author = "Sfds";
        book1.name = "WAP";

        Book book2 = new Book();
        book2.author = "Sfds";
        book2.name = "DUNE";

        Book book3 = new Book();
        book3.author = "Sfds";
        book3.name = "LOTR";

        Book book4 = new Book();
        book4.author = "Sfds";
        book4.name = "LOTR";

        Book[] m = {book1, book2, book3, book4};
        for (Book value : m) {
            if (book.equals(value)) {
                System.out.println(value);
                break;
            }
        }
    }
}
