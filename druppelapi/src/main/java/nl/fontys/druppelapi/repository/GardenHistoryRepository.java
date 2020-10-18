package nl.fontys.druppelapi.repository;

import nl.fontys.druppelapi.model.GardenHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GardenHistoryRepository extends CrudRepository<GardenHistory, Integer> {

}
