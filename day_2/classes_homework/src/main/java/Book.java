public class Book {
    private String title;
    private String author;
    private String genre;

    public Book(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }


    public String bookHasTitle() {
        return title;
    }

    public String bookHasAuthor() {
        return author;
    }

    public String bookHasGenre() {
        return genre;
    }
}
