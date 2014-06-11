/**
 * 
 */
package de.fd.mediamanager.dao.db4o;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.ext.DatabaseFileLockedException;
import com.db4o.query.Predicate;

import de.fd.mediamanager.api.dao.IAudioBookDAO;
import de.fd.mediamanager.api.model.IAuthor;
import de.fd.mediamanager.model.Author;
import de.fd.mediamanager.model.Person;
import de.fd.mediamanager.model.audiobook.AudioBook;

/**
 * <p> Title: AudioBookDB4ODAO                  </p>
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

public class AudioBookDB4ODAO  implements IAudioBookDAO {

	/** The database. */
	private String database = null;
	
	/** The db4o. */
	private static ObjectContainer db4o;
	
	/**
	 * Instantiates a new audio book d b4 odao.
	 */
	public AudioBookDB4ODAO() {
		super();
	}
    
	/* (non-Javadoc)
	 * @see de.fd.mediamanager.api.dao.IAudioBookDAO#findById(java.io.Serializable)
	 */
	public AudioBook findById(Serializable id){
		return null;
	}
	
	// interface Method	
	/* (non-Javadoc)
	 * @see de.fd.mediamanager.api.dao.IAudioBookDAO#findAllAudioBooks()
	 */
	public Collection<AudioBook> findAllAudioBooks() {
		Collection<AudioBook> audioBooks = null;
		try {
			audioBooks = queryByFindAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return audioBooks;
	}
    
	/**
	 * Find all authors.
	 *
	 * @return the collection
	 */
	public Collection<Author> findAllAuthors(){
		Set<Author> authorSet = new HashSet<Author>(500);
		try {
			Collection<Author> authors = queryByFindAllAuthors();
			authorSet.addAll(authors);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return authorSet;
	}
	
	
	/**
	 * Find by audio book name.
	 *
	 * @param bookName the book name
	 * @return the collection
	 */
	public  Collection<AudioBook> findByAudioBookName(String bookName){
		Collection<AudioBook> audioBooks = null;
		try {
			audioBooks = queryByAudioBookName(bookName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return audioBooks;
	}
	
	
	/**
	 * Find audio books from author.
	 *
	 * @param surname the surname
	 * @return the collection
	 */
	public  Collection<AudioBook> findAudioBooksFromAuthor(String surname){
		Collection<AudioBook> audioBooks = null;
		try {
			audioBooks = queryByAuthorName(surname);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return audioBooks;
	}
	
	
	/* (non-Javadoc)
	 * @see de.fd.mediamanager.api.dao.IAudioBookDAO#addAudioBook(de.fd.mediamanager.model.audiobook.AudioBook)
	 */
	public void addAudioBook(AudioBook audioBook){
	  	if(audioBook == null){
	  		return;
	  	}
		try{
			db4o.set(audioBook);
	  	}
		catch(DatabaseFileLockedException e1){
			db4o.rollback();
			e1.printStackTrace();
		}
		catch(Exception e){
			db4o.rollback();
			e.printStackTrace();
		}
		finally{
		   db4o.commit();	
		}
	}
	
	/**
	 * Query by audio book name.
	 *
	 * @param name the name
	 * @return the collection
	 */
	private Collection<AudioBook> queryByAudioBookName(final String name) {
		return db4o.query(new Predicate<AudioBook>() {
            public boolean match(AudioBook audioBook) {
                return audioBook.getName().startsWith(name);
            }            
        });
    }
	
	
	/**
	 * Query by author name.
	 *
	 * @param surname the surname
	 * @return the collection
	 */
	private Collection<AudioBook> queryByAuthorName(final String surname) {
		return db4o.query(new Predicate<AudioBook>() {
            public boolean match(AudioBook audioBook) {
            	 for(IAuthor author: audioBook.getAuthors()){
            		 if(author.getSurname().startsWith(surname)){
            			 return true;
            		 }
            	 }
            	 return false;
            }            
        });
    }
	
	/**
	 * Query by find all.
	 *
	 * @return the collection
	 */
	private Collection<AudioBook> queryByFindAll() {
		return db4o.query(new Predicate<AudioBook>() {
            public boolean match(AudioBook audioBook) {
            	 return true;
            }            
        });
    }
	
	
	/**
	 * Query by find all authors.
	 *
	 * @return the object set
	 */
	private ObjectSet<Author> queryByFindAllAuthors() {
		return db4o.query(new Predicate<Author>() {
            public boolean match(Author author) {
            	 return true;
            }            
        });
    }
	
	
	/**
	 * Open d b4 o database.
	 *
	 * @return true, if successful
	 */
	public boolean openDB4ODatabase(){
		if(database != null){
			if(db4o == null){
				db4o = Db4o.openFile(database);
			}
			else{
				closeDB4ODatabase();
				db4o = Db4o.openFile(database);
			}
		    return true;
		}
		return false;
	}
	
	/**
	 * Close d b4 o database.
	 *
	 * @return true, if successful
	 */
	public boolean closeDB4ODatabase(){
		return db4o.close();
	}
	
	  
    /**
     * Gets the database.
     *
     * @return the database
     */
    public String getDatabase() {
		return database;
	}

	/**
	 * Sets the database.
	 *
	 * @param database the new database
	 */
	public void setDatabase(String database) {
		this.database = database;
	}
	
	public Collection<Person> findPerson(){
		return null;
	}
}
