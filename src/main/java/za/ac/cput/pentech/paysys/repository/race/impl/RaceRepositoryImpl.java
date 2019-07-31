package za.ac.cput.pentech.paysys.repository.race.impl;

import za.ac.cput.pentech.paysys.domain.race.Race;
import za.ac.cput.pentech.paysys.repository.race.RaceRepository;

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
