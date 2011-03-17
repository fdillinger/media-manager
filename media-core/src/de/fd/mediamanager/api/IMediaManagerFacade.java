/**
 * 
 */
package de.fd.mediamanager.api;

import java.util.Collection;

import de.fd.mediamanager.api.model.search.audiobook.IAudioBookSearchCriteria;
import de.fd.mediamanager.communication.request.SearchAudioBookRequest;
import de.fd.mediamanager.communication.response.AudiBookListResponse;
import de.fd.mediamanager.model.audiobook.AudioBook;




/**
 * @author fdillinger
 *
 */
public interface IMediaManagerFacade 
{
    public String echo(String echo);
    
    public Collection<AudioBook> findAudioBook(IAudioBookSearchCriteria criteria);
    
    public AudiBookListResponse findAudioBook(SearchAudioBookRequest criteria);
}
