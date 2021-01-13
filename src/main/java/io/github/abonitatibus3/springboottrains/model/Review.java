package io.github.abonitatibus3.springboottrains.model;

public class Review {


    private Integer reviewNumber;
    private String comment;
    private Rating rating;

    // relationships
    private Customer customer;
    private Route route;

    public Review(Customer customer, Integer reviewNumber, String comment, Rating rating, Route route) {
        this.customer = customer;
        this.reviewNumber = reviewNumber;
        this.comment = comment;
        this.rating = rating;
        this.route = route;
    }

    public Review() {
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Integer getReviewNumber() {
        return reviewNumber;
    }

    public void setReviewNumber(Integer reviewNumber) {
        this.reviewNumber = reviewNumber;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }
}
