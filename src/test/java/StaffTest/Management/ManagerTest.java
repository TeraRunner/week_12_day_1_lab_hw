package StaffTest.Management;

import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void setup() {
        manager = new Manager( "Ruben", 001, 2000.00,"Level Design");
    }

    @Test
    public void gettersTest() {
        assertEquals("Ruben", manager.getName());
        assertEquals(001, manager.getNiNumber());
        assertEquals(2000.00, manager.getSalary(), 0.001);
        assertEquals("Level Design", manager.getDepartmentName());
    }

}
