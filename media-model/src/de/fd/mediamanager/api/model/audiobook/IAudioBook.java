package de.fd.mediamanager.api.model.audiobook;

import java.util.Collection;

import de.fd.mediamanager.api.model.ILector;
import de.fd.mediamanager.api.model.book.IBook;

public interface IAudioBook extends IBook {

	
    Collection<ILector> getLectors();
	
	void addLector(ILector lector);
	
}
