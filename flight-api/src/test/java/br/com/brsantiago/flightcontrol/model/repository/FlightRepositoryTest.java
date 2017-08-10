package br.com.brsantiago.flightcontrol.model.repository;

import br.com.brsantiago.flightcontrol.FlightApplication;
import br.com.brsantiago.flightcontrol.model.domain.Flight;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

/**
 * Created by bruno on 05/08/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = FlightApplication.class)
public class FlightRepositoryTest extends AbstractTransactionalJUnit4SpringContextTests {

    @Autowired
    private FlightRepository flightRepository;

    @Test
    public void shouldReturnAllFlights() {
        final List<Flight> flight = flightRepository.findAll();
        assertEquals(flight.size(), 4);
    }

    @Test
    public void shouldReturnEmptyWhenNoSuchPilotInFlights() {
        final List<Flight> flight = flightRepository.findAllByPilot("Pilot Test");
        assertEquals(flight.size(), 0);
    }
    @Test
    public void shouldReturnTwoFlightWhenPilotExistInFlight() {
        List<Flight> flights = flightRepository.findAllByPilot("Bruno Santiago");
        assertEquals(flights.size(), 2);
        flights = flightRepository.findAllByPilot("BRUNO");
        assertEquals(flights.size(), 2);
    }

    @Test
    public void shouldReturnSavedFlight() {
        final Optional<Flight> optional = flightRepository.findByNumber("AZ03");
        final  Flight flight = optional.get();
        assertTrue(optional.isPresent());
        assertNotNull(optional);
        assertNotNull(flight);
        assertEquals(flight.getId(), 3);
        assertEquals(flight.getPilot(), "BRUNO");
    }
    @Test
    public void shouldReturnErrorWhereNotExistsFlightNumber() {
        final Optional<Flight> optional = flightRepository.findByNumber("BR03");
        assertFalse(optional.isPresent());
    }

    @Test
    public void shouldReturnEmptyFlights() {
        flightRepository.deleteAll();
        final List<Flight> flight = flightRepository.findAll();
        assertEquals(flight.size(), 0);
    }
}
