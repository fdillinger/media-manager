package de.fd.mediamanager.dao.nativesql;

import java.io.Serializable;
import java.util.Collection;

import de.fd.mediamanager.api.dao.IAudioBookDAO;
import de.fd.mediamanager.model.audiobook.AudioBook;

/**
 * <p> Title: AudioBookSQLDAO                   </p>
 * <p> Description:                             </p>
 * <p> Copyright: Copyright (c) 2011            </p>
 * <p> Company: Frank DILLINGER AG              </p>.
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

public class AudioBookSQLDAO implements IAudioBookDAO{


	/**
	 * Instantiates a new audio book sqldao.
	 */
	public AudioBookSQLDAO(){
		super();
	}
    
	/* (non-Javadoc)
	 * @see de.fd.mediamanager.api.dao.IAudioBookDAO#findAllAudioBooks()
	 */
	public Collection<AudioBook> findAllAudioBooks() {
		return null;
	}
	
	/* (non-Javadoc)
	 * @see de.fd.mediamanager.api.dao.IAudioBookDAO#findById(java.io.Serializable)
	 */
	public AudioBook findById(Serializable id){
		return null;
	}
    
    /* (non-Javadoc)
     * @see de.fd.mediamanager.api.dao.IAudioBookDAO#addAudioBook(de.fd.mediamanager.model.audiobook.AudioBook)
     */
    public void addAudioBook(AudioBook audioBook){
		
	}
}
