package learning.com.book;

public class Book {
    String name;
    String author;

    @Override
    public boolean equals(Object object){
        if((object instanceof Book)){
            return ((Book) object).name.equals(this.name) && ((Book) object).author.equals(this.author);
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
       return  author + " " + name;
    }
}
