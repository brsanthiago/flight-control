package br.com.brsantiago.flightcontrol.model.enums;

/**
 * Created by bruno on 04/08/17.
 */
public enum FlightStatus {
    CONFIRMED("Confirmed"),
    FORESEEN("Foreseen"),
    CANCELLED("Cancelled"),
    CANCELLED_FLIGTH("Cancelled Flight"),
    DISPATCH_OPEN("Dispatch Open"),
    IMMEDIATE_BOARDING("Immediate Boarding"),
    NEXT_BOARDING("Next Boarding"),
    AIRCRAFT_ON_PLATAFORM("Aircraft on Plataform");
    public String name;
    FlightStatus(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
