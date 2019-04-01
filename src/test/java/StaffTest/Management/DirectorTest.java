package StaffTest.Management;

import Staff.Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void setup() {
        director = new Director("Ruben", 001, 2000.00, 6000.00);
    }

    @Test
    public void gettersTest() {
        assertEquals("Ruben", director.getName());
        assertEquals(001, director.getNiNumber());
        assertEquals(2000.00, director.getSalary(), 0.001);
        assertEquals(6000.00, director.getBudget(), 0.001);
    }

}
