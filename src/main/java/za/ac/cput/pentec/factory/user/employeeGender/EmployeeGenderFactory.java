package za.ac.cput.pentec.factory.user.employeeGender;

import za.ac.cput.pentec.domain.user.employeeGender.EmployeeGender;
import za.ac.cput.pentec.util.Misc;


public class EmployeeGenderFactory {
    public static EmployeeGender createEmployeeGender(){
        return new EmployeeGender.Builder()
                .employeeId(Misc.generateId())
                .genderId(Misc.generateId())
                .build();
    }
}
