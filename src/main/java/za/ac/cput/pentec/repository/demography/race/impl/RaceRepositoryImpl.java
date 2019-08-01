package za.repository.race.impl;

import za.domain.race.Race;
import za.repository.race.RaceRepository;

import java.util.ArrayList;
import java.util.List;

public class RaceRepositoryImpl implements RaceRepository {
    private static RaceRepositoryImpl repository = null;
    private List<Race> raceList;
    private RaceRepositoryImpl(){
        this.raceList = new ArrayList<>();
    }

    public static RaceRepositoryImpl getRepository() {
        if (repository == null)repository = new RaceRepositoryImpl();
        return repository;
    }

    @Override
    public Race create(Race race) {
        return null;
    }

    @Override
    public Race read(String s) {
        return null;
    }

    @Override
    public Race update(String s) {
        return null;
    }

    @Override
    public void delete(String s) {

    }
}
