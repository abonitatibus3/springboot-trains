package io.github.abonitatibus3.springboottrains.repositories;

import io.github.abonitatibus3.springboottrains.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
