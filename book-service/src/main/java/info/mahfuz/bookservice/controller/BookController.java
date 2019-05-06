package info.mahfuz.bookservice.controller;

import info.mahfuz.bookservice.model.Book;
import info.mahfuz.bookservice.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService service;

    @RequestMapping("/get/{id}")
    public Book getUserBooks(@PathVariable("id") int id) {
        if(service.getBook(1) == null) {
            service.saveBook(new Book("Test Book 1"));
            service.saveBook(new Book("Test Book 2"));
            service.saveBook(new Book("Test Book 3"));
            service.saveBook(new Book("Test Book 4"));
        }
        return service.getBook(id);
    }
}
