package de.fd.mediamanager.api;

/**
 * <p> Title: Interface media manager repository  </p>
 * <p> Description:                               </p>
 * <p> Copyright: Copyright (c) 2011              </p>
 * <p> Company: Frank DILLINGER AG                </p>.
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

public interface IMediaManagerRepository {

	/**
	 * Gets the audio book repository.
	 *
	 * @return the audio book repository
	 */
	IAudioBookRepository getAudioBookRepository();
	
	/**
	 * Gets the book repository.
	 *
	 * @return the book repository
	 */
	IBookRepository getBookRepository();
	
}
