package za.factory.gender;

import za.domain.gender.Gender;

public class GenderFactory {
    public static Gender createGender(String gender){
        return new Gender.Builder()
                .typeGnder(gender)
                .build();
    }
}
