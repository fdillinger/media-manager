/*
 * 
 */
package de.mediamanager.dao.repository;

import java.util.Collection;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.AbstractDependencyInjectionSpringContextTests;

import de.fd.mediamanager.api.IMediaManagerRepository;
import de.fd.mediamanager.model.Author;
import de.fd.mediamanager.model.audiobook.AudioBook;


/**
 * <p> Title: DB4OAudioBookRepositoryTest             </p>
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

public class DB4OAudioBookRepositoryTest extends AbstractDependencyInjectionSpringContextTests{

	/** The media manager repository. */
	@Autowired
	IMediaManagerRepository mediaManagerRepository;
	
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
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * Tear down after class.
	 *
	 * @throws Exception the exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	
	
	/**
	 * Test find all audi books.
	 */
	@Test
	public void testFindAllAudiBooks() { 
       	Collection<AudioBook> audioBooks = mediaManagerRepository.getAudioBookRepository().getAllAudioBooks(); 
       	System.out.println("Size:"  + audioBooks.size());
        for(AudioBook audioBook: audioBooks){
       	   System.out.println(audioBook.getName());
        }
	}
	
}
