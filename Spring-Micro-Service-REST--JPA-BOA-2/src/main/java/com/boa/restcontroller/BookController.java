package com.boa.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boa.entity.Book;
import com.boa.repo.BookRepository;

@RestController
@RequestMapping("/books")
public class BookController {
	
	 private final BookRepository bookRepository;

	    @Autowired
	    public BookController(BookRepository bookRepository) {
	        this.bookRepository = bookRepository;
	    }

	    @GetMapping  // request mapping  change 
	    public List<Book> getAllBooks() {
	        return bookRepository.findAll();
	    }

	    @PostMapping
	    public Book addBook(@RequestBody Book book) {
	        return bookRepository.save(book);
	    }

	    @GetMapping("/{id}")
	    public Book getBookById(@PathVariable Long id) {
	        return bookRepository.findById(id).orElse(null);
	    }

	    @PutMapping("/{id}")
	    public Book updateBook(@PathVariable Long id, @RequestBody Book updatedBook) {
	        if (bookRepository.existsById(id)) {
	            updatedBook.setId(id);
	            return bookRepository.save(updatedBook);
	        }
	        return null;
	    }

	    @DeleteMapping("/{id}")
	    public void deleteBook(@PathVariable Long id) {
	        bookRepository.deleteById(id);
	    }

}
