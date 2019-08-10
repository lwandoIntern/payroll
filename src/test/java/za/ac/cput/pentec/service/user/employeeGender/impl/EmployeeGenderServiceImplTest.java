package za.ac.cput.pentec.service.user.employeeGender.impl;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.pentec.domain.user.employeeGender.EmployeeGender;
import za.ac.cput.pentec.factory.user.employeeGender.EmployeeGenderFactory;

import static org.junit.Assert.*;

public class EmployeeGenderServiceImplTest {

    private EmployeeGenderServiceImpl service;
    private EmployeeGender employeeGender;
    @Before
    public void setUp() throws Exception {
        service = EmployeeGenderServiceImpl.getService();
        employeeGender = EmployeeGenderFactory.createEmployeeGender();
    }

    @Test
    public void getAll() {
        assertEquals(service.getAll(),service.getAll());
    }

    @Test
    public void create() {
        assertEquals(service.create(employeeGender),service.create(employeeGender));
    }

    @Test
    public void read() {
        assertNull(service.read(""));
    }

    @Test
    public void update() {
        assertNull(service.update(employeeGender));
    }

    @Test
    public void delete() {
        service.delete("");
    }
}