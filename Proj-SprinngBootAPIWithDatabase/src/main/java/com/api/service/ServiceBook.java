package com.api.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.dao.BookRepo;
import com.api.entities.Book;
@Component
public class ServiceBook {
	@Autowired
	private BookRepo bookRepo;
	public List<Book> getAllBooks(){
		List<Book> ls=(List<Book>)bookRepo.findAll();
		return ls;
	}
	public Book getBookByID(int id){
		Book book=null;
		book=bookRepo.findById(id);
		return book;
	}
	public Book addBook(Book b) {
		Book result=bookRepo.save(b);
		return result;
	}
	public void deleteBookById(int id) {
		bookRepo.deleteById(id);
	}
	public void updateBook(Book book,int id) {
		book.setId(id);
		bookRepo.save(book);
	}
}
