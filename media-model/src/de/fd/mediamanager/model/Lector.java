package de.fd.mediamanager.model;

import java.util.ArrayList;
import java.util.List;

import de.fd.mediamanager.api.model.ILector;
import de.fd.mediamanager.api.model.audiobook.IAudioBook;

public class Lector extends Person implements ILector{
	
	// relation lector -> audio book
	private List<IAudioBook> audioBooks = new ArrayList<IAudioBook>();
	
	public Lector(){
		super();
	}

	public List<IAudioBook> getAudioBooks() {
		return audioBooks;
	}
	
	public void addAudioBook(IAudioBook audioBook){
		if(audioBook != null){
            this.audioBooks.add(audioBook);
		}
	}
	
	// class method
	public void setAudioBooks(List<IAudioBook> audioBooks) {
		this.audioBooks = audioBooks;
	}
}
