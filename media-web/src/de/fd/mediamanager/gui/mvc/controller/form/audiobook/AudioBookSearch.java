/**
 * 
 */
package de.fd.mediamanager.gui.mvc.controller.form.audiobook;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import de.fd.mediamanager.api.IMediaManagerFacade;
import de.fd.mediamanager.gui.mvc.controller.MediaController;
import de.fd.mediamanager.gui.mvc.search.audioBook.AudioBookSearchCriteria;
import de.fd.mediamanager.gui.mvc.util.ApplicationContextUtil;
import de.fd.mediamanager.gui.mvc.util.ApplicationContextWebFlow;
import de.fd.mediamanager.model.audiobook.AudioBook;
/**
 * @author fdillinger
 *
 */
@Controller
@RequestMapping("/audioBookSearch.do")
@SessionAttributes("audioBookSearchCriteria")
public class AudioBookSearch extends MediaController
{
	 //private final IMediaManagerFacade facade;
	 
	 @Autowired
	 public AudioBookSearch (IMediaManagerFacade facade){
	       this.facade = facade;
	 }

     @RequestMapping(method = RequestMethod.GET)
     public String setupForm(ModelMap model, 
    		                 HttpServletRequest request){
    	 AudioBookSearchCriteria searchCriteria = (AudioBookSearchCriteria) ApplicationContextUtil.getBeanFromApplicationContext(request,"searchAudioBook");
         Collection<AudioBook> books = facade.findAudioBook(searchCriteria);
         
    	 model.addAttribute("audioBookSearchCriteria",searchCriteria);
    	 model.addAttribute("audioBooks",books);
    	 return ApplicationContextWebFlow.AUDIOBOOK_SEARCH_JSP_NAME;
     }

     @RequestMapping(method = RequestMethod.POST)
     public String processSubmit(@ModelAttribute("audioBookSearchCriteria") AudioBookSearchCriteria searchCriteria,BindingResult result, SessionStatus status) {
    	 return "redirect:audioBookSearch.do";
     }

}