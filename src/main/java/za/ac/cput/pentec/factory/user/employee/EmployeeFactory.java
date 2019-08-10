package za.ac.cput.pentec.factory.user.employee;

import za.ac.cput.pentec.domain.user.employee.Employee;
import za.ac.cput.pentec.util.Misc;

public class EmployeeFactory {
    public static Employee createEmployee(String f,String l){
        return new Employee.Builder()
                .employeeId(Misc.generateId())
                .firstName(f)
                .lastName(l)
                .build();
    }
}
