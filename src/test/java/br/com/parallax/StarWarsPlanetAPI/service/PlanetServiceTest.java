package br.com.parallax.StarWarsPlanetAPI.service;

import br.com.parallax.StarWarsPlanetAPI.domain.planet.PlanetRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@AutoConfigureTestDatabase
class PlanetServiceTest {

    @Autowired
    PlanetRepository repository;

    @Test
    void addPlanet() {

    }

    @Test
    void listById() {
    }

    @Test
    void testListById() {
    }

    @Test
    void listByName() {
    }

    @Test
    void listAll() {
    }

    @Test
    void deletePlanet() {
    }
}