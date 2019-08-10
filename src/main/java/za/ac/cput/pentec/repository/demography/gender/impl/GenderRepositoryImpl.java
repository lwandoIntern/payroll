package za.ac.cput.pentec.repository.demography.gender.impl;



import za.ac.cput.pentec.domain.demography.gender.Gender;
import za.ac.cput.pentec.repository.demography.gender.GenderRepository;

import java.util.*;

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
    public Set<Gender> getAll() {
        Collection<Gender> genderCollection = this.genderMap.values();
        Set<Gender> genderSet = new HashSet<>();
        genderSet.addAll(genderCollection);
        return genderSet;
    }

    @Override
    public Gender create(Gender gender) {
        if(read(gender.getTypeGender())  == null){
            this.genderMap.put(gender.getTypeGender(),gender);
        }
        return gender;
    }

    @Override
    public Gender read(String s) {
        return this.genderMap.get(s);
    }

    @Override
    public Gender update(Gender gender) {
        if (read(gender.getTypeGender()) !=null){
            delete(gender.getTypeGender());
            create(gender);
        }
        return read(gender.getTypeGender());
    }

    @Override
    public void delete(String s) {
        Gender gender = read(s);
        this.genderMap.remove(gender.getGenderId(),gender);
    }
}
