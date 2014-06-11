package de.fd.mediamanager.model.audiobook;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import de.fd.mediamanager.api.model.IAuthor;
import de.fd.mediamanager.api.model.ILector;
import de.fd.mediamanager.api.model.audiobook.IAudioBook;
import de.fd.mediamanager.model.book.Book;

public class AudioBook extends Book implements IAudioBook{
	
	// relation Audio book -> Lector
	//private List<ILector> lectors = new ArrayList<ILector>();
	private Set<ILector> lectors = new HashSet<ILector>();
	
	
	// simple book
	private String autor;
	private String reader;
	private final static String EMPTY = "";
	

	public Set<ILector> getLectors() {
		return lectors;
	}

	public void setLectors(Set<ILector> lectors) {
		this.lectors = lectors;
	}

	public void addLector(ILector lector){
	
	}
	
	public AudioBook(String name, String autor, String reader){
		super();
		this.setName(name);
		this.autor = autor;
		this.reader = reader;
	}
	
	public AudioBook(){
		super();
	}
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getReader() {
		return reader;
	}
	public void setReader(String reader) {
		this.reader = reader;
	}
	
}
