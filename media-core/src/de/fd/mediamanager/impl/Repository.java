package de.fd.mediamanager.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import de.fd.mediamanager.api.IRepository;
import de.fd.mediamanager.api.model.search.audiobook.IAudioBookSearchCriteria;
import de.fd.mediamanager.model.audiobook.AudioBook;

public class Repository implements IRepository{

	// injected by SPRING
	private List<AudioBook> audioBooks = new ArrayList<AudioBook>();
	
	public List<AudioBook> getAudioBooks() {
		return audioBooks;
	}

	public void setAudioBooks(List<AudioBook> audioBooks) {
		this.audioBooks = audioBooks;
	}

	public Collection<AudioBook> findAudioBook(IAudioBookSearchCriteria criteria)
	 {
         Collection<AudioBook> resultSet = new ArrayList<AudioBook>();
         if(null == criteria){
        	 return resultSet;
         }
         if(criteria.getGenre() != null){
        	 return audioBooks;
         }
         
         for(AudioBook book: getAudioBooks()){
        	 if(book.getAutor().equalsIgnoreCase(criteria.getWriter())){
                resultSet.add(book);
        	 }
        	 if(book.getName().equalsIgnoreCase(criteria.getAudioBookName())){
                 resultSet.add(book);
         	 }
        	 if(book.getReader().equalsIgnoreCase(criteria.getReader())){
                 resultSet.add(book);
         	 }
         }
         return resultSet;
	 }
}
