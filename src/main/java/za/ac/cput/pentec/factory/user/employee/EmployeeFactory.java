package za.ac.cput.pentec.factory.user.employee;

import za.ac.cput.pentec.domain.user.employee.Employee;

public class EmployeeFactory {
    public static Employee createEmployee(String f,String l){
        return new Employee.Builder()
                .firstName(f)
                .lastName(l)
                .build();
    }
}
