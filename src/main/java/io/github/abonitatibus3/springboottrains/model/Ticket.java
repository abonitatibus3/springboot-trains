package io.github.abonitatibus3.springboottrains.model;

import java.time.LocalDate;

public class Ticket {

    private String passengerName;
    private LocalDate departureDate;
    private int bags;

    // relationships
    private Reservation reservation;
    private Route route;
    private Station departureStation;
    private Station arrivalStation;

    public Ticket(Reservation reservation, String passengerName, LocalDate departureDate, Route route, Station departureStation, Station arrivalStation, int bags) {
        this.reservation = reservation;
        this.passengerName = passengerName;
        this.departureDate = departureDate;
        this.route = route;
        this.departureStation = departureStation;
        this.arrivalStation = arrivalStation;
        this.bags = bags;
    }

    public Ticket() {
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public Station getDepartureStation() {
        return departureStation;
    }

    public void setDepartureStation(Station departureStation) {
        this.departureStation = departureStation;
    }

    public Station getArrivalStation() {
        return arrivalStation;
    }

    public void setArrivalStation(Station arrivalStation) {
        this.arrivalStation = arrivalStation;
    }

    public int getBags() {
        return bags;
    }

    public void setBags(int bags) {
        this.bags = bags;
    }
}
