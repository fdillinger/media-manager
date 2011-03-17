package de.fd.mediamanager.api.model;

import java.util.Collection;

import de.fd.mediamanager.api.model.book.IBook;

public interface IAuthor extends IPerson {

    Collection<IBook> getBooks();
	
	void addBook(IBook book);
	
}
