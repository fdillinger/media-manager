package de.fd.mediamanager.dao.hibernate;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Query;

import de.fd.mediamanager.api.dao.IAudioBookDAO;
import de.fd.mediamanager.api.model.audiobook.IAudioBook;
import de.fd.mediamanager.api.model.book.IBook;
import de.fd.mediamanager.model.Author;
import de.fd.mediamanager.model.Person;
import de.fd.mediamanager.model.audiobook.AudioBook;


/**
 * <p> Title:  AudioBookHibernateDAO            </p>
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

public class AudioBookHibernateDAO extends HibernateDAO implements IAudioBookDAO {

	/** The log. */
	private static Log log = LogFactory.getLog(AudioBookHibernateDAO.class);
	
	/* (non-Javadoc)
	 * @see de.fd.mediamanager.api.dao.IAudioBookDAO#findAllAudioBooks()
	 */
	public Collection<AudioBook> findAllAudioBooks() {
        log.debug("finding all Audio Books instances");
        try {
            String queryString = "from AudioBook";
            Query queryObject = getCurrentSession().createQuery(queryString);
            List<AudioBook> list = queryObject.list();
            return list;
        } 
        catch (RuntimeException re) {
            log.error("find all failed", re);
            throw re;
        }
    }
    
	/* (non-Javadoc)
	 * @see de.fd.mediamanager.api.dao.IAudioBookDAO#findById(java.io.Serializable)
	 */
	public AudioBook findById(Serializable id){
		return null;
	}
 
    /* (non-Javadoc)
     * @see de.fd.mediamanager.api.dao.IAudioBookDAO#addAudioBook(de.fd.mediamanager.model.audiobook.AudioBook)
     */
    public void addAudioBook(AudioBook audioBook){
    	
    	 try {
    		 Long id = (Long)getCurrentSession().save(audioBook);
    		 System.out.println("ID: " + id);
         } 
         catch (RuntimeException re) {
             log.error("find all failed", re);
             throw re;
         }
	}
    
    
    public Collection<Person> findAllAuthors() {
        log.debug("finding all Person instances");
        try {
            String queryString = "from Person";
            Query queryObject = getCurrentSession().createQuery(queryString);
            List<Person> list = queryObject.list();
            return list;
        } 
        catch (RuntimeException re) {
            log.error("find all failed", re);
            throw re;
        }
    }
    
	
    public Collection<Author> findPerson(){
   	    log.debug("finding all Person instances");
        try {
            String queryString = "from Author";
            Query queryObject = getCurrentSession().createQuery(queryString);
            List<Author> list = queryObject.list();
            return list;
        } 
        catch (RuntimeException re) {
            log.error("find all failed", re);
            throw re;
        }
	}
    
    public Collection<IBook> findBooks(){
   	    log.debug("finding all Book instances");
        try {
            String queryString = "from Book";
            Query queryObject = getCurrentSession().createQuery(queryString);
            List<IBook> list = queryObject.list();
            return list;
        } 
        catch (RuntimeException re) {
            log.error("find all failed", re);
            throw re;
        }
	}
    
    public Collection<IAudioBook> findAudioBooks(){
   	    log.debug("finding all Book instances");
        try {
            String queryString = "from AudioBook";
            Query queryObject = getCurrentSession().createQuery(queryString);
            List<IAudioBook> list = queryObject.list();
            return list;
        } 
        catch (RuntimeException re) {
            log.error("find all failed", re);
            throw re;
        }
	}
}
