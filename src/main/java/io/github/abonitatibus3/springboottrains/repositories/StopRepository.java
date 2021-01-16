package io.github.abonitatibus3.springboottrains.repositories;

import io.github.abonitatibus3.springboottrains.model.Stop;
import org.springframework.data.repository.CrudRepository;

public interface StopRepository extends CrudRepository<Stop, Long> {
}
