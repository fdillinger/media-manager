package de.fd.mediamanager.dao.hibernate;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;

import de.fd.mediamanager.dao.MediaDAOFactory;


/**
 * <p> Title: MediaHibernateDAOFactory          </p>
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
public class MediaHibernateDAOFactory extends MediaDAOFactory {

    /** The log. */
    private static Log log = LogFactory.getLog(MediaHibernateDAOFactory.class);
    
    /** The session factory. */
    private SessionFactory sessionFactory ;
    
    /**
     * Sets the session factory.
     * 
     * @param sessionFactory the new session factory
     */
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    /**
     * Gets the session factory.
     * 
     * @return the session factory
     */
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

	@Override
	public AudioBookHibernateDAO getAudioBookDAO() {
	   AudioBookHibernateDAO dao = null;
	   try{
         dao = AudioBookHibernateDAO.class.newInstance();
         dao.setSessionFactory(sessionFactory);
	   } 
	   catch (Exception e){
	       throw new RuntimeException("Can not instantiate Audio Book DAO" , e);
	   }
	   return dao;
	}
	
	
}
