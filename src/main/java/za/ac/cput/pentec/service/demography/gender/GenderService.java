package za.ac.cput.pentec.service.demography.gender;

import za.ac.cput.pentec.domain.demography.gender.Gender;
import za.ac.cput.pentec.service.IService;

import java.util.Set;

public interface GenderService extends IService<Gender,String> {
    Set<Gender> getAll();
}
