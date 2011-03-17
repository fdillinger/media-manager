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
import de.fd.mediamanager.gui.mvc.controller.MediaController;
/**
 * @author fdillinger
 *
 */
@RequestMapping("/audioBookSearchResult.do")
@Controller
public class AudioBookSearchResult
{
    IMediaManagerFacade facade = null;
    
    @Autowired
    public AudioBookSearchResult(IMediaManagerFacade facade)
    {
        this.facade = facade;
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public String setupForm(ModelMap model, HttpServletRequest request) 
    {
//        SearchAudioBook search = (SearchAudioBook) ApplicationContextUtil.getBeanFromApplicationContext(request,"searchAudioBook");
//        if(null != search)
//        {
//            System.out.println("Ist da...");
//        }
        
        
        return ApplicationContextWebFlow.AUDIOBOOK_SEARCH_RESULT_JSP_NAME;
    }

    @RequestMapping(method = RequestMethod.POST)
    public String processSubmit(BindingResult result, SessionStatus status) 
    {
        return null; 
    }
}
