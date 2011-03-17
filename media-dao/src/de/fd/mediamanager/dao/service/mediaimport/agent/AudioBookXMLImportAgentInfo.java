package de.fd.mediamanager.dao.service.mediaimport.agent;

/**
 * <p> Title: AudioBookXMLImportAgentInfo             </p>
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

public class AudioBookXMLImportAgentInfo {
	
	/** The root directory. */
	private String rootDirectory = null;
	
	/** The xml file destionation. */
	private String xmlFileDestionation = null;
	
	/** The xml file name. */
	private String xmlFileName = null;
	
	/**
	 * Instantiates a new audio book xml import agent info.
	 */
	public AudioBookXMLImportAgentInfo(){
		
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

	/**
	 * Gets the xml file destionation.
	 *
	 * @return the xml file destionation
	 */
	public String getXmlFileDestionation() {
		return xmlFileDestionation;
	}

	/**
	 * Sets the xml file destionation.
	 *
	 * @param xmlFileDestionation the new xml file destionation
	 */
	public void setXmlFileDestionation(String xmlFileDestionation) {
		this.xmlFileDestionation = xmlFileDestionation;
	}

	/**
	 * Gets the xml file name.
	 *
	 * @return the xml file name
	 */
	public String getXmlFileName() {
		return xmlFileName;
	}

	/**
	 * Sets the xml file name.
	 *
	 * @param xmlFileName the new xml file name
	 */
	public void setXmlFileName(String xmlFileName) {
		this.xmlFileName = xmlFileName;
	}
	
}
