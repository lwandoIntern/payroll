package za.ac.cput.pentec.domain.demography.gender;

import java.util.Objects;

public class Gender {
    private String genderId,typeGender;

    private Gender(){}
    public Gender(Builder builder){
        this.typeGender = builder.typeGender;
    }

    public String getGenderId() {
        return genderId;
    }

    public String getTypeGender() {
        return typeGender;
    }

    public static class Builder{
        private String genderId,typeGender;
        public Builder genderId(String id){
            this.genderId = id;
            return this;
        }
        public Builder typeGnder(String typeGender){
            this.typeGender = typeGender;
            return this;
        }

        public Gender build(){
            return new Gender(this);
        }
    }

    @Override
    public String toString() {
        return "Gender{" +
                "genderId='" + genderId + '\'' +
                ", typeGender='" + typeGender + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gender gender = (Gender) o;
        return genderId.equals(gender.genderId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(genderId);
    }
}
