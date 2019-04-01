package StaffTest;

import Staff.Employee;
import Staff.TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    Employee employee;

    @Before
    public void setup() {
        employee = new Developer("Ruben", 001, 2000.00);
    }

    @Test
    public void settersTest() {
        employee.setName("Paco");
        assertEquals("Paco", employee.getName());
        employee.setNiNumber(002);
        assertEquals(002, employee.getNiNumber());
        employee.setSalary(2400.00);
        assertEquals(2400.00, employee.getSalary(), 0.001);
    }

    @Test
    public void raiseSalaryTest() {
        employee.raiseSalary(200.00);
        assertEquals(2200.00, employee.getSalary(), 0.001);
    }

    @Test
    public void payBonusTest() {
        assertEquals(2200, employee.payBonus(10, 2000.00), 0.001);
    }

}
