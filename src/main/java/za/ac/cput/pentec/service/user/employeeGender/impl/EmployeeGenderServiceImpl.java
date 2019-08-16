package za.ac.cput.pentec.service.user.employeeGender.impl;

import za.ac.cput.pentec.domain.user.employee.Employee;
import za.ac.cput.pentec.domain.user.employeeGender.EmployeeGender;
import za.ac.cput.pentec.repository.user.employeeGender.impl.EmployeeGenderRepositoryImpl;
import za.ac.cput.pentec.service.user.employee.EmployeeService;
import za.ac.cput.pentec.service.user.employee.impl.EmployeeServiceImpl;
import za.ac.cput.pentec.service.user.employeeGender.EmployeeGenderService;

import java.util.Set;

public class EmployeeGenderServiceImpl implements EmployeeGenderService {
    private static EmployeeGenderServiceImpl service = null;
    private EmployeeGenderRepositoryImpl repository;

    private EmployeeGenderServiceImpl(){
        this.repository = EmployeeGenderRepositoryImpl.getRepository();
    }

    public static EmployeeGenderServiceImpl getService() {
        if (service == null)service = new EmployeeGenderServiceImpl();
        return service;
    }

    @Override
    public Set<EmployeeGender> getAll() {
        return repository.getAll();
    }

    @Override
    public EmployeeGender create(EmployeeGender employeeGender) {
        return repository.create(employeeGender);
    }
    public static EmployeeService getEmployeeService(){
        return EmployeeServiceImpl.getService();
    }

    @Override
    public EmployeeGender read(String s) {
        return repository.read(s);
    }

    @Override
    public EmployeeGender update(EmployeeGender employeeGender) {
        return repository.update(employeeGender);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);
    }
}
