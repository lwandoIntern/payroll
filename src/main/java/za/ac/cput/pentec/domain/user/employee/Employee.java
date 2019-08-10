package za.ac.cput.pentec.domain.user.employee;

import java.util.Objects;

public class Employee {

    private String employeeId,firstName,lastName;

    private Employee(){}
    public Employee(Builder builder){
        this.employeeId = builder.employeeId;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public static class Builder{
        private String employeeId,firstName,lastName;

        public Builder employeeId(String v){
            this.employeeId = v;
            return this;
        }
        public Builder firstName(String v){
            this.firstName = v;
            return this;
        }
        public Builder lastName(String v){
            this.lastName = v;
            return this;
        }
        public Builder copy(Employee employee){
            this.employeeId = employee.employeeId;
            this.firstName = employee.firstName;
            this.lastName = employee.lastName;
            return this;
        }
        public Employee build(){
            return new Employee(this);
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return employeeId.equals(employee.employeeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId);
    }
}
