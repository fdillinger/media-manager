/**
 * 
 */
package de.fd.mediamanager.api.dao;

import java.io.Serializable;
import java.util.Collection;

import de.fd.mediamanager.model.Person;
import de.fd.mediamanager.model.audiobook.AudioBook;

/**
 * <p> Title: Interface audio book DAO         </p>
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


public interface IAudioBookDAO {

	/**
	 * Find all audio books.
	 *
	 * @return the collection
	 */
	Collection<AudioBook> findAllAudioBooks();
	
	
	/**
	 * Find by id.
	 *
	 * @param id the id
	 * @return the audio book
	 */
	AudioBook findById(Serializable id);
	
	/**
	 * Adds the audio book.
	 *
	 * @param audioBook the audio book
	 */
	void addAudioBook(AudioBook audioBook);
	
}
