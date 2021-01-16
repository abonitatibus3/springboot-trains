package io.github.abonitatibus3.springboottrains.model;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
public class Stop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private LocalTime arrivalTime;
    private LocalTime departureTime;

    // relationships
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Station station;

    @ManyToOne(fetch = FetchType.LAZY)
    private Route route;

    public Stop() {
    }

    public Stop(String name, LocalTime arrivalTime, LocalTime departureTime, Station station) {
        this.name = name;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
        this.station = station;
    }

    public Stop(String name, LocalTime arrivalTime, LocalTime departureTime, Station station, Route route) {
        this.name = name;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
        this.station = station;
        this.route = route;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }
}
