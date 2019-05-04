package info.mahfuz.bookservice.model;

import java.util.List;

public class BookList {
    private List<Book> books;

    public BookList() {
    }

    public BookList(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
