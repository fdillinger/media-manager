package de.fd.mediamanager.api;

import java.io.Serializable;
import java.util.Collection;

import de.fd.mediamanager.model.Author;
import de.fd.mediamanager.model.audiobook.AudioBook;

/**
 * <p> Title: Interface audio book repository  </p>
 * <p> Description:                            </p>
 * <p> Copyright: Copyright (c) 2011           </p>
 * <p> Company: Frank DILLINGER AG             </p>.
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

public interface IAudioBookRepository {

	/**
	 * Gets the all audio books.
	 *
	 * @return the all audio books
	 */
	Collection<AudioBook> getAllAudioBooks();
	
	/**
	 * Gets the all authors.
	 *
	 * @return the all authors
	 */
	Collection<Author> getAllAuthors();
	
	/**
	 * Gets the audio book by id.
	 *
	 * @param id the id
	 * @return the audio book by id
	 */
	AudioBook getAudioBookById(Serializable id);
	
	/**
	 * Gets the author by id.
	 *
	 * @param id the id
	 * @return the author by id
	 */
	Author getAuthorById(Serializable id);
	
	/**
	 * Save or update.
	 *
	 * @param audioBook the audio book
	 * @return true, if successful
	 */
	boolean saveOrUpdate(AudioBook audioBook);
	
	/**
	 * Search audio book by name.
	 *
	 * @param bookName the book name
	 * @return the collection
	 */
	Collection<AudioBook> searchAudioBookByName(String bookName);

	/**
	 * Search author by name.
	 *
	 * @param surename the surename
	 * @return the collection
	 */
	Collection<Author> searchAuthorByName(String surename);
	
	/**
	 * Search audio books from author.
	 *
	 * @param surname the surname
	 * @return the collection
	 */
	Collection<AudioBook> searchAudioBooksFromAuthor(String surname);
	
}
