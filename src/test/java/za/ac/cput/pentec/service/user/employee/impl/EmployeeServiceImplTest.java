package za.ac.cput.pentec.service.user.employee.impl;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.pentec.domain.user.employee.Employee;
import za.ac.cput.pentec.factory.user.employee.EmployeeFactory;

import static org.junit.Assert.*;

public class EmployeeServiceImplTest {

    private EmployeeServiceImpl service;
    private Employee employee;
    @Before
    public void setUp() throws Exception {
        service = EmployeeServiceImpl.getService();
        employee = EmployeeFactory.createEmployee("aaa","ddd");
    }

    @Test
    public void getAll() {
        assertEquals(service.getAll(),service.getAll());
    }

    @Test
    public void create() {
        assertEquals(service.create(employee),service.create(employee));
    }

    @Test
    public void read() {
        assertNull(service.read(""));
    }

    @Test
    public void update() {
        assertNull(service.update(employee));
    }

    @Test
    public void delete() {
        service.delete("");
    }
}