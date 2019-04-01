package StaffTest.TechStaff;

import Staff.TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DeveloperTest {

    Developer developer;

    @Before
    public void setup() {
        developer = new Developer( "Ruben", 001, 2000.00);
    }

    @Test
    public void gettersTest() {
        assertEquals("Ruben", developer.getName());
        assertEquals(001, developer.getNiNumber());
        assertEquals(2000.00, developer.getSalary(), 0.001);
    }
}
