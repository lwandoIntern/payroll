package za.ac.cput.pentech.paysys.repository.employee.impl;

import za.ac.cput.pentech.paysys.domain.employee.Employee;
import za.ac.cput.pentech.paysys.factory.EmployeeFactory;
import za.ac.cput.pentech.paysys.repository.employee.EmployeeRepository;

import java.util.HashMap;
import java.util.Map;

public class EmployeeRepositoryImpl implements EmployeeRepository {
    private static EmployeeRepositoryImpl repository = null;
    Map<String,Employee> map;


    public EmployeeRepositoryImpl(){
        this.map = new HashMap<>();
    }
    public EmployeeRepositoryImpl getRepository(){
        if (repository == null)repository = new EmployeeRepositoryImpl();
        return repository;
    }

    @Override
    public Employee create(Employee employee) {
        this.map.put(employee.toString(),employee);
        return this.map.get(employee.toString());
    }

    @Override
    public Employee read(String s) {
        return this.map.get(s);
    }

    @Override
    public Employee update(String s) {
        if (this.map.containsKey(s)){

        }
        return this.map.get(s);
    }

    @Override
    public void delete(String s) {
        this.map.remove(s);
    }
}
