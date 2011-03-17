package de.fd.mediamanager.dao.service.mediaimport.agent;


/**
 * <p> Title: AudioBookDB4OAgentInfo                </p>
 * <p> Description:                                 </p>
 * <p> Copyright: Copyright (c) 2011                </p>
 * <p> Company: Frank DILLINGER AG                  </p>.
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

public class AudioBookDB4OAgentInfo {

	/** The database name. */
	private String databaseName;
	
	/** The root directory. */
	private String rootDirectory;
	
	/**
	 * Instantiates a new audio book d b4 o agent info.
	 */
	public AudioBookDB4OAgentInfo(){
		
	}

	/**
	 * Gets the database name.
	 *
	 * @return the database name
	 */
	public String getDatabaseName() {
		return databaseName;
	}

	/**
	 * Sets the database name.
	 *
	 * @param databaseName the new database name
	 */
	public void setDatabaseName(String databaseName) {
		this.databaseName = databaseName;
	}

	/**
	 * Gets the root directory.
	 *
	 * @return the root directory
	 */
	public String getRootDirectory() {
		return rootDirectory;
	}

	/**
	 * Sets the root directory.
	 *
	 * @param rootDirectory the new root directory
	 */
	public void setRootDirectory(String rootDirectory) {
		this.rootDirectory = rootDirectory;
	}
	
}
