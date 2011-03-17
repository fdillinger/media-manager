/*
 * 
 */
package de.fd.mediamanager.dao;

import java.io.Serializable;
import java.util.Collection;

import de.fd.mediamanager.api.dao.IAudioBookDAO;
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

public abstract class AudioBookDAO implements IAudioBookDAO{

	/**
	 * Instantiates a new audio book dao.
	 */
	public AudioBookDAO(){
		
	}
	
    /* (non-Javadoc)
     * @see de.fd.mediamanager.api.dao.IAudioBookDAO#findAllAudioBooks()
     */
    public abstract Collection<AudioBook> findAllAudioBooks();
	
	/* (non-Javadoc)
	 * @see de.fd.mediamanager.api.dao.IAudioBookDAO#findById(java.io.Serializable)
	 */
	public abstract AudioBook findById(Serializable id);
	
	/* (non-Javadoc)
	 * @see de.fd.mediamanager.api.dao.IAudioBookDAO#addAudioBook(de.fd.mediamanager.model.audiobook.AudioBook)
	 */
	public abstract void addAudioBook(AudioBook audioBook);
	
}
