import Staff.techStaff.DatabaseAdmin;
import Staff.techStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDeveloper {
    public Developer developer;

    @Before
    public void before(){
            developer = new Developer("John", "GB12348", 24000);
    }

    @Test

    public void hasName(){
        assertEquals("John", developer.getName());
    }

    @Test

    public void hasInsuranceNumber(){
        assertEquals("GB12348", developer.getNInumber());
    }

    @Test

    public void hasSalary(){
        assertEquals(24000, developer.getSalary());
    }



    @Test

    public void canRaiseSalary(){
        developer.raiseSalary(10000.0);
        assertEquals(34000, developer.getSalary());
    }

    @Test

    public void canAddBonus(){
        assertEquals(240, developer.payBonus(), 0.0);
    }

}

