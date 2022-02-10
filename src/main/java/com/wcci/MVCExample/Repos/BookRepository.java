package com.wcci.MVCExample.Repos;

import com.wcci.MVCExample.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepo extends CrudRepository<Book, Long> {

}
