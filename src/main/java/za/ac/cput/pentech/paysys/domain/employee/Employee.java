package za.ac.cput.pentech.paysys.domain.employee;

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
}
