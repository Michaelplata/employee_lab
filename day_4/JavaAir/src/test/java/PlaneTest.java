import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void hasPlaneType(){
        assertEquals(PlaneType.BOEING747, plane.getPlaneType());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(PlaneType.BOEING747.getCapacity(), plane.getGapacity());
    }

    @Test
    public void canGetTotalWeight() {
        assertEquals(PlaneType.BOEING747.getTotalWeight(), plane.getTotalWeight());
    }
}