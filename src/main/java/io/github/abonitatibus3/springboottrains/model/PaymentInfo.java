package io.github.abonitatibus3.springboottrains.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class PaymentInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cardNumber;
    private String cvv;
    private LocalDate expirationDate;
    private String name;

    //relationships
    @ManyToOne(fetch = FetchType.LAZY)
    private Customer customer;

    public PaymentInfo(Customer customer, String cardNumber, String cvv, LocalDate expirationDate, String name) {
        this.customer = customer;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expirationDate = expirationDate;
        this.name = name;
    }

    public PaymentInfo() {
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
