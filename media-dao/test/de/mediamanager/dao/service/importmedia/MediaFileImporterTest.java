package de.mediamanager.dao.service.importmedia;

import org.springframework.test.AbstractDependencyInjectionSpringContextTests;

/**
 * <p> Title: MediaFileImporterTest                   </p>
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

public class MediaFileImporterTest extends AbstractDependencyInjectionSpringContextTests {

	
	/**
	 * Instantiates a new media file importer test.
	 */
	public MediaFileImporterTest(){
		
	}

	@Override
    protected String[] getConfigLocations() {
        return new String[]{"classpath:mediamanager-DAO-Test.xml"};
    }
}


