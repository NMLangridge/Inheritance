import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director("Clive Warren", "XY 01 23 45 Z", 200000.00, "Murders & Executions", 999999.99);
    }

    @Test
    public void hasName() {
        assertEquals("Clive Warren", director.getName());
    }

    @Test
    public void raiseSalary() {
        director.raiseSalary(50000.00);
        assertEquals(250000.00, director.getSalary(), 0.001);
    }

    @Test
    public void payBonus() {
        assertEquals(2000.00, director.payBonus(), 0.001);
    }

}
