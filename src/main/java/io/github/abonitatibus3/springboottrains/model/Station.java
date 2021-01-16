package io.github.abonitatibus3.springboottrains.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Station {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String location;

    // relationships
    @OneToMany(mappedBy = "station")
    private Set<Stop> stops;

    public Station(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public Station() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
