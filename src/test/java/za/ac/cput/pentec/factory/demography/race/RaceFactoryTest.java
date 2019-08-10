package za.ac.cput.pentec.factory.demography.race;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.pentec.domain.demography.race.Race;

import static org.junit.Assert.*;

public class RaceFactoryTest {

    Race race;
    @Before
    public void setUp() throws Exception {
        race = RaceFactory.createRace("African");
    }

    @Test
    public void createRace() {
        assertEquals(race.getRace(),"African");
    }
}