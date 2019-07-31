package za.ac.cput.pentech.paysys.factory;

import za.ac.cput.pentech.paysys.domain.EmployeeGender;
import za.ac.cput.pentech.paysys.domain.employee.Employee;
import za.ac.cput.pentech.paysys.util.Misc;

public class EmployeeGenderFactory {
    public static EmployeeGender createEmployeeGender(){
        return new EmployeeGender.Builder()
                .employeeId(Misc.generateId())
                .genderId(Misc.generateId())
                .build();
    }
}
