package za.ac.cput.pentec.factory.demography.gender;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.pentec.domain.demography.gender.Gender;

import static org.junit.Assert.*;

public class GenderFactoryTest {

    Gender gender;
    @Before
    public void setUp() throws Exception {
        gender = GenderFactory.createGender("male");
    }

    @Test
    public void createGender() {
        assertEquals(gender.getTypeGender(),gender.getTypeGender());
    }
}