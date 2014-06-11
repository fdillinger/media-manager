package de.fd.mediamanager.api;

import java.util.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.AbstractDependencyInjectionSpringContextTests;

import de.fd.mediamanager.model.audiobook.AudioBook;


public class MediaManagerFacadeTest extends AbstractDependencyInjectionSpringContextTests{

	private Log log = LogFactory.getLog(this.getClass());
	
	@Autowired
	IMediaManagerFacade facade;
	
	/* (non-Javadoc)
	 * @see org.springframework.test.AbstractSingleSpringContextTests#getConfigLocations()
	 */
	@Override
    protected String[] getConfigLocations() {
        return new String[]{"classpath:mediamanager-core-test.xml", "classpath:mediamanager-coredao-test.xml"};
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
       Collection<AudioBook> audioBooks = facade.findAllAudioBook(); 
       log.info("Size:"  + audioBooks.size());
       for(AudioBook audioBook: audioBooks){
       	 log.info(audioBook.getName());
       }
	}
	
}
