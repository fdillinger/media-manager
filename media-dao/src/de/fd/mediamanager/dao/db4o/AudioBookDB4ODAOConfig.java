package de.fd.mediamanager.dao.db4o;

/**
 * <p> Title: AudioBookDB4ODAOConfig            </p>
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

public class AudioBookDB4ODAOConfig {
	
	private String databaseName; 
	
	public AudioBookDB4ODAOConfig(){
	   super();	
	}

	/**
	 * @return the databaseName
	 */
	public String getDatabaseName() {
		return databaseName;
	}

	/**
	 * @param databaseName the databaseName to set
	 */
	public void setDatabaseName(String databaseName) {
		this.databaseName = databaseName;
	}
}
