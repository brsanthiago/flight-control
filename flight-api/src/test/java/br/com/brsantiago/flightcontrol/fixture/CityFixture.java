package br.com.brsantiago.flightcontrol.fixture;

import br.com.brsantiago.flightcontrol.model.domain.City;

/**
 * Created by bruno on 09/08/17.
 */
public class CityFixture {

    public static City getCity(final int id, final String name, final String country) {
        final City city = new City();
        city.setId(id);
        city.setName(name);
        city.setCountry(country);
        return city;
    }
}
