package za.ac.cput.pentec.repository.demography.gender;

import za.ac.cput.pentec.domain.demography.gender.Gender;
import za.ac.cput.pentec.repository.IRepository;

import java.util.Set;


public interface GenderRepository extends IRepository<Gender,String> {
    Set<Gender> getAll();
}
