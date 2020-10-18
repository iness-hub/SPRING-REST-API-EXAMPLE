package nl.fontys.druppelapi.service;

import nl.fontys.druppelapi.dto.GardenHistoryDTO;
import nl.fontys.druppelapi.model.GardenHistory;
import nl.fontys.druppelapi.repository.GardenHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GardenHistoryService {
    @Autowired
    private GardenHistoryRepository gardenHistoryRepository;

    public List<GardenHistory> findAll(){

        return (List<GardenHistory>) gardenHistoryRepository.findAll();

    }

  public void save (GardenHistoryDTO gardenHistoryDTO){
        GardenHistory gardenHistory = new GardenHistory();
        gardenHistory.setId(gardenHistoryDTO.getId());
        gardenHistory.setMoisture(gardenHistoryDTO.getMoisture());
        gardenHistory.setDate(gardenHistoryDTO.getDate());
         gardenHistory.setGardenIdEsp(gardenHistoryDTO.getGardenEspId());
        gardenHistoryRepository.save(gardenHistory);
    }

    public GardenHistory get(Integer id){
        return gardenHistoryRepository.findById(id).get();
    }
    public void delete (Integer id){
        gardenHistoryRepository.deleteById(id);
    }
}