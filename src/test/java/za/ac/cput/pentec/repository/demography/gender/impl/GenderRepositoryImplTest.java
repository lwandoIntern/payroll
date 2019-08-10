package za.ac.cput.pentec.repository.demography.gender.impl;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.pentec.domain.demography.gender.Gender;
import za.ac.cput.pentec.factory.demography.gender.GenderFactory;

import static org.junit.Assert.*;

public class GenderRepositoryImplTest {

    GenderRepositoryImpl repository = null;
    Gender gender;
    @Before
    public void setUp() throws Exception {
        repository = GenderRepositoryImpl.getRepository();
        gender = GenderFactory.createGender("Male");
    }

    @Test
    public void create() {
        assertNotNull(repository.create(gender));
    }

    @Test
    public void read() {
        assertNull(repository.read(gender.getGenderId()));
    }

    @Test
    public void update() {
        assertNotNull(repository.update(gender));
    }

    @Test
    public void delete() {
        repository.delete(gender.getGenderId());
    }
}