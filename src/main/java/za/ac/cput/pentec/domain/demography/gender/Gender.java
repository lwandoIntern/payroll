package za.ac.cput.pentec.domain.demography.gender;

public class Gender {
    private String typeGender;

    private Gender(){}
    public Gender(Builder builder){
        this.typeGender = builder.typeGender;
    }
    public static class Builder{
        private String typeGender;
        public Builder typeGnder(String typeGender){
            this.typeGender = typeGender;
            return this;
        }

        public Gender build(){
            return new Gender(this);
        }
    }
}
