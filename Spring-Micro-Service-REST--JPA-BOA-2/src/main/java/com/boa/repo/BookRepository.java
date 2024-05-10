package com.boa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boa.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
	//Create //Update //Delete //ListOperation 
	//custom //JPQL

}
