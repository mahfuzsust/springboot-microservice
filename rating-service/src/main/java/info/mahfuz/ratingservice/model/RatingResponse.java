package info.mahfuz.ratingservice.model;

public class RatingResponse {
    private int id;
    private User user;
    private Book book;
    private int rating;

    public RatingResponse() {
    }

    public RatingResponse(int id, User user, Book book, int rating) {
        this.id = id;
        this.user = user;
        this.book = book;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
