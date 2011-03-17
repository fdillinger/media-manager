/*
 * 
 */
package de.mediamanager.dao.service.importmedia;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import de.fd.mediamanager.dao.service.mediaimport.AudioBookImporter;

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


//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {"classpath:/mediamanager-DAO-Test.xml"})
//@TestExecutionListeners({DependencyInjectionTestExecutionListener.class})
public class MediaFileImporterIntegrationTest {

	/** The importer. */
	@Autowired
	AudioBookImporter importer;
		
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
	 * Test import from file directory as xml file.
	 */
	@Test
	public void testImportFromFileDirectoryAsXMLFile() {
		String rootDirectory = "R:\\Dillinger\\Audio Book";
		String xmlDestination = "R:\\Dillinger\\Temp\\";
		String xmlName = "audioBook.xml";
		//AudioBookImporter importer = new AudioBookImporter();
		//importer.importFromFileDirectoryInXMLFile(rootDirectory,xmlDestination,xmlName);
	}

}
