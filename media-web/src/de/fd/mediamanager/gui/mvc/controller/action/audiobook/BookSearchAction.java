package de.fd.mediamanager.gui.mvc.controller.action.audiobook;

import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import de.fd.mediamanager.api.IMediaManagerFacade;
import de.fd.mediamanager.communication.request.SearchAudioBookRequest;
import de.fd.mediamanager.communication.response.AudiBookListResponse;
import de.fd.mediamanager.gui.mvc.util.ApplicationContextWebFlow;
import de.fd.mediamanager.gui.mvc.util.ListItem;


@Controller
@RequestMapping("/bookSearchAction.do")
public class BookSearchAction{

	 private final IMediaManagerFacade facade;
	 
	 @Autowired
	 public BookSearchAction(IMediaManagerFacade facade){
	      this.facade = facade;
	 }
	 
	 @RequestMapping(method = RequestMethod.GET)
     public String setupForm(ModelMap model, HttpServletRequest request){     
		 String genreCode = request.getParameter("genreCode");
    	 //create new search request
    	 SearchAudioBookRequest searchRequest = new SearchAudioBookRequest();
    	 searchRequest.setGenre(genreCode);
    	 
    	 AudiBookListResponse response = facade.findAudioBook(searchRequest);
    	 // error check
    	 if(response.isHickup()){
    		 System.out.println("Hickup");
    	 }
    	 model.addAttribute("audioBooks",response.getAudioBookList());
		 return ApplicationContextWebFlow.AUDIOBOOK_SEARCH_AUDIO_BOOK_RESULT_TABEL;
     }
	 
	 
	 
}
