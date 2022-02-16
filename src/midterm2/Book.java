package midterm2;

import java.util.Set;
import java.util.TreeSet;

public class Book extends Object {

    private String author;
    private String ISBN;
    private String title;
    private Set<String> relatedBooks;
    // private Set<Person> patrons;

    public Book(String author, String ISBN, String title) {
        this.author = author;
        this.ISBN = ISBN;
        this.title = title;
        relatedBooks = new TreeSet<String>();
        relatedBooks.add("Greatest Salesperson in the World");
    }

    public Book(Book book) {
        this(book.author, book.ISBN, book.title);
        this.relatedBooks = book.relatedBooks;
        // this.patrons = new TreeSet<Person>();
    }

}
