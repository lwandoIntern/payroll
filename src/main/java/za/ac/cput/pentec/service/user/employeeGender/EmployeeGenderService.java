package za.ac.cput.pentec.service.user.employeeGender;

import za.ac.cput.pentec.domain.user.employeeGender.EmployeeGender;
import za.ac.cput.pentec.service.IService;

import java.util.Set;

public interface EmployeeGenderService extends IService<EmployeeGender,String> {
    Set<EmployeeGender> getAll();
}
