package br.com.brsantiago.flightcontrol.model.repository;

import br.com.brsantiago.flightcontrol.model.domain.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Created by bruno on 04/08/17.
 */
@Repository
public interface FlightRepository extends JpaRepository<Flight, String> {
    Optional<Flight> findByNumber(final String number);
    List<Flight> findAll();
    List<Flight> findAllByPilot(final String pilot);
}
