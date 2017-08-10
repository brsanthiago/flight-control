package br.com.brsantiago.flightcontrol.model.repository;

import br.com.brsantiago.flightcontrol.model.domain.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Created by bruno on 04/08/17.
 */
@Repository
public interface CityRepository extends JpaRepository<City, String> {
    Optional<City> findByCode(final String code);
}
