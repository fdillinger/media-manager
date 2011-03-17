/**
 * 
 */
package de.fd.mediamanager.gui.mvc.controller.form;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import de.fd.mediamanager.gui.mvc.util.ApplicationContextWebFlow;

/**
 * @author fdillinger
 *
 */
@Controller
@RequestMapping("/mediaManagerMainForm.do")
public class MediaManagerMainForm 
{

     @RequestMapping(method = RequestMethod.GET)
     public String setupForm(ModelMap model, HttpServletRequest request) 
     {
         return ApplicationContextWebFlow.MAIN_JSP_NAME;
     }

     @RequestMapping(method = RequestMethod.POST)
     public String processSubmit(BindingResult result, SessionStatus status) 
     {
         return null; 
     }

}