package io.github.abonitatibus3.springboottrains.repositories;

import io.github.abonitatibus3.springboottrains.model.Manager;
import org.springframework.data.repository.CrudRepository;

public interface ManagerRepository extends CrudRepository<Manager, Long> {
}
