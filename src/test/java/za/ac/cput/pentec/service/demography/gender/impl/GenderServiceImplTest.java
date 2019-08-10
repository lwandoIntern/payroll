package za.ac.cput.pentec.service.demography.gender.impl;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.pentec.domain.demography.gender.Gender;
import za.ac.cput.pentec.factory.demography.gender.GenderFactory;
import za.ac.cput.pentec.util.Misc;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GenderServiceImplTest {

    private GenderServiceImpl service;
    private Gender gender;
    private Map<String,Gender> genderStringMap;
    @Before
    public void setUp() throws Exception {
        this.service = GenderServiceImpl.getService();
        genderStringMap = new HashMap<>();
        gender = GenderFactory.createGender("Other");
        genderStringMap.put(Misc.generateId(),GenderFactory.createGender("Male"));
        genderStringMap.put(Misc.generateId(),GenderFactory.createGender("Female"));
        genderStringMap.put(Misc.generateId(),GenderFactory.createGender("Male"));
    }

    @Test
    public void getAll() {
        assertEquals(service.getAll(),service.getAll());
    }

    @Test
    public void create() {
        assertEquals(service.create(gender),service.create(gender));
    }

    @Test
    public void read() {
        assertNull(service.read(""));
    }

    @Test
    public void update() {
        assertNull(service.update(gender));
    }

    @Test(expected = NullPointerException.class)
    public void delete() {
        service.delete("");
    }
}