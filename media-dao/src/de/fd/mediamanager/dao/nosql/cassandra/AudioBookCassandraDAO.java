package de.fd.mediamanager.dao.nosql.cassandra;

import java.io.Serializable;
import java.util.Collection;

import de.fd.mediamanager.api.dao.IAudioBookDAO;
import de.fd.mediamanager.model.Person;
import de.fd.mediamanager.model.audiobook.AudioBook;

/**
 * <p> Title: AudioBookCassandraDAO             </p>
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

public class AudioBookCassandraDAO  implements IAudioBookDAO {

	public AudioBookCassandraDAO() {
		super();
	}
	
	public Collection<AudioBook> findAllAudioBooks() {
		return null;
	}
	
	public AudioBook findById(Serializable id){
		return null;
	}
	
    public void addAudioBook(AudioBook audioBook){
		
	}
    
    public Collection<Person> findPerson(){
		return null;
	}
}
