import Staff.techStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDatabaseAdmin {
    public DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("John", "GB12348", 24000);
    }

    @Test

    public void hasName(){
        assertEquals("John", databaseAdmin.getName());
    }

    @Test

    public void hasInsuranceNumber(){
        assertEquals("GB12348", databaseAdmin.getNInumber());
    }

    @Test

    public void hasSalary(){
        assertEquals(24000, databaseAdmin.getSalary());
    }



    @Test

    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(10000.0);
        assertEquals(34000, databaseAdmin.getSalary());
    }

    @Test

    public void canAddBonus(){
        assertEquals(240, databaseAdmin.payBonus(), 0.0);
    }

}
