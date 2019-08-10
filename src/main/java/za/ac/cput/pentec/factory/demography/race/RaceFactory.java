package za.ac.cput.pentec.factory.demography.race;


import za.ac.cput.pentec.domain.demography.race.Race;
import za.ac.cput.pentec.util.Misc;

public class RaceFactory {
    public static Race createRace(String race){
        return new Race.Builder()
                .raceId(Misc.generateId())
                .race(race)
                .build();
    }
}
