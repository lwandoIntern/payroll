package za.ac.cput.pentec.factory.demography.gender;

import za.ac.cput.pentec.domain.demography.gender.Gender;
import za.ac.cput.pentec.util.Misc;


public class GenderFactory {
    public static Gender createGender(String gender){
        return new Gender.Builder()
                .genderId(Misc.generateId())
                .typeGnder(gender)
                .build();
    }
}
