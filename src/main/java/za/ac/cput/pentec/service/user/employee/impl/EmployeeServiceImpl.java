package za.service.employee.impl;

import za.ac.cput.pentec.domain.user.employee.Employee;
import za.repository.employee.impl.EmployeeRepositoryImpl;
import za.service.employee.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
    private static EmployeeServiceImpl service = null;
    private EmployeeRepositoryImpl repository;
    private EmployeeServiceImpl(){
        this.repository = new EmployeeRepositoryImpl();
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
    public Employee update(String s) {
        return repository.update(s);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);
    }
}
