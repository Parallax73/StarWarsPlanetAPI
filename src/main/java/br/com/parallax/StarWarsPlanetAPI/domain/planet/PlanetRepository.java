package br.com.parallax.StarWarsPlanetAPI.domain.planet;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanetRepository extends JpaRepository<Planet,Long> {
    Planet findByName(String name);
    Boolean existsByName(String name);
}
