package za.ac.cput.pentec.repository.user.employeeGender.impl;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.pentec.domain.user.employeeGender.EmployeeGender;
import za.ac.cput.pentec.factory.user.employeeGender.EmployeeGenderFactory;

import static org.junit.Assert.*;

public class EmployeeGenderRepositoryImplTest {

    EmployeeGenderRepositoryImpl repository;
    EmployeeGender employeeGender;
    @Before
    public void setUp() throws Exception {
        repository = EmployeeGenderRepositoryImpl.getRepository();
        employeeGender = EmployeeGenderFactory.createEmployeeGender();
    }

    @Test
    public void create() {
        assertNotNull(repository.create(employeeGender));
    }

    @Test
    public void read() {
        assertNull(repository.read(employeeGender.getEmployeeId()));
    }

    @Test
    public void update() {
        assertNull(repository.update(employeeGender));
    }

    @Test
    public void delete() {
        repository.delete(employeeGender.getEmployeeId());
    }
}