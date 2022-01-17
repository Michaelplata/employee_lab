import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PassengerTest {
    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Mia", 1);
    }

    @Test
    public void hasNAme(){
        assertEquals("Mia", passenger.getName());
    }

    @Test
    public void hasNumberOfBags(){
        assertEquals(1, passenger.getNumberOfBags());
    }

}