package de.fd.mediamanager.api.model.book;

import java.util.Collection;

import de.fd.mediamanager.api.model.IAuthor;
import de.fd.mediamanager.api.model.IMedium;

public interface IBook extends IMedium{
     
	String getISBN();
	
	void setISBN(String ISBN);
	
	Collection<IAuthor> getAuthors();
	
	void addAuthor(IAuthor author);

	String getName();
	
	void setName(String name);
}
