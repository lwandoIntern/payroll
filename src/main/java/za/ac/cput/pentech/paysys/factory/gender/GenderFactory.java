package za.ac.cput.pentech.paysys.factory.gender;

import za.ac.cput.pentech.paysys.domain.gender.Gender;

public class GenderFactory {
    public static Gender createGender(String gender){
        return new Gender.Builder()
                .typeGnder(gender)
                .build();
    }
}
