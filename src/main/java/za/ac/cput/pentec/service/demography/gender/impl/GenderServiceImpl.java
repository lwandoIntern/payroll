package za.ac.cput.pentec.service.demography.gender.impl;

import za.ac.cput.pentec.domain.demography.gender.Gender;
import za.ac.cput.pentec.repository.demography.gender.GenderRepository;
import za.ac.cput.pentec.repository.demography.gender.impl.GenderRepositoryImpl;
import za.ac.cput.pentec.service.demography.gender.GenderService;

import java.util.Set;

public class GenderServiceImpl implements GenderService {
    private static GenderServiceImpl service = null;
    private GenderRepositoryImpl repository;

    private GenderServiceImpl(){
        repository = GenderRepositoryImpl.getRepository();
    }

    public static GenderServiceImpl getService() {
        if (service == null)service = new GenderServiceImpl();
        return service;
    }

    @Override
    public Set<Gender> getAll() {
        return repository.getAll();
    }

    @Override
    public Gender create(Gender gender) {
        return repository.create(gender);
    }

    @Override
    public Gender read(String s) {
        return repository.read(s);
    }

    @Override
    public Gender update(Gender gender) {
        return repository.update(gender);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);
    }
}
