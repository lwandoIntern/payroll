package za.ac.cput.pentec.service.user.employee;

import za.ac.cput.pentec.domain.demography.gender.Gender;
import za.ac.cput.pentec.domain.user.employee.Employee;
import za.ac.cput.pentec.domain.user.employeeGender.EmployeeGender;
import za.ac.cput.pentec.factory.demography.gender.GenderFactory;
import za.ac.cput.pentec.factory.user.employee.EmployeeFactory;
import za.ac.cput.pentec.factory.user.employeeGender.EmployeeGenderFactory;
import za.ac.cput.pentec.service.demography.gender.impl.GenderServiceImpl;
import za.ac.cput.pentec.service.user.employee.impl.EmployeeServiceImpl;
import za.ac.cput.pentec.service.user.employeeGender.EmployeeGenderService;
import za.ac.cput.pentec.service.user.employeeGender.impl.EmployeeGenderServiceImpl;

public class GenericService {
    public Employee createEmployee(String fname, String lname, String gender){
        EmployeeServiceImpl employeeService = EmployeeServiceImpl.getService();
        Employee employee = EmployeeFactory.createEmployee(fname,lname);
        Gender gender1 = GenericService.getGender(gender);
        EmployeeGender  employeeGender = EmployeeGenderFactory.createEmployeeGender(employee.getEmployeeId(),gender1.getGenderId());
        EmployeeGenderServiceImpl.getEmployeeService().create(employee);
        EmployeeGenderServiceImpl.getService().create(employeeGender);

        return employeeService.create(employee);
    }

    public static Gender getGender(String gender){
        Gender gender1 = GenderFactory.createGender(gender);
        GenderServiceImpl service = GenderServiceImpl.getService();

        return service.create(gender1);
    }

}
