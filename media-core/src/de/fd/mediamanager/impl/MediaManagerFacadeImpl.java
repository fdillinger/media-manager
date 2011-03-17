/**
 * 
 */
package de.fd.mediamanager.impl;

import java.util.ArrayList;
import java.util.Collection;

import org.apache.log4j.Logger;

import de.fd.mediamanager.api.IMediaManagerFacade;
import de.fd.mediamanager.api.IRepository;
import de.fd.mediamanager.api.model.search.audiobook.IAudioBookSearchCriteria;
import de.fd.mediamanager.communication.assempler.AudioBookAssembler;
import de.fd.mediamanager.communication.dto.AudioBookListDTO;
import de.fd.mediamanager.communication.request.SearchAudioBookRequest;
import de.fd.mediamanager.communication.response.AudiBookListResponse;
import de.fd.mediamanager.model.audiobook.AudioBook;

/**
 * @author fdillinger
 *
 */
public class MediaManagerFacadeImpl implements IMediaManagerFacade
{
	private static Logger log = Logger.getLogger(MediaManagerFacadeImpl.class);
    
	// injected by SPRING
    private IRepository repository; 
	
	public IRepository getRepository() {
		return repository;
	}

	public void setRepository(IRepository repository) {
		this.repository = repository;
	}

	public MediaManagerFacadeImpl(){
         
    }
     
    public String echo(String echo){
         return echo;
    }
     
     public Collection<AudioBook> findAudioBook(IAudioBookSearchCriteria criteria){
    	 
    	 Collection<AudioBook> collection = new ArrayList<AudioBook>();
    	 return collection;
    	 
     }
     
     /* DTO Solution */
     public AudiBookListResponse findAudioBook(SearchAudioBookRequest criteria){
         
    	 Collection<AudioBook> audioBooks = repository.findAudioBook(criteria);
    	 Collection<AudioBookListDTO> list = AudioBookAssembler.getDTOList(audioBooks);
    	 AudiBookListResponse response = new AudiBookListResponse(list);
    	 return response;
     }
     
     
}
