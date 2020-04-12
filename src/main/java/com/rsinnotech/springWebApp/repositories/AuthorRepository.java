package com.rsinnotech.springWebApp.repositories;

import com.rsinnotech.springWebApp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
