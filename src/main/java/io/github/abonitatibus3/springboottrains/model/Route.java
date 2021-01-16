package io.github.abonitatibus3.springboottrains.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Route {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String trainNo;
    private BigDecimal firstClassPrice;
    private BigDecimal secondClassPrice;

    // relationships
    @OneToMany(mappedBy = "route")
    private Set<Stop> stops;

    @OneToMany
    private Set<Review> review;

    public Route(String trainNo, BigDecimal firstClassPrice, BigDecimal secondClassPrice, Set<Stop> stops) {
        this.trainNo = trainNo;
        this.firstClassPrice = firstClassPrice;
        this.secondClassPrice = secondClassPrice;
        this.stops = stops;
    }

    public Route(String trainNo, BigDecimal firstClassPrice, BigDecimal secondClassPrice) {
        this.trainNo = trainNo;
        this.firstClassPrice = firstClassPrice;
        this.secondClassPrice = secondClassPrice;
        this.stops = new HashSet<>();
    }

    public Route() {
        this.stops = new HashSet<>();
    }

    public String getTrainNo() {
        return trainNo;
    }

    public void setTrainNo(String trainNo) {
        this.trainNo = trainNo;
    }

    public BigDecimal getFirstClassPrice() {
        return firstClassPrice;
    }

    public void setFirstClassPrice(BigDecimal firstClassPrice) {
        this.firstClassPrice = firstClassPrice;
    }

    public BigDecimal getSecondClassPrice() {
        return secondClassPrice;
    }

    public void setSecondClassPrice(BigDecimal secondClassPrice) {
        this.secondClassPrice = secondClassPrice;
    }

    public Set<Stop> getStops() {
        return stops;
    }

    public void setStops(Set<Stop> stops) {
        this.stops = stops;
    }
}
