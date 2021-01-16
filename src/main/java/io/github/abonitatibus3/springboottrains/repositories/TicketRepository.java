package io.github.abonitatibus3.springboottrains.repositories;

import io.github.abonitatibus3.springboottrains.model.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepository extends CrudRepository<Ticket, Long> {
}
