package info.mahfuz.bookservice.controller;

import info.mahfuz.bookservice.model.Book;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    private List<Book> books;

    public BookController() {
        books = new ArrayList<>();
        books.add(new Book(1, "Test Book 1"));
        books.add(new Book(2, "Test Book 2"));
        books.add(new Book(3, "Test Book 3"));
        books.add(new Book(4, "Test Book 4"));
    }

    @RequestMapping("/get/{id}")
    public Book getUserBooks(@PathVariable("id") int id) {
        return this.books.stream().filter(book -> book.getId() == id).findAny().orElse(null);
    }
}
