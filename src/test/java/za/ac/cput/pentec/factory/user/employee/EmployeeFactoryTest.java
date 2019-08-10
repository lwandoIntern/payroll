package za.ac.cput.pentec.factory.user.employee;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.pentec.domain.user.employee.Employee;

import static org.junit.Assert.*;

public class EmployeeFactoryTest {

    Employee employee;
    @Before
    public void setUp() throws Exception {
        employee = EmployeeFactory.createEmployee("Jonga","Zondo");
    }

    @Test
    public void createEmployee() {
        assertEquals(employee.getFirstName(),"Jonga");
    }
}