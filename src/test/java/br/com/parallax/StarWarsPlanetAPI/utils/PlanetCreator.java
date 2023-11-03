package br.com.parallax.StarWarsPlanetAPI.utils;


import br.com.parallax.StarWarsPlanetAPI.domain.planet.Planet;
import br.com.parallax.StarWarsPlanetAPI.domain.planet.PlanetDTO;

public class PlanetCreator {


    public Planet createPlanetCorrectly(){
        return new Planet(new PlanetDTO("Earth", "Temperate" , "Swaps,Volcanos"));
    }

    public Planet createAlreadyExisted(){
        return new Planet(new PlanetDTO("Earth", "Temperate" , "Swaps,Volcanos"));
    }

}
