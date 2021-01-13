package io.github.abonitatibus3.springboottrains.model;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

public class Stop {

    private String name;
    private LocalTime arrivalTime;
    private LocalTime departureTime;

    // relationships
    private Station station;
    private Set<Route> routes;

    public Stop() {
        this.routes = new HashSet<>();
    }

    public Stop(String name, LocalTime arrivalTime, LocalTime departureTime, Station station) {
        this();
        this.name = name;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
        this.station = station;
    }

    public Stop(String name, LocalTime arrivalTime, LocalTime departureTime, Station station, Set<Route> routes) {
        this.name = name;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
        this.station = station;
        this.routes = routes;
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
}
