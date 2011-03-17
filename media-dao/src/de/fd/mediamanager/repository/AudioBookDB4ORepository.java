package de.fd.mediamanager.repository;

import java.io.Serializable;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;

import de.fd.mediamanager.api.IAudioBookRepository;
import de.fd.mediamanager.dao.db4o.AudioBookDB4ODAO;
import de.fd.mediamanager.dao.db4o.AudioBookDB4ODAOConfig;
import de.fd.mediamanager.dao.db4o.MediaDB4ODAOFactory;
import de.fd.mediamanager.model.Author;
import de.fd.mediamanager.model.audiobook.AudioBook;


/**
 * <p> Title: AudioBookDB4ORepository                 </p>
 * <p> Description:                                   </p>
 * <p> Copyright: Copyright (c) 2011                  </p>
 * <p> Company: Frank DILLINGER AG                    </p>.
 *
 * @author fdillinger
 * @date 17 Mar 2011 14:39:49
 * @projectname
 * @version $Id: $
 * 
 * <pre>
 * Changes
 * ===========================================================================
 * Date:   Name:        JIRA /Issue Id:       Description:
 * 
 * </pre>
 */


public class AudioBookDB4ORepository implements IAudioBookRepository{

	/** The dao factory. */
	@Autowired
	MediaDB4ODAOFactory daoFactory;
	
	/** The config. */
	@Autowired
	private AudioBookDB4ODAOConfig config;
	
	/** The db4o dao. */
	private AudioBookDB4ODAO db4oDAO;
	
	/**
	 * Instantiates a new audio book d b4 o repository.
	 */
	public AudioBookDB4ORepository(){
		
	}
	
    /* (non-Javadoc)
     * @see de.fd.mediamanager.api.IAudioBookRepository#getAllAudioBooks()
     */
    public Collection<AudioBook> getAllAudioBooks(){
        return getDb4oDAO().findAllAudioBooks();	
    }
	
	/* (non-Javadoc)
	 * @see de.fd.mediamanager.api.IAudioBookRepository#getAllAuthors()
	 */
	public Collection<Author> getAllAuthors(){
		return getDb4oDAO().findAllAuthors();
	}
	
	/* (non-Javadoc)
	 * @see de.fd.mediamanager.api.IAudioBookRepository#getAudioBookById(java.io.Serializable)
	 */
	public AudioBook getAudioBookById(Serializable id){
		return null;
	}
	
	/* (non-Javadoc)
	 * @see de.fd.mediamanager.api.IAudioBookRepository#getAuthorById(java.io.Serializable)
	 */
	public Author getAuthorById(Serializable id){
		return null;
	}
	
	/* (non-Javadoc)
	 * @see de.fd.mediamanager.api.IAudioBookRepository#saveOrUpdate(de.fd.mediamanager.model.audiobook.AudioBook)
	 */
	public boolean saveOrUpdate(AudioBook audioBook){
		getDb4oDAO().addAudioBook(audioBook);
		return true;
	}
	
	/* (non-Javadoc)
	 * @see de.fd.mediamanager.api.IAudioBookRepository#searchAudioBookByName(java.lang.String)
	 */
	public Collection<AudioBook> searchAudioBookByName(String bookName){
		return getDb4oDAO().findByAudioBookName(bookName);
	}

	/* (non-Javadoc)
	 * @see de.fd.mediamanager.api.IAudioBookRepository#searchAuthorByName(java.lang.String)
	 */
	public Collection<Author> searchAuthorByName(String surename){
	   return null;
	}
	
	/* (non-Javadoc)
	 * @see de.fd.mediamanager.api.IAudioBookRepository#searchAudioBooksFromAuthor(java.lang.String)
	 */
	public Collection<AudioBook> searchAudioBooksFromAuthor(String surname){
		return getDb4oDAO().findAudioBooksFromAuthor(surname);
	}
		
	/**
	 * Gets the db4o dao.
	 *
	 * @return the db4oDAO
	 */
	public AudioBookDB4ODAO getDb4oDAO() {
		if(db4oDAO == null){
			db4oDAO = daoFactory.getAudioBookDAO();
			if(config != null){
				db4oDAO.setDatabase(config.getDatabaseName());
				db4oDAO.openDB4ODatabase();
			}
		}
		return db4oDAO;
	}

	/**
	 * Sets the db4o dao.
	 *
	 * @param db4oDAO the db4oDAO to set
	 */
	public void setDb4oDAO(AudioBookDB4ODAO db4oDAO) {
		this.db4oDAO = db4oDAO;
	}
}
