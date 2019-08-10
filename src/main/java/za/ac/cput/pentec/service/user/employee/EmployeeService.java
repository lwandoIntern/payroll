package za.ac.cput.pentec.service.user.employee;

import za.ac.cput.pentec.domain.user.employee.Employee;
import za.ac.cput.pentec.service.IService;

import java.util.Set;


public interface EmployeeService extends IService<Employee,String> {
    Set<Employee> getAll();
}
