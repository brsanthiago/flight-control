package br.com.brsantiago.flightcontrol.model.domain;

import br.com.brsantiago.flightcontrol.model.enums.Airline;
import br.com.brsantiago.flightcontrol.model.enums.FlightStatus;
import javax.persistence.*;
import java.util.Date;

/**
 * Created by bruno on 04/08/17.
 */
@Entity
public class Flight {
    @Id
    private int id;
    @Column(unique = true)
    private String number;
    private Airline airline;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "aircraft_id")
    private Aircraft aircraft;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "origin_id")
    private City origin;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "destiny_id")
    private City destiny;
    private Date match;
    private Date arrival;
    private String pilot;
    private FlightStatus status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Airline getAirline() {
        return airline;
    }

    public void setAirline(Airline airline) {
        this.airline = airline;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Aircraft getAircraft() {
        return aircraft;
    }

    public void setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
    }

    public City getOrigin() {
        return origin;
    }

    public void setOrigin(City origin) {
        this.origin = origin;
    }

    public City getDestiny() {
        return destiny;
    }

    public void setDestiny(City destiny) {
        this.destiny = destiny;
    }

    public Date getMatch() {
        return match;
    }

    public void setMatch(Date match) {
        this.match = match;
    }

    public Date getArrival() {
        return arrival;
    }

    public void setArrival(Date arrival) {
        this.arrival = arrival;
    }

    public String getPilot() {
        return pilot;
    }

    public void setPilot(String pilot) {
        this.pilot = pilot;
    }

    public FlightStatus getStatus() {
        return status;
    }

    public void setStatus(FlightStatus status) {
        this.status = status;
    }
}
