package za.ac.cput.pentec.repository.user.employeeGender;

import za.ac.cput.pentec.domain.user.employeeGender.EmployeeGender;
import za.ac.cput.pentec.repository.IRepository;

import java.util.Set;


public interface EmployeeGenderRepository extends IRepository<EmployeeGender,String> {
    Set<EmployeeGender> getAll();
}
