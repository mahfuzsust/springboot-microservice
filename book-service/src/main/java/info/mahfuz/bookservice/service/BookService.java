package info.mahfuz.bookservice.service;

import info.mahfuz.bookservice.model.Book;

public interface BookService {
    Book saveBook(Book book);
    Book getBook(int id);
}
