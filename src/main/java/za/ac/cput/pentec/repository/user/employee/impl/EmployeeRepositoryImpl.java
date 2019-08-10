package za.ac.cput.pentec.repository.user.employee.impl;



import za.ac.cput.pentec.domain.user.employee.Employee;
import za.ac.cput.pentec.repository.user.employee.EmployeeRepository;

import java.util.*;

public class EmployeeRepositoryImpl implements EmployeeRepository {
    private static EmployeeRepositoryImpl repository = null;
    Map<String, Employee> map;


    public EmployeeRepositoryImpl(){
        this.map = new HashMap<>();
    }
    public static EmployeeRepositoryImpl getRepository(){
        if (repository == null)repository = new EmployeeRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Employee> getAll() {
        Collection employees = this.map.values();
        Set<Employee> set = new HashSet<>();
        set.addAll(employees);
        return set;
    }

    @Override
    public Employee create(Employee employee) {
        if(read(employee.getEmployeeId())  == null){
            this.map.put(employee.getEmployeeId(),employee);
        }
        return this.map.get(employee.getEmployeeId());
    }

    @Override
    public Employee read(String s) {
        return this.map.get(s);
    }

    @Override
    public Employee update(Employee employee) {
        if (this.map.get(employee.getEmployeeId())!= null){
            delete(employee.getEmployeeId());
            create(employee);
        }
        return this.map.get(employee.getEmployeeId());
    }

    @Override
    public void delete(String s) {
        this.map.remove(s);
    }
}
