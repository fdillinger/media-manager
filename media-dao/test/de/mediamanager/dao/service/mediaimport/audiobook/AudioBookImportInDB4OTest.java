package de.mediamanager.dao.service.mediaimport.audiobook;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import de.fd.mediamanager.dao.service.mediaimport.AudioBookImporter;
import de.fd.mediamanager.dao.service.mediaimport.agent.AudioBookDB4OAgentInfo;
import de.mediamanager.dao.service.importmedia.MediaFileImporterTest;


/**
 * <p> Title: AudioBookImportInDB4OTest                </p>
 * <p> Description:                                    </p>
 * <p> Copyright: Copyright (c) 2011                   </p>
 * <p> Company: Frank DILLINGER AG                     </p>.
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

public class AudioBookImportInDB4OTest extends MediaFileImporterTest{
	
	
	/** The audio book importer. */
	
	@Autowired
	AudioBookImporter audioBookImporter;

	/** The audio book d b4 o import agent info. */
	@Autowired
	@Qualifier("audioBookDB4OImportAgentInfoParliament")
	AudioBookDB4OAgentInfo audioBookDB4OImportAgentInfo;

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
	 * Test import from file directory in d b4 o database.
	 */
	@Test
	public void testImportFromFileDirectoryInDB4ODatabase() {
		audioBookImporter.importFromFileDirectoryInDB4ODatabase(audioBookDB4OImportAgentInfo);
	}
}
