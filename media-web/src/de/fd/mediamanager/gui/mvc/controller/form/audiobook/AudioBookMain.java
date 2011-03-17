/**
 * 
 */
package de.fd.mediamanager.gui.mvc.controller.form.audiobook;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import de.fd.mediamanager.api.IMediaManagerFacade;
import de.fd.mediamanager.gui.mvc.util.ApplicationContextWebFlow;

/**
 * @author fdillinger
 *
 */
@Controller
@RequestMapping("/audioBookMainForm.do")
public class AudioBookMain{

	 private final IMediaManagerFacade facade;
	 
	 @Autowired
	 public AudioBookMain(IMediaManagerFacade facade){
	       this.facade = facade;
	 }
	
	 @RequestMapping(method = RequestMethod.GET)
     public String setupForm(ModelMap model, HttpServletRequest request){
         getFacade().echo("Hallo");
		 return ApplicationContextWebFlow.AUDIOBOOK_MAIN_JSP_NAME;
     }

     @RequestMapping(method = RequestMethod.POST)
     public String processSubmit(BindingResult result, SessionStatus status){
         return null; 
     }

	 protected IMediaManagerFacade getFacade() {
		return facade;
	 }


}
