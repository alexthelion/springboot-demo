package com.rsinnotech.springWebApp.repositories;

import com.rsinnotech.springWebApp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
