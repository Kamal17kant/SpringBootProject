package com.api.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.api.entities.Book;
@Component
public class ServiceBook {
	static List<Book> ls=new ArrayList<>();
	static {
		ls.add(new Book(123,"c++ for programmer","ABC"));
		ls.add(new Book(124,"c Fundemantal","ZYZ"));
		ls.add(new Book(125,"Python for biginer","SUVT"));
		ls.add(new Book(126,"java for devloper","KWTR"));
	}
	public List<Book> getAllBooks(){
		return ls;
	}
	public Book getBookByID(int id){
		Book book=null;
		book=ls.stream().filter(e->e.getId()==id).findFirst().get();
		return book;
	}
	public Book addBook(Book b) {
		ls.add(b);
		return b;
	}
	public void deleteBookById(int id) {
		ls=ls.stream().filter(e->e.getId() != id).collect(Collectors.toList());
	}
	public void updateBook(int id) {
		ls=ls.stream().map(b->{
			if(b.getId()==id) {
				b.setTitle("fundemental");
				b.setAuthor("rajesh");
			}
			return b;
		}).collect(Collectors.toList());
	}
}
