package de.fd.mediamanager.model.book;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import de.fd.mediamanager.api.model.IAuthor;
import de.fd.mediamanager.api.model.book.IBook;
import de.fd.mediamanager.model.Medium;

public class Book extends Medium implements IBook{
   
	// relation book -> Author
	private Set<IAuthor> authors = new HashSet<IAuthor>();
	
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
	
   
	
	public void addAuthor(IAuthor author){
	   if(author != null){
		   getAuthors().add(author);
	   }
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<IAuthor> getAuthors() {
		return authors;
	}

	public void setAuthors(Set<IAuthor> authors) {
		this.authors = authors;
	}
	
	
	
}
