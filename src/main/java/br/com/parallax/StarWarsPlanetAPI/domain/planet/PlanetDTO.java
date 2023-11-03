package br.com.parallax.StarWarsPlanetAPI.domain.planet;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.constraints.NotBlank;
import org.springframework.boot.context.properties.bind.DefaultValue;


@JsonIgnoreProperties(ignoreUnknown = true)
public record PlanetDTO(
        @NotBlank
        String name,
        @DefaultValue(value = "unknown")
        String climate,

        @DefaultValue(value = "unknown")
        String terrain
) {
}
