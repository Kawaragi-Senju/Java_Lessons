package learning.com.books;

public class Book {
    String name;

    public Book(String name){
        this.name = name;
    }

    @Override
    public boolean equals(Object book){
        if((book != null) && (book instanceof Book) && (name != null)){
            return name.equals(((Book)book).name);
        }else{
            return false;
        }
    }
}
