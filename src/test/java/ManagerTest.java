import org.junit.Before;
        import org.junit.Test;
        import staff.management.Manager;

        import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Tim Apple", "AB 01 23 45 C", 100000.00, "Mergers & Acquisitions");
    }

    @Test
    public void hasName() {
        assertEquals("Tim Apple", manager.getName());
    }

    @Test
    public void raiseSalary() {
        manager.raiseSalary(500.00);
        assertEquals(100500.00, manager.getSalary(), 0.001);
    }

    @Test
    public void payBonus() {
        assertEquals(1000.00, manager.payBonus(), 0.001);
    }

}
