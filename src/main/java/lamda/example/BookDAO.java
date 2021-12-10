package lamda.example;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {

    public List<Book> getBook() {
        List<Book> books = new ArrayList<>();
        books.add(new Book(100, "Core Java", 400));
        books.add(new Book(200, "C++", 500));
        books.add(new Book(300, "Python", 100));
        books.add(new Book(400, "Node JS", 400));
        return books;
    }
}
