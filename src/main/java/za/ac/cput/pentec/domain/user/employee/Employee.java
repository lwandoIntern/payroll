package za.ac.cput.pentec.domain.user.employee;

import java.util.Objects;

public class Employee {

    private String firstName,lastName;

    private Employee(){}
    public Employee(Builder builder){
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
    }

    public static class Builder{
        private String firstName,lastName;

        public Builder firstName(String v){
            this.firstName = v;
            return this;
        }
        public Builder lastName(String v){
            this.lastName = v;
            return this;
        }
        public Builder copy(Employee employee){
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
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(firstName, employee.firstName) &&
                Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
