import java.util.ArrayList;

public class Library {
    private ArrayList<Book> stock;
    private int capacity;

    public Library(){
        this.stock = new ArrayList<>();
        capacity = 3;
    }

    public int countBook() {
        return this.stock.size();
    }

    public void addBook(Book book) {
        if (this.capacity > this.stock.size()) {
            this.stock.add(book);
        }
    }

    public int checkCapacity() {
        return this.capacity;
    }
}
