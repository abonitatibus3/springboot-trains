package io.github.abonitatibus3.springboottrains.repositories;

import io.github.abonitatibus3.springboottrains.model.SystemInfo;
import org.springframework.data.repository.CrudRepository;

public interface SystemInfoRepository extends CrudRepository<SystemInfo, Long> {
}
