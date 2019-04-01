package StaffTest.TechStaff;

import Staff.TechStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void setup() {
        databaseAdmin = new DatabaseAdmin("Ruben", 001, 2000.00);
    }

    @Test
    public void gettersTest() {
        assertEquals("Ruben", databaseAdmin.getName());
        assertEquals(001, databaseAdmin.getNiNumber());
        assertEquals(2000.00, databaseAdmin.getSalary(), 0.001);
    }

}
