package za.ac.cput.pentec.factory.demography.gender;

import za.domain.gender.Gender;

public class GenderFactory {
    public static Gender createGender(String gender){
        return new Gender.Builder()
                .typeGnder(gender)
                .build();
    }
}
