package za.ac.cput.pentec.repository.user.employeeGender.impl;

import za.ac.cput.pentec.domain.user.employeeGender.EmployeeGender;
import za.ac.cput.pentec.domain.user.employee.Employee;
import za.ac.cput.pentec.repository.user.employee.EmployeeRepository;


import java.util.HashSet;
import java.util.Set;

public class EmployeeGenderRepositoryImpl implements EmployeeRepository {

    private static EmployeeGenderRepositoryImpl repository = null;
    private Set<EmployeeGender> employeeGenderSet;


    private EmployeeGenderRepositoryImpl(){
        this.employeeGenderSet = new HashSet<>();
    }

    public static EmployeeGenderRepositoryImpl getRepository() {
        if (repository == null)repository = new EmployeeGenderRepositoryImpl();
        return repository;
    }

    @Override
    public Employee create(Employee employee) {
        return null;
    }

    @Override
    public Employee read(String s) {
        return null;
    }

    @Override
    public Employee update(String s) {
        return null;
    }

    @Override
    public void delete(String s) {

    }
}
