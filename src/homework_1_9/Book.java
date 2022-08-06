package homework_1_9;

public class Book {

    private final String bookName;
    public Author author;
    private int dateOfPublication;

    public Book(String bookName, Author author, int dateOfPublication) {
        this.bookName = bookName;
        this.author = author;
        this.dateOfPublication = dateOfPublication;
    }

    public String getBookName() {
        return this.bookName;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getDateOfPublication() {
        return this.dateOfPublication;
    }

    public void setDateOfPublication(int dateOfPublication) {
        this.dateOfPublication = dateOfPublication;
    }
}
