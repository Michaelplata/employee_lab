import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BookTest {
    Book book;
    Book book1;
    Book book2;
    Book book3;

    @Before
    public void setUp(){
        book = new Book("Introduction to Algorithms", "Thomas H. Cormen et al", "Computer Science");

    }

    @Test
    public void bookHasTitle(){
       assertEquals("Introduction to Algorithms", book.bookHasTitle());
    }

    @Test
    public void bookHasAuthor(){
        assertEquals("Thomas H. Cormen et al", book.bookHasAuthor());
    }

    @Test
    public void bookHasGenre(){
        assertEquals("Computer Science", book.bookHasGenre());
    }
}
