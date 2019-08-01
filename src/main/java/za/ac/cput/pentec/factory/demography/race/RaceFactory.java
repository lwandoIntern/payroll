package za.factory.race;

import za.domain.race.Race;

public class RaceFactory {
    public static Race createRace(String race){
        return new Race.Builder()
                .race(race)
                .build();
    }
}
