package de.fd.mediamanager.gui.mvc.search.audioBook;

import de.fd.mediamanager.api.model.IAuthor;
import de.fd.mediamanager.api.model.ILector;
import de.fd.mediamanager.api.model.search.audiobook.IAudioBookSearchCriteria;


public class AudioBookSearchCriteria implements IAudioBookSearchCriteria{
	
	private String audioBookName;
	private String reader;
	private String writer;
	private String genre;
	
	public IAuthor author;
	public ILector lector;
	
	
	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public AudioBookSearchCriteria(){
	
	}

	public String getAudioBookName() {
		return audioBookName;
	}

	public void setAudioBookName(String audioBookName) {
		this.audioBookName = audioBookName;
	}

	public String getReader() {
		return reader;
	}

	public void setReader(String reader) {
		this.reader = reader;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public IAuthor getAuthor() {
		return author;
	}

	public void setAuthor(IAuthor author) {
		this.author = author;
	}

	public ILector getLector() {
		return lector;
	}

	public void setLector(ILector lector) {
		this.lector = lector;
	}
    
	
}
