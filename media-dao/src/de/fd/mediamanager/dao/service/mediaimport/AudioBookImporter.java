package de.fd.mediamanager.dao.service.mediaimport;

import org.springframework.beans.factory.annotation.Autowired;

import de.fd.mediamanager.dao.service.mediaimport.agent.AudioBookCassandraImportAgent;
import de.fd.mediamanager.dao.service.mediaimport.agent.AudioBookDB4OAgentInfo;
import de.fd.mediamanager.dao.service.mediaimport.agent.AudioBookDB4OImportAgent;
import de.fd.mediamanager.dao.service.mediaimport.agent.AudioBookHibernateImportAgent;
import de.fd.mediamanager.dao.service.mediaimport.agent.AudioBookSQLImportAgent;
import de.fd.mediamanager.dao.service.mediaimport.agent.AudioBookXMLImportAgent;
import de.fd.mediamanager.dao.service.mediaimport.agent.AudioBookXMLImportAgentInfo;


/**
 * <p> Title: AudioBookImporter                 </p>
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


public class AudioBookImporter extends MediaFileImporter{
	
	/** The xml import agent. */
	@Autowired
	AudioBookXMLImportAgent xmlImportAgent;
	
	/** The sql import agent. */
	AudioBookSQLImportAgent sqlImportAgent;
	
	/** The hibernate import agent. */
	AudioBookHibernateImportAgent hibernateImportAgent;
	
	/** The cassandra import agent. */
	AudioBookCassandraImportAgent cassandraImportAgent;
	
	/** The db4o import agent. */
	@Autowired
	AudioBookDB4OImportAgent db4oImportAgent;
	
	
	/**
	 * Instantiates a new audio book importer.
	 */
	public AudioBookImporter(){
		
	}
	
	/**
	 * Import from file directory in xml file.
	 *
	 * @param xmlImportAgentInfo the xml import agent info
	 * @return true, if successful
	 */
	public boolean importFromFileDirectoryInXMLFile(AudioBookXMLImportAgentInfo xmlImportAgentInfo){
		//return xmlImportAgent.importFromFileDirectoryInXMLFile(xmlImportAgentInfo);
        return xmlImportAgent.importFromFileDirectoryInXMLFileAsAuthor(xmlImportAgentInfo);
	}
	
	
	/**
	 * Import from file directory in sql database.
	 */
	public void importFromFileDirectoryInSQLDatabase(){
       throw new RuntimeException("Not implemented yet...");
	}
	
	
    /**
     * Import from file directory in d b4 o database.
     *
     * @param db4OAgentInfo the db4 o agent info
     */
    public void importFromFileDirectoryInDB4ODatabase(AudioBookDB4OAgentInfo db4OAgentInfo){
    	db4oImportAgent.importFromFileDirectoryInDB4ODatabase(db4OAgentInfo);
	}
	
    /**
     * Import from file directory in text file.
     */
    public void importFromFileDirectoryInTextFile(){
    	throw new RuntimeException("Not implemented yet...");
	}
    
    /**
     * Import from file directory with hibernate.
     */
    public void importFromFileDirectoryWithHibernate(){
    	throw new RuntimeException("Not implemented yet...");
	}
	
    /**
     * Import from file directory in cassandra database.
     */
    public void importFromFileDirectoryInCassandraDatabase(){
    	throw new RuntimeException("Not implemented yet...");
	}
		
}
