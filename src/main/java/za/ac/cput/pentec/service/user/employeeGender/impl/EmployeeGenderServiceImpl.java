package za.ac.cput.pentec.service.user.employeeGender.impl;

import za.ac.cput.pentec.domain.user.employeeGender.EmployeeGender;
import za.ac.cput.pentec.repository.user.employeeGender.impl.EmployeeGenderRepositoryImpl;
import za.ac.cput.pentec.service.user.employeeGender.EmployeeGenderService;

import java.util.Set;

public class EmployeeGenderServiceImpl implements EmployeeGenderService {
    private static EmployeeGenderServiceImpl service = null;
    private EmployeeGenderRepositoryImpl repository;

    private EmployeeGenderServiceImpl(){
        this.repository = EmployeeGenderRepositoryImpl.getRepository();
    }

    @Override
    public Set<EmployeeGender> getAll() {
        return repository.getAll();
    }

    @Override
    public EmployeeGender create(EmployeeGender employeeGender) {
        return repository.create(employeeGender);
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
