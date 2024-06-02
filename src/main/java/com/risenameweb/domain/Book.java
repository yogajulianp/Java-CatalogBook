package com.risenameweb.domain;

import com.risenameweb.domain.Author;

public class Book {
	//private Author author = new Author(); //ini bentuk hardCode depedensi
	
	
	// untuk metode depedency injection
	private Author author;

	public Book(Author author) {
		super();
		this.author = author;
	}
	
}
