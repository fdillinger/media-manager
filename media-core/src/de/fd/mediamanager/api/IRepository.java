package de.fd.mediamanager.api;

import java.util.Collection;

import de.fd.mediamanager.api.model.search.audiobook.IAudioBookSearchCriteria;
import de.fd.mediamanager.model.audiobook.AudioBook;


public interface IRepository {
   
	public Collection<AudioBook> findAudioBook(IAudioBookSearchCriteria criteria);
	
}
