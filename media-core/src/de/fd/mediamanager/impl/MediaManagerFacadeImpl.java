/**
 * 
 */
package de.fd.mediamanager.impl;

import java.util.ArrayList;
import java.util.Collection;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import de.fd.mediamanager.api.IMediaManagerFacade;
import de.fd.mediamanager.api.IMediaManagerRepository;
import de.fd.mediamanager.api.model.search.audiobook.IAudioBookSearchCriteria;
import de.fd.mediamanager.communication.request.SearchAudioBookRequest;
import de.fd.mediamanager.communication.response.AudiBookListResponse;
import de.fd.mediamanager.model.audiobook.AudioBook;

/**
 * @author fdillinger
 *
 */
public class MediaManagerFacadeImpl implements IMediaManagerFacade {
	private static Logger log = Logger.getLogger(MediaManagerFacadeImpl.class);
    
	@Autowired
	protected IMediaManagerRepository repository;
	

	public MediaManagerFacadeImpl(){
         
    }
     
    public String echo(String echo){
         return echo;
    }
     
    public Collection<AudioBook> findAudioBook(IAudioBookSearchCriteria criteria){	 
       //repository.getAudioBookRepository().g
    	
       Collection<AudioBook> collection = new ArrayList<AudioBook>();
       return collection;
    }
     
    public Collection<AudioBook> findAllAudioBook(){
        return repository.getAudioBookRepository().getAllAudioBooks();
    }
     
	public IMediaManagerRepository getRepository() {
		return repository;
	}

	public void setRepository(IMediaManagerRepository repository) {
		this.repository = repository;
	}
}
