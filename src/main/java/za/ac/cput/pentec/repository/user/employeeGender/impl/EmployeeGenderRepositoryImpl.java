package za.ac.cput.pentec.repository.user.employeeGender.impl;

import za.ac.cput.pentec.domain.user.employeeGender.EmployeeGender;
import za.ac.cput.pentec.domain.user.employee.Employee;
import za.ac.cput.pentec.repository.user.employee.EmployeeRepository;
import za.ac.cput.pentec.repository.user.employeeGender.EmployeeGenderRepository;


import java.util.HashSet;
import java.util.Set;

public class EmployeeGenderRepositoryImpl implements EmployeeGenderRepository {

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
    public Set<EmployeeGender> getAll(){
        return this.employeeGenderSet;
    }

    @Override
    public EmployeeGender create(EmployeeGender employeeGender) {
        if(read(employeeGender.getEmployeeId())  == null){
            this.employeeGenderSet.add(employeeGender);
        }
        return employeeGender;
    }

    @Override
    public EmployeeGender read(String s) {
        return employeeGenderSet.stream()
                .filter(employeeGender -> s.equalsIgnoreCase(employeeGender.getEmployeeId()))
                .findAny()
                .orElse(null);
    }

    @Override
    public EmployeeGender update(EmployeeGender employeeGender) {
        if (read(employeeGender.getEmployeeId()) !=null){
            delete(employeeGender.getEmployeeId());
            create(employeeGender);
        }
        return read(employeeGender.getEmployeeId());
    }

    @Override
    public void delete(String s) {
        EmployeeGender employeeGender = read(s);
        this.employeeGenderSet.remove(employeeGender);
    }
}
