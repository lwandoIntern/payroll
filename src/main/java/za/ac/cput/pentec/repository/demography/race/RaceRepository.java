package za.ac.cput.pentec.repository.demography.race;


import za.ac.cput.pentec.domain.demography.race.Race;
import za.ac.cput.pentec.repository.IRepository;

import java.util.Set;


public interface RaceRepository extends IRepository<Race,String> {
    Set<Race> getAll();
}
