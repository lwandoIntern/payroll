package za.ac.cput.pentech.paysys.domain;

public class EmployeeGender {

    private String employeeId,genderId;

    private EmployeeGender(){}
    public EmployeeGender(Builder builder){
        this.employeeId = builder.employeeId;
        this.genderId = builder.genderId;
    }
    public static class Builder{
        private String employeeId,genderId;
        public Builder employeeId(String id){
            this.employeeId = id;
            return this;
        }
        public Builder genderId(String id){
            this.genderId = id;
            return this;
        }
        public EmployeeGender build(){
            return new EmployeeGender(this);
        }
    }
}
