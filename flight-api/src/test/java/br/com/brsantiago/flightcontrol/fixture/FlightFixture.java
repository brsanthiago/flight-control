package br.com.brsantiago.flightcontrol.fixture;

import br.com.brsantiago.flightcontrol.model.domain.Flight;
import br.com.brsantiago.flightcontrol.model.enums.Airline;
import br.com.brsantiago.flightcontrol.model.enums.FlightStatus;
import java.util.Date;
import static br.com.brsantiago.flightcontrol.fixture.AircraftFixture.getAircraft;
import static br.com.brsantiago.flightcontrol.fixture.CityFixture.getCity;

/**
 * Created by bruno on 09/08/17.
 */
public class FlightFixture {

    public static Flight getFlight() {
        final Flight flight = new Flight();
        flight.setId(277);
        flight.setStatus(FlightStatus.AIRCRAFT_ON_PLATAFORM);
        flight.setPilot("Bruno Santiago");
        flight.setMatch(new Date());
        flight.setArrival(new Date());
        flight.setNumber("#001");
        flight.setAirline(Airline.AZUL);
        flight.setAircraft(getAircraft());
        flight.setOrigin(getCity(299,"GUARULHOS", "BRAZIL"));
        flight.setDestiny(getCity(300,"PARIS", "FRANCE"));
        return flight;
    }
    public static Flight getInCompletFlight() {
        final Flight flight = new Flight();
        flight.setId(278);
        flight.setStatus(FlightStatus.AIRCRAFT_ON_PLATAFORM);
        flight.setPilot("Bruno Santiago");
        flight.setMatch(new Date());
        flight.setArrival(new Date());
        flight.setNumber("#001");
        flight.setAirline(Airline.AZUL);
        flight.setAircraft(getAircraft());
        flight.setDestiny(getCity(300,"PARIS", "FRANCE"));
        return flight;
    }
}
