package za.ac.cput.pentec.service.demography.race;

import za.ac.cput.pentec.domain.demography.race.Race;
import za.ac.cput.pentec.service.IService;

import java.util.Set;

public interface RaceService extends IService<Race,String> {
    Set<Race> getAll();
}
