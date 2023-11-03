package br.com.parallax.StarWarsPlanetAPI.controller;


import br.com.parallax.StarWarsPlanetAPI.domain.planet.PlanetDTO;
import br.com.parallax.StarWarsPlanetAPI.domain.planet.SearchIdDTO;
import br.com.parallax.StarWarsPlanetAPI.domain.planet.SearchNameDTO;
import br.com.parallax.StarWarsPlanetAPI.service.PlanetService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping
@Slf4j
public class PlanetController {

    final
    PlanetService service;


    public PlanetController(PlanetService service) {
        this.service=service;
    }

    @GetMapping("/home")
    public ModelAndView home(){
        return new ModelAndView("index");
    }

    @PostMapping("/add")
    @Transactional
    public void add(PlanetDTO dto){
        log.info("Adding planet "+ dto.name()+ "to database" );
        service.addPlanet(dto);
    }

    @GetMapping("/list")
    public ModelAndView list(){
        var mv = new ModelAndView("listPlanets");
        log.info("Listing all planets");
        mv.addObject("planet",service.listAll());
        return mv;
    }

    @GetMapping("/getById")
    public ModelAndView getById(SearchIdDTO dto){
        var mv = new ModelAndView("listPlanets");
        log.info("Find planet by id insert by the user");
        mv.addObject("planet",service.listById(dto));
        return mv;
    }

    @GetMapping("/getByName")
    public ModelAndView getByName(SearchNameDTO dto){
        var mv = new ModelAndView("listPlanets");
        log.info("Find planet by name insert by the user");
        mv.addObject("planet",service.listByName(dto));
        return mv;
    }

    @GetMapping("/delete/{id}")
    public void deletePlanet(@PathVariable("id") Long id){
        var planetToBeDeleted = service.listById(id);
        log.info("Deleting planet: " + planetToBeDeleted.getName());
        service.deletePlanet(id);
    }
}
