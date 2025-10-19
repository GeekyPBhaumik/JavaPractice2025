package com.corejavapractice.JavaPractice.association;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

/**
 * Aggregation is a type of association where it is considered to be a weak association
 * because the contained object here b1 for example, can survive without the container object (library)
 * It is because the object is not created inside the class rather it is created outside and then
 * send as a reference to the other class
 */


@ToString
@Getter
@Setter
class Library{
    private String libraryName;
    private List<Book> books;
    public Library(String libraryName, List<Book> books){
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }
    public List<Book> addBooks(Book book){
        this.books.add(book);
        return books;
    }
    public boolean removeBooks(Book book){
        return this.books.remove(book);
    }
}

@ToString
class Book{
    private String bookName;
    private String authorName;
    public Book(String bookName, String authorName){
        this.bookName = bookName;
        this.authorName = authorName;
    }
}

public class Aggregation {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "John Doe");
        Book b2  = new Book("Advanced Java", "Jane Smith");
        // 1. Add books
        Library library = new Library("City Library", new ArrayList<>());
        library.addBooks(b1);
        library.addBooks(b2);
        System.out.println("After adding books in library:"+library.getBooks());
        System.out.println("Removing books");
        // 2. Remove b1 from the Library
        boolean isBookRemoved = library.removeBooks(b1);
        if(isBookRemoved)
        // 3. Show the Library content after removal
            System.out.println("After Removing books in library:"+library.getBooks());
        // 4. Show that b1 still exists independently
        System.out.println("\n--- Independent Book Object ---");
        System.out.println("b1 still exists: " + b1);
    }
}
