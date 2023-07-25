package com.api.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="books")
@Data
public class Book {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(length=50)
	private String title;
	@Column(length=50)
	private String author;
	public Book() {};
	public Book(int id, String title, String author) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
	}

}
