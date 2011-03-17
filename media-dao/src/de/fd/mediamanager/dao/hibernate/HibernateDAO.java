package de.fd.mediamanager.dao.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * <p> Title:  Hibernate DAO                    </p>
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

public class HibernateDAO {

	 /** The session factory. */
    private SessionFactory sessionFactory ; 
   
    
    /**
     * Sets the session factory.
     * 
     * @param sessionFactory the new session factory
     */
    public void setSessionFactory(SessionFactory sessionFactory) 
    {
        this.sessionFactory = sessionFactory;
    }
    
    /**
     * Gets the session factory.
     * 
     * @return the session factory
     */
    public SessionFactory getSessionFactory() 
    { 
        return sessionFactory;   
    }
 
    /**
     * Gets the current session.
     * 
     * @return the current session
     */
    public  Session getCurrentSession()
    {
        return sessionFactory.getCurrentSession();
    }
	
	
}
