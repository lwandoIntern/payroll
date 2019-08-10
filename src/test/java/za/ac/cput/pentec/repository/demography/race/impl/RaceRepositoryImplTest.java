package za.ac.cput.pentec.repository.demography.race.impl;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import za.ac.cput.pentec.domain.demography.race.Race;
import za.ac.cput.pentec.factory.demography.race.RaceFactory;

import static org.junit.Assert.*;

public class RaceRepositoryImplTest {

    private RaceRepositoryImpl repository = null;
    private Race race;
    @Before
    public void setUp() throws Exception {
        repository = RaceRepositoryImpl.getRepository();
        race = RaceFactory.createRace("African");
    }

    @Ignore
    @Test
    public void create() {
        assertNull(repository.create(race));
    }

    @Test
    public void read() {
        assertNull(repository.read(race.getRaceId()));
    }

    @Test
    public void update() {
        assertNull(repository.update(race));
    }

    @Test
    public void delete() {
        repository.delete(race.getRaceId());
    }
}