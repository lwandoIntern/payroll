package za.ac.cput.pentec.repository.user.employee;

import za.ac.cput.pentec.domain.user.employee.Employee;
import za.ac.cput.pentec.repository.IRepository;

import java.util.Set;


public interface EmployeeRepository extends IRepository<Employee,String> {
    Set<Employee> getAll();
}
