package com.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.entities.Book;

public interface BookRepo extends JpaRepository <Book,Integer>{
	public Book findById(int id);
}
