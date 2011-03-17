package de.fd.mediamanager.model;

import java.util.ArrayList;
import java.util.List;

import de.fd.mediamanager.api.model.IAuthor;
import de.fd.mediamanager.api.model.book.IBook;

public class Author extends Person implements IAuthor{
	
	// relation Author -> Books
	private List<IBook> books = new ArrayList<IBook>();
	
	public Author(){
	   super();	
	}

	// interface method
	public List<IBook> getBooks() {
		return books;
	}

	
    public void addBook(IBook book) {
	   if(book != null){
	       getBooks().add(book);
	   }
	}
	
	// class method
	public void setBook(List<IBook> books) {
		this.books = books;
	}
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
}
