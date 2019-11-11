import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Chris", "GH 01 23 45 I", 30000.00);
    }

    @Test
    public void raiseSalary() {
        databaseAdmin.raiseSalary(999.00);
        assertEquals(30999.00, databaseAdmin.getSalary(), 0.001);
    }

    @Test
    public void payBonus() {
        assertEquals(300.00, databaseAdmin.payBonus(), 0.001);
    }

}
