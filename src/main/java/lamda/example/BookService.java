package lamda.example;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {

    public List<Book> getBooksinSort(){
        List<Book>  books = new BookDAO().getBook();
       // Collections.sort(books,new MyComparator());//Old method of doing it.
        /*Collections.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });*/
        Collections.sort(books,(o1,o2)-> o1.getName().compareTo(o2.getName()));//Using functional interface
        return books;
    }
    public static void main(String[] args) {
        System.out.println(new BookService().getBooksinSort());
    }
}

/*class MyComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2){
        return o1.getName().compareTo(o2.getName());
    }
}*/
