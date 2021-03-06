package io.github.abonitatibus3.springboottrains.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String reservationID;
    private BigDecimal price;

    // relationships
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "reservation")
    private Set<Ticket> tickets;

    @ManyToOne(fetch = FetchType.LAZY)
    private Customer customer;

    @OneToOne
    private PaymentInfo paymentInfo;


    public Reservation(String reservationID, Set<Ticket> tickets, BigDecimal price, Customer customer, PaymentInfo paymentInfo) {
        this.reservationID = reservationID;
        this.tickets = tickets;
        this.price = price;
        this.customer = customer;
        this.paymentInfo = paymentInfo;
    }

    public Reservation() {
        this.tickets = new HashSet<>();
    }

    public String getReservationID() {
        return reservationID;
    }

    public void setReservationID(String reservationID) {
        this.reservationID = reservationID;
    }

    public Set<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(Set<Ticket> tickets) {
        this.tickets = tickets;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public PaymentInfo getPaymentInfo() {
        return paymentInfo;
    }

    public void setPaymentInfo(PaymentInfo paymentInfo) {
        this.paymentInfo = paymentInfo;
    }
}
