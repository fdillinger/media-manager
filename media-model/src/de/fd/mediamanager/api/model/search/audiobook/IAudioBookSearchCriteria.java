package de.fd.mediamanager.api.model.search.audiobook;

import de.fd.mediamanager.api.model.IAuthor;
import de.fd.mediamanager.api.model.ILector;

public interface IAudioBookSearchCriteria {
	public String getAudioBookName();
	public void setAudioBookName(String audioBookName);
    public String getReader();
    public void setReader(String reader);
    public String getWriter();
    public void setWriter(String writer);
    public void setGenre(String genre);
    public String getGenre();

    // serach for Author
    IAuthor getAuthor();
	void setAuthor(IAuthor author);

	ILector getLector();
	void setLector(ILector lector);
    
}
