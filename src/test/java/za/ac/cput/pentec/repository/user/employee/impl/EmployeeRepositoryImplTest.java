package za.ac.cput.pentec.repository.user.employee.impl;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.pentec.domain.user.employee.Employee;
import za.ac.cput.pentec.factory.user.employee.EmployeeFactory;

import static org.junit.Assert.*;

public class EmployeeRepositoryImplTest {

    EmployeeRepositoryImpl repository;
    Employee employee;
    @Before
    public void setUp() throws Exception {
        repository = EmployeeRepositoryImpl.getRepository();
        employee = EmployeeFactory.createEmployee("Zizo","tshwetha");
    }

    @Test
    public void create() {
        assertNotNull(repository.create(employee));
    }

    @Test
    public void read() {
        assertNull(repository.read(employee.getFirstName()));
    }

    @Test
    public void update() {
        assertNull(repository.update(employee));
    }

    @Test
    public void delete() {
        repository.delete(employee.getFirstName());
    }
}