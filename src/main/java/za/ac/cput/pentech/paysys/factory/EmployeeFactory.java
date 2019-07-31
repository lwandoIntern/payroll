package za.ac.cput.pentech.paysys.factory;

import za.ac.cput.pentech.paysys.domain.employee.Employee;

public class EmployeeFactory {
    public static Employee createEmployee(String f,String l){
        return new Employee.Builder()
                .firstName(f)
                .lastName(l)
                .build();
    }
}
