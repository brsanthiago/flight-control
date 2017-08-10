package br.com.brsantiago.flightcontrol.fixture;

import br.com.brsantiago.flightcontrol.model.domain.Aircraft;

/**
 * Created by bruno on 09/08/17.
 */
public class AircraftFixture {

    public static Aircraft getAircraft() {
        final Aircraft aircraft = new Aircraft();
        aircraft.setId(299);
        aircraft.setName("EMBRAER 190 E2");
        aircraft.setModel("190E2");
        return aircraft;
    }
}
