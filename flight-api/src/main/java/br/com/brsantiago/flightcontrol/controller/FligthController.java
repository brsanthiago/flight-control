package br.com.brsantiago.flightcontrol.controller;

import br.com.brsantiago.flightcontrol.model.domain.Flight;
import br.com.brsantiago.flightcontrol.model.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.ExposesResourceFor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.util.NestedServletException;

import java.net.URI;
import java.util.List;

/**
 * Created by bruno on 04/08/17.
 */
@RestController
@RequestMapping("/api/flight")
@ExposesResourceFor(Flight.class)
public class FligthController {
    @Autowired
    private FlightRepository flightRepository;

    @GetMapping
    public List<Flight> findAll() {
        return flightRepository.findAll();
    }

    @PostMapping("/save")
    public ResponseEntity<Void> saveFlight(@RequestBody Flight body) throws NestedServletException{
        Flight flight = null;
        try {
            flight = flightRepository.save(body);
            if (flight == null) {
                return ResponseEntity.status(400).build();
            }
            URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                    .buildAndExpand(flight.getNumber()).toUri();
            return ResponseEntity.created(location).build();
        }catch (Exception e) {
            return ResponseEntity.status(400).build();
        }
    }
}
