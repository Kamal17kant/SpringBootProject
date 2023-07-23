package com.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.entities.Book;
import com.api.service.ServiceBook;

@RestController
public class BookController {
	@Autowired
	private ServiceBook bookService;
	
	@GetMapping("/book")
	public List<Book> getBooks() {
		return bookService.getAllBooks();
	}
	@GetMapping("/book/{id}")
	public Book getBookById(@PathVariable("id") int id) {
		return bookService.getBookByID(id);
	}
	@PostMapping("/book")
	public Book addBook(@RequestBody Book b) {
		Book bk=bookService.addBook(b);
		return bk;
	}
	@DeleteMapping("/book/{id}")
	public void delete(@PathVariable("id")int id) {
		bookService.deleteBookById(id);
	}
	@PutMapping("/book/{id}")
	public Book updateBook(@RequestBody Book book ,@PathVariable("id") int id) {
		bookService.updateBook(id);
		return book;
	}
}
