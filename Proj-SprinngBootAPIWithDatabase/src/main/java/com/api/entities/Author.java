package com.api.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Author {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int authorId;
	private String firstName;
	private String lastName;
	private String language;
	@OneToOne(mappedBy="author")
	@JsonBackReference
	private Book book;
	public Author() {};
	public Author(int authorId, String firstName, String lastName, String language,Book book) {
		super();
		this.authorId = authorId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.language = language;
		this.book=book;
	}
	
}
