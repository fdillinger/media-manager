/**
 * 
 */
package de.fd.mediamanager.gui.mvc.controller.action;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

/**
 * @author fdillinger
 *
 */
@Controller
@RequestMapping("/loginAction.do")
public class LoginAction{

    @RequestMapping(method = RequestMethod.GET)
    public String setupForm(ModelMap model, HttpServletRequest request){
        return "redirect:mediaManagerMainForm.do?";
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public String processSubmit(BindingResult result, SessionStatus status){
        return null; 
    }
}
