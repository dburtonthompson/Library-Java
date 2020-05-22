
public class Book extends LibraryItem {
    private String title;
    private int yearPublished;
    private Author author;

    public Book(String title, String author, int yearPublished, Author author) {
        this.title = title;
        this.yearPublished = yearPublished;
        this.author = new Author(name);
    }

    public String getTitle() {
        return title;
    }

    public Auther getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    @Override
    public String toString() {
        return this.getTitle() + " by " + this.getAuthor() + " published " + this.yearPublished;
    }

}