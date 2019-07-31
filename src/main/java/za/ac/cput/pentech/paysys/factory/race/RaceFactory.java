package za.ac.cput.pentech.paysys.factory.race;

import za.ac.cput.pentech.paysys.domain.race.Race;

public class RaceFactory {
    public static Race createRace(String race){
        return new Race.Builder()
                .race(race)
                .build();
    }
}
