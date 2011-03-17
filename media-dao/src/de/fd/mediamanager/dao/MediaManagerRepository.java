/**
 * 
 */
package de.fd.mediamanager.dao;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import de.fd.mediamanager.api.IAudioBookRepository;
import de.fd.mediamanager.api.IBookRepository;
import de.fd.mediamanager.api.IMediaManagerRepository;

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

public class MediaManagerRepository implements IMediaManagerRepository {

	 /** The Constant log. */
    private static final Log log = LogFactory.getLog(MediaManagerRepository.class);
    
    /** The audio book repository. */
    @Autowired
    @Qualifier("audioBookdb4oRepository")
    IAudioBookRepository audioBookRepository;
    
    /** The book repository. */
    IBookRepository bookRepository;
    
    /* (non-Javadoc)
     * @see de.fd.mediamanager.api.IMediaManagerRepository#getAudioBookRepository()
     */
    public IAudioBookRepository getAudioBookRepository(){
    	return audioBookRepository;
    }
   
    /* (non-Javadoc)
     * @see de.fd.mediamanager.api.IMediaManagerRepository#getBookRepository()
     */
    public IBookRepository getBookRepository(){
    	return bookRepository;
    }   
}
