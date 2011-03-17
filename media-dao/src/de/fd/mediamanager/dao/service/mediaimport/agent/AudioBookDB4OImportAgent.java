package de.fd.mediamanager.dao.service.mediaimport.agent;

import java.io.File;

import de.fd.mediamanager.api.dao.IAudioBookDAO;
import de.fd.mediamanager.dao.MediaDAOFactory;
import de.fd.mediamanager.dao.db4o.AudioBookDB4ODAO;
import de.fd.mediamanager.dao.db4o.MediaDB4ODAOFactory;
import de.fd.mediamanager.dao.service.mediaimport.util.MediaImportUtil;
import de.fd.mediamanager.model.Author;
import de.fd.mediamanager.model.audiobook.AudioBook;


/**
 * <p> Title: AudioBookDB4OImportAgent                </p>
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

public class AudioBookDB4OImportAgent {

	/** The audio book dao. */
	IAudioBookDAO audioBookDAO = null; 
    
	/**
	 * Instantiates a new audio book d b4 o import agent.
	 */
	public AudioBookDB4OImportAgent(){
    	init();
    }
	
    /**
     * Inits the.
     */
    private void init(){
    	MediaDAOFactory factory = MediaDAOFactory.instance(MediaDB4ODAOFactory.class, null);
    	audioBookDAO = factory.getAudioBookDAO();
    }
    
	/**
	 * Import from file directory in d b4 o database.
	 *
	 * @param agentInfo the agent info
	 */
	public void importFromFileDirectoryInDB4ODatabase(AudioBookDB4OAgentInfo agentInfo){
		File root = new File (agentInfo.getRootDirectory());
		if(root.isDirectory()){	
			File[] authors = root.listFiles();
			if(authors == null || authors.length == 0){
				return;
			}
			setDatabase(agentInfo.getDatabaseName());
			openDB4ODatabase();
			for (int i = 0; i < authors.length; i++) {
			  if (authors[i].isDirectory()) {
				  readBooksFromAuthor(authors[i]);
			  }	
			}
			closeDB4ODatabase();
		}
		return;
    }
	
  	/**
	   * Read books from author.
	   *
	   * @param author the author
	   */
	  private void readBooksFromAuthor(File author){
		File[] books = author.listFiles();
		if(books != null && books.length > 0){
		   for (int i = 0; i < books.length; i++) {
			  if (books[i].isDirectory()) {
				  addBookinDB40Database(author, books[i]);
			   }
			}
		}
	}
  	
  	/**
	   * Adds the bookin d b40 database.
	   *
	   * @param fileAuthor the file author
	   * @param fileBook the file book
	   */
	  public void addBookinDB40Database(File fileAuthor, File fileBook){
  		// create audio book
  		AudioBook audioBook = new AudioBook();
  		audioBook.setName(fileBook.getName());
  		
  		// create Author
  		Author author = new Author();
  		author.setFirstname(MediaImportUtil.getFirstName(fileAuthor.getName()));
  		author.setSurname(MediaImportUtil.getLastName(fileAuthor.getName()));
  		
  		// set the bidirectional relation
  	    audioBook.addAuthor(author);
  	    author.addBook(audioBook);
  	    
  	    // call DAO
  	    audioBookDAO.addAudioBook(audioBook);    
  	}
  	
  	/**
	   * Open d b4 o database.
	   *
	   * @return true, if successful
	   */
	  public boolean openDB4ODatabase(){
  		if(audioBookDAO != null && 
  		   audioBookDAO instanceof AudioBookDB4ODAO){
  			return ((AudioBookDB4ODAO)audioBookDAO).openDB4ODatabase();
  		}
  		return false;
  	}
  	
  	/**
	   * Close d b4 o database.
	   *
	   * @return true, if successful
	   */
	  public boolean closeDB4ODatabase(){
  		if(audioBookDAO != null && 
  		   audioBookDAO instanceof AudioBookDB4ODAO){
  			return ((AudioBookDB4ODAO)audioBookDAO).closeDB4ODatabase();
  		}
  		return false;
  	}
  	
  	/**
	   * Sets the database.
	   *
	   * @param database the database
	   * @return true, if successful
	   */
	  public boolean setDatabase(String database){
  		if(audioBookDAO != null && 
  		   audioBookDAO instanceof AudioBookDB4ODAO){
  		     ((AudioBookDB4ODAO)audioBookDAO).setDatabase(database);
  		     return true;
  		}
  		return false;
  	}
  	
  	
}
