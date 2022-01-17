import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember;

    @Before
    public void before(){
        cabinCrewMember = new CabinCrewMember("Simon", RankType.FLIGHT_ATTENDANT);
    }

    @Test
    public void hasName() {
        assertEquals("Simon", cabinCrewMember.hasName());
    }

    @Test
    public void hasRank() {
        assertEquals(RankType.FLIGHT_ATTENDANT, cabinCrewMember.getRank());
    }

    @Test
    public void canRelayMessage() {
        assertEquals("Enjoy your trip", cabinCrewMember.relayMessage());
    }
}