package za.ac.cput.pentec.repository.demography.gender.impl;



import za.ac.cput.pentec.domain.demography.gender.Gender;
import za.ac.cput.pentec.repository.demography.gender.GenderRepository;

import java.util.HashMap;
import java.util.Map;

public class GenderRepositoryImpl implements GenderRepository {
    private static GenderRepositoryImpl repository = null;
    private Map<String, Gender> genderMap;
    private GenderRepositoryImpl(){
        this.genderMap = new HashMap<>();

    }

    public static GenderRepositoryImpl getRepository() {
        if (repository == null)repository = new GenderRepositoryImpl();
        return repository;
    }

    @Override
    public Gender create(Gender gender) {
        return null;
    }

    @Override
    public Gender read(String s) {
        return null;
    }

    @Override
    public Gender update(String s) {
        return null;
    }

    @Override
    public void delete(String s) {

    }
}
