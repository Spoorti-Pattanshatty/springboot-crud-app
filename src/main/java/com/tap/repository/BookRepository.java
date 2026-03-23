package com.tap.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tap.models.Book;

@Repository
public interface BookRepository extends CrudRepository<Book , Integer>{

	public Book findById(int bid);
	
} 