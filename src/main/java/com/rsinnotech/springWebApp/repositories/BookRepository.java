package com.rsinnotech.springWebApp.repositories;

import com.rsinnotech.springWebApp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
