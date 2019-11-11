import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Niall", "DE 01 23 45 F", 25000.00);
    }

    @Test
    public void raiseSalary() {
        developer.raiseSalary(100.00);
        assertEquals(25100.00, developer.getSalary(), 0.001);
    }

    @Test
    public void payBonus() {
        assertEquals(250.00, developer.payBonus(), 0.001);
    }

}
