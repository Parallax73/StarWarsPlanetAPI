package br.com.parallax.StarWarsPlanetAPI.service;


import br.com.parallax.StarWarsPlanetAPI.domain.planet.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@Slf4j
public class PlanetService {

    final
    PlanetRepository repository;



    public PlanetService(PlanetRepository repository) {
        this.repository = repository;
    }



    public void addPlanet(PlanetDTO dto){
        if (repository.existsByName(dto.name())){
            log.error("Tried to add a planet that already is added");

        } else {
            log.info("right");
            Planet planet = new Planet(dto);
            repository.save(planet);
        }
    }

    public Planet listById(SearchIdDTO dto){
        return repository.getReferenceById(dto.id());
    }

    public Planet listById(Long id){
        return repository.getReferenceById(id);
    }

    public Planet listByName(SearchNameDTO dto){
        return repository.findByName(dto.name());
    }

    public List<Planet> listAll(){
        return repository.findAll();
    }

    public void deletePlanet(Long id){
        repository.deleteById(id);
    }

}

