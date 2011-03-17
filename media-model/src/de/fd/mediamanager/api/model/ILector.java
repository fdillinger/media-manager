package de.fd.mediamanager.api.model;

import java.util.Collection;

import de.fd.mediamanager.api.model.audiobook.IAudioBook;

public interface ILector extends IPerson{

    Collection<IAudioBook> getAudioBooks();
	
	void addAudioBook(IAudioBook audioBook);
	
}
