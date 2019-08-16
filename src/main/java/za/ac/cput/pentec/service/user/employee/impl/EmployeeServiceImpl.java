package za.ac.cput.pentec.service.user.employee.impl;

import za.ac.cput.pentec.domain.demography.gender.Gender;
import za.ac.cput.pentec.domain.demography.race.Race;
import za.ac.cput.pentec.domain.user.employee.Employee;
import za.ac.cput.pentec.repository.demography.gender.impl.GenderRepositoryImpl;
import za.ac.cput.pentec.repository.user.employee.impl.EmployeeRepositoryImpl;
import za.ac.cput.pentec.service.user.employee.EmployeeService;

import java.util.Set;


public class EmployeeServiceImpl implements EmployeeService {
    private static EmployeeServiceImpl service = null;
    private EmployeeRepositoryImpl repository;
    private EmployeeServiceImpl(){
        this.repository = new EmployeeRepositoryImpl();
    }

    public static EmployeeServiceImpl getService() {
        if (service == null)service = new EmployeeServiceImpl();
        return service;
    }

    @Override
    public Set<Employee> getAll() {
        return repository.getAll();
    }


    @Override
    public Employee create(Employee employee) {
        return repository.create(employee);
    }

    @Override
    public Employee read(String s) {
        return repository.read(s);
    }

    @Override
    public Employee update(Employee employee) {
        return repository.update(employee);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);
    }
}
