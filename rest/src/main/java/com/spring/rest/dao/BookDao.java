package com.spring.rest.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.rest.entities.Book;

@Repository
public interface BookDao extends JpaRepository<Book, Long> {
	
	
}
