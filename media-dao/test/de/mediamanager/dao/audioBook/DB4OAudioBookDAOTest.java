package de.mediamanager.dao.audioBook;

import java.util.Collection;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.AbstractDependencyInjectionSpringContextTests;

import de.fd.mediamanager.dao.MediaDAOFactory;
import de.fd.mediamanager.dao.db4o.AudioBookDB4ODAO;
import de.fd.mediamanager.dao.db4o.MediaDB4ODAOFactory;
import de.fd.mediamanager.dao.service.mediaimport.agent.AudioBookDB4OAgentInfo;
import de.fd.mediamanager.model.Author;
import de.fd.mediamanager.model.audiobook.AudioBook;



/**
 * <p> Title: DAOInterfaceTest                        </p>
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


public class DB4OAudioBookDAOTest extends AbstractDependencyInjectionSpringContextTests{

	/** The db4o dao. */
	AudioBookDB4ODAO  db4oDAO = null;
	
	/** The audio book d b4 o import agent info. */
	@Autowired
	@Qualifier("audioBookDB4OImportAgentInfoParliament")
	AudioBookDB4OAgentInfo audioBookDB4OImportAgentInfo;
	
	
	/* (non-Javadoc)
	 * @see org.springframework.test.AbstractSingleSpringContextTests#getConfigLocations()
	 */
	@Override
    protected String[] getConfigLocations() {
        return new String[]{"classpath:mediamanager-DAO-Test.xml"};
    }
	
	/**
	 * Sets the up before class.
	 *
	 * @throws Exception the exception
	 */
	@BeforeClass
	public void setUpBeforeClass() throws Exception {
		
	}

	/**
	 * Tear down after class.
	 *
	 * @throws Exception the exception
	 */
	@AfterClass
	public void tearDownAfterClass() throws Exception {
		
	}

	
	/**
	 * Test find all authors.
	 */
	@Test
	public void testFindAllAuthors() {
		getDB4ODAO().openDB4ODatabase(); 
		Collection<Author> authors = getDB4ODAO().findAllAuthors();
         System.out.println("Size:"  + authors.size());
         for(Author author: authors){
        	 System.out.println(author.getSurname()); 
         }
         getDB4ODAO().closeDB4ODatabase();
	}
	
	
	/**
	 * Test find all books.
	 */
	@Test
	public void testFindAllBooks() {
         getDB4ODAO().openDB4ODatabase();
         Collection<AudioBook> audioBooks = getDB4ODAO().findAllAudioBooks();
         System.out.println("Size:"  + audioBooks.size());
         for(AudioBook audioBook: audioBooks){
        	 System.out.println(audioBook.getName()); 
         }
         getDB4ODAO().closeDB4ODatabase();
	}
	
	/**
	 * Test find audio book by author name.
	 */
	@Test
	public void testFindAudioBookByAuthorName() {
         String surname = "Eco";
         getDB4ODAO().openDB4ODatabase();
         Collection<AudioBook> audioBooks = getDB4ODAO().findAudioBooksFromAuthor(surname);
         System.out.println("Size:"  + audioBooks.size());
         for(AudioBook audioBook: audioBooks){
        	 System.out.println(audioBook.getName()); 
         }
         getDB4ODAO().closeDB4ODatabase();
	}
	
	/**
	 * Test find audio book by name.
	 */
	@Test
	public void testFindAudioBookByName() {
         String audioBookName = "Der Zauberberg";
         getDB4ODAO().openDB4ODatabase();
         Collection<AudioBook> audioBooks = getDB4ODAO().findByAudioBookName(audioBookName);
         System.out.println("Size:"  + audioBooks.size());
         for(AudioBook audioBook: audioBooks){
        	 System.out.println(audioBook.getName()); 
         }
         getDB4ODAO().closeDB4ODatabase();
	}
	
	/**
	 * Gets the d b4 odao.
	 *
	 * @return the d b4 odao
	 */
	private AudioBookDB4ODAO getDB4ODAO(){
		if(db4oDAO == null){
			MediaDAOFactory factory = MediaDAOFactory.instance(MediaDB4ODAOFactory.class, null);
			db4oDAO = (AudioBookDB4ODAO)factory.getAudioBookDAO();
			db4oDAO.setDatabase(audioBookDB4OImportAgentInfo.getDatabaseName());
		}
		return db4oDAO;
	}
	
}
