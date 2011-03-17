package de.fd.mediamanager.model.book;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import de.fd.mediamanager.api.model.IAuthor;
import de.fd.mediamanager.api.model.book.IBook;
import de.fd.mediamanager.model.Medium;

public class Book extends Medium implements IBook{
   
	// relation book -> Author
	private List<IAuthor> authors = new ArrayList<IAuthor>();
	
	private String ISBN = "";
 
	private String name;
    
	public Book(){
    	super();
    }
    
    // interface method
	public String getISBN(){
		return this.ISBN;
	}
	
	public void setISBN(String ISBN){
	    this.ISBN = ISBN;	
	}
	
    public Collection<IAuthor> getAuthors(){
    	return authors;
    }
	
	public void addAuthor(IAuthor author){
	   if(author != null){
		   getAuthors().add(author);
	   }
	}
	
	// class method
	public void setAuthor(List<IAuthor> author) {
		this.authors = author;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
}
