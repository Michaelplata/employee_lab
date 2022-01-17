import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PilotTest {
    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("George", RankType.CAPTAIN, "G12345");
    }

    @Test
    public void hasName() {
        assertEquals("George", pilot.getName());
    }

    @Test
    public void hasRank() {
        assertEquals(RankType.CAPTAIN, pilot.getRank());
    }

    @Test
    public void hasLicenceNumber() {
        assertEquals("G12345", pilot.getLicenceNumber());
    }

    @Test
    public void canFlyPlane(){
        assertEquals("Fasten your seatbelt please", pilot.flyPlane());
    }
}