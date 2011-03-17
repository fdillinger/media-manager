package de.fd.mediamanager.dao.db4o;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import de.fd.mediamanager.dao.MediaDAOFactory;


/**
 * <p> Title: MediaDB4ODAOFactory               </p>
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

public class MediaDB4ODAOFactory extends MediaDAOFactory {

	 /** The log. */
    private static Log log = LogFactory.getLog(MediaDB4ODAOFactory.class);
	
	/* (non-Javadoc)
	 * @see de.fd.mediamanager.dao.MediaDAOFactory#getAudioBookDAO()
	 */
	@Override
	public AudioBookDB4ODAO getAudioBookDAO() {
		AudioBookDB4ODAO dao = null;
		try{
	        dao = AudioBookDB4ODAO.class.newInstance();
	    } 
		catch (Exception e){
		    throw new RuntimeException("Can not instantiate Audio Book DB40 DAO" , e);
		}
		return dao;
	}
}
