import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;

    @Before
    public void before(){
        library = new Library();
        book1 = new Book("The Pragmatic Programmer", "Andrew Hunt et al", "Computer Science");
        book2 = new Book("Risk Savvy", "Gerd Gigerenzer", "Psychology");
        book3 = new Book("Obstacle is the way", "Ryan Holiday", "Philosophy");
    }

    @Test
    public void canCountBook(){
        assertEquals(0, library.countBook());
    }

    @Test
    public void canAddBook(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(3, library.countBook());
    }

    @Test
    public void canCheckCapacity(){
        assertEquals(3, library.checkCapacity());
    }

    @Test
    public void canCheckStockBeforeAdd(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book1);
        assertEquals(3, library.countBook());
    }
}
