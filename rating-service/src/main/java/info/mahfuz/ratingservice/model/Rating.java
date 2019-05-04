package info.mahfuz.ratingservice.model;

public class Rating {
    private int id;
    private int rating;
    private int userId;
    private int bookId;

    public Rating() {
    }

    public Rating(int id, int rating, int userId, int bookId) {
        this.id = id;
        this.rating = rating;
        this.userId = userId;
        this.bookId = bookId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
