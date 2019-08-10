package za.ac.cput.pentec.service.demography.race.impl;

import za.ac.cput.pentec.domain.demography.race.Race;
import za.ac.cput.pentec.repository.demography.race.RaceRepository;
import za.ac.cput.pentec.repository.demography.race.impl.RaceRepositoryImpl;

import java.util.Set;

public class RaceServiceImpl implements RaceRepository {
    private static RaceServiceImpl service = null;
    private RaceRepositoryImpl repository;

    private RaceServiceImpl(){
        this.repository = RaceRepositoryImpl.getRepository();
    }
    @Override
    public Set<Race> getAll() {
        return repository.getAll();
    }

    @Override
    public Race create(Race race) {
        return repository.create(race);
    }

    @Override
    public Race read(String s) {
        return repository.read(s);
    }

    @Override
    public Race update(Race race) {
        return repository.update(race);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);
    }
}
