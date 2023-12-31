package com.api.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
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
	@OneToOne(cascade= CascadeType.ALL)
	@JsonManagedReference
	private Author author;
	public Book() {}
	public Book(int id, String title, Author author) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
	};

}
