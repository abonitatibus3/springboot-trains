package io.github.abonitatibus3.springboottrains.model;

import java.util.HashSet;
import java.util.Set;

public class Customer extends User {

    private String email;
    private boolean isStudent;

    // relationships
    private Set<Review> reviews;
    private Set<PaymentInfo> paymentInfos;
    private Set<Reservation> reservations;

    public Customer() {
        this.reviews = new HashSet<>();
        this.paymentInfos = new HashSet<>();
        this.reservations = new HashSet<>();
    }

    public Customer(String email, String username, String password) {
        this();
        this.email = email;
        super.setPassword(password);
        super.setUsername(username);
    }

    public Customer(String email, String username, String password, boolean isStudent, Set<Review> reviews,
                    Set<PaymentInfo> paymentInfos, Set<Reservation> reservations) {
        this.email = email;
        super.setUsername(username);
        super.setPassword(password);
        this.isStudent = isStudent;
        this.reviews = reviews;
        this.paymentInfos = paymentInfos;
        this.reservations = reservations;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isStudent() {
        return isStudent;
    }

    public void setStudent(boolean student) {
        isStudent = student;
    }

    public Set<Review> getReviews() {
        return reviews;
    }

    public void setReviews(Set<Review> reviews) {
        this.reviews = reviews;
    }

    public Set<PaymentInfo> getPaymentInfos() {
        return paymentInfos;
    }

    public void setPaymentInfos(Set<PaymentInfo> paymentInfos) {
        this.paymentInfos = paymentInfos;
    }

    public Set<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(Set<Reservation> reservations) {
        this.reservations = reservations;
    }
}
