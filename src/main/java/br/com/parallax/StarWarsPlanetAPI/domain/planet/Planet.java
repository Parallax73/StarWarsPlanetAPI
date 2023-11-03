package br.com.parallax.StarWarsPlanetAPI.domain.planet;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;



@Table(name = "Planets")
@Entity(name = "Planet")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Planet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String climate;
    private String terrain;


    public Planet(PlanetDTO dto){
        this.name=dto.name();
        this.climate=dto.climate();
        this.terrain=dto.terrain();
    }
}
