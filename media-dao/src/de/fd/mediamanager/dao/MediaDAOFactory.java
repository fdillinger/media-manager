/*
 * 
 */
package de.fd.mediamanager.dao;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;

import de.fd.mediamanager.api.dao.IAudioBookDAO;
import de.fd.mediamanager.dao.db4o.MediaDB4ODAOFactory;
import de.fd.mediamanager.dao.hibernate.MediaHibernateDAOFactory;

/**
 * <p> Title: MediaDAOFactory                  </p>
 * <p> Description:                            </p>
 * <p> Copyright: Copyright (c) 2011           </p>
 * <p> Company: Frank DILLINGER AG             </p>.
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

public abstract class MediaDAOFactory {

	/** The Constant logger. */
    private static final Logger logger = Logger.getLogger(MediaDAOFactory.class);
    
    /** The Constant HIBERNATE. */
    public static final Class HIBERNATE = de.fd.mediamanager.dao.hibernate.MediaHibernateDAOFactory.class;

    
    /** The Constant DB4O. */
    public static final Class DB4O = de.fd.mediamanager.dao.db4o.MediaDB4ODAOFactory.class;
    /**
     * Factory method for instantiation of concrete factories.
     * 
     * @param factory the factory
     * @param object the object
     * 
     * @return the alert dao factory
     */
    public static MediaDAOFactory instance(Class factory, Object object){
        try {
            logger.debug("Creating concrete DAO factory: " + factory);
            if (factory.equals(HIBERNATE)){
            	MediaHibernateDAOFactory  daoFactory = (MediaHibernateDAOFactory) factory.newInstance();
                SessionFactory sessionFactory = (SessionFactory) object;
                daoFactory.setSessionFactory(sessionFactory);
                return daoFactory;
            }
            if (factory.equals(DB4O)){
            	MediaDB4ODAOFactory  daoFactory = (MediaDB4ODAOFactory) factory.newInstance();
                return daoFactory;
            }
            
            /*
            else
            {
                return (DAOFactory) factory.newInstance();
            }*/
        } 
        catch (Exception ex) {
            String message = "Couldn't create DAOFactory: " + factory;
            logger.error(message);
            throw new RuntimeException(message);
        }
        return null;
    }
    
    /**
     * Gets the alert status dao.
     * 
     * @return the alert status dao
     */
    public abstract IAudioBookDAO getAudioBookDAO();

}
