package info.mahfuz.bookservice.service.impl;

import info.mahfuz.bookservice.model.Book;
import info.mahfuz.bookservice.repository.BookRepository;
import info.mahfuz.bookservice.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository repository;

    @Override
    public Book saveBook(Book book) {
        Book savedBook = repository.save(book);
        return savedBook;
    }

    @Override
    public Book getBook(int id) {
        Optional<Book> book = repository.findById(id);
        if(book.isEmpty()) {
            return null;
        }
        return book.get();
    }
}
