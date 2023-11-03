package br.com.parallax.StarWarsPlanetAPI;

import br.com.parallax.StarWarsPlanetAPI.config.ContainersEnviroment;
import br.com.parallax.StarWarsPlanetAPI.domain.planet.PlanetRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ActiveProfiles("test")
@ExtendWith(SpringExtension.class)
@SpringBootTest
class StarWarsPlanetApiApplicationTests extends ContainersEnviroment {

	@Autowired
	PlanetRepository repository;



	@Test
	void contextLoads() {
	}

}
