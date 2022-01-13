import Staff.Employee;
import Staff.Management.Director;
import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestDirector {
    public Employee employee;
    public Manager manager;
    public Director director;

    @Before

    public void before(){
        director = new Director("Allan", "GB12341", 40000, "IT", 30000);

    }

    @Test

    public void hasName(){
        assertEquals("Allan", director.getName());
    }

    @Test

    public void hasInsuranceNumber(){
        assertEquals("GB12341", director.getNInumber());
    }

    @Test

    public void hasSalary(){
        assertEquals(40000, director.getSalary());
    }

    @Test

    public void hasBudget(){
        assertEquals(30000, director.getBudget(), 0.0);
    }

    @Test

    public void hasDepartmentName(){
        assertEquals("IT", director.getDeptName());
    }

    @Test

    public void canRaiseSalary(){
        director.raiseSalary(10000.0);
        assertEquals(50000, director.getSalary());
    }

    @Test

    public void canAddBonus(){
        assertEquals(400, director.payBonus(), 0.0);
    }

}

