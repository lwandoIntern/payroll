package za.ac.cput.pentec.service.demography.race.impl;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.pentec.domain.demography.race.Race;
import za.ac.cput.pentec.factory.demography.race.RaceFactory;

import static org.junit.Assert.*;

public class RaceServiceImplTest {

    private RaceServiceImpl service;
    private Race race;
    @Before
    public void setUp() throws Exception {
        service = RaceServiceImpl.getService();
        race = RaceFactory.createRace("African");
    }

    @Test
    public void getAll() {
        assertEquals(service.getAll(),service.getAll());
    }

    @Test(expected = NullPointerException.class)
    public void create() {
        assertEquals(service.create(race),service.create(race));
    }

    @Test
    public void read() {
        assertNull(service.read(""));
    }

    @Test
    public void update() {
        assertNull(service.update(race));
    }

    @Test
    public void delete() {
        service.delete("");
    }
}