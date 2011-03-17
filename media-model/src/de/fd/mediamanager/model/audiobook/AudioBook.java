package de.fd.mediamanager.model.audiobook;


import java.util.ArrayList;
import java.util.List;

import de.fd.mediamanager.api.model.ILector;
import de.fd.mediamanager.api.model.audiobook.IAudioBook;
import de.fd.mediamanager.model.book.Book;

public class AudioBook extends Book implements IAudioBook{
	
	// relation Audio book -> Lector
	private List<ILector> lectors = new ArrayList<ILector>();
	
	// simple book
	private String id;
	private String autor;
	private String reader;
	private final static String EMPTY = "";
	
    
	public List<ILector> getLectors() {
		return lectors;
	}

	public void setLectors(List<ILector> lectors) {
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
	
	public String getId() {
		return id;
	}

	private void setId(String id) {
		this.id = id;
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
