package za.ac.cput.pentec.factory.user.employeeGender;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.pentec.domain.user.employeeGender.EmployeeGender;

import static org.junit.Assert.*;

public class EmployeeGenderFactoryTest {

    EmployeeGender employeeGender;
    @Before
    public void setUp() throws Exception {
        employeeGender = EmployeeGenderFactory.createEmployeeGender();
    }

    @Test
    public void createEmployeeGender() {
        assertNotNull(employeeGender.getEmployeeId(),employeeGender.getEmployeeId());
    }
}