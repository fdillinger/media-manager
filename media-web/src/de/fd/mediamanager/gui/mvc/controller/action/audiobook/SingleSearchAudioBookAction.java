/**
 * 
 */
package de.fd.mediamanager.gui.mvc.controller.action.audiobook;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;


@Controller
@RequestMapping("/singleSearchBook.do")
public class SingleSearchAudioBookAction 
{
    public SingleSearchAudioBookAction()
    {
        
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public String setupForm(ModelMap model, HttpServletRequest request) 
    {
        System.out.println("Start singleAudioBook");
        String name      = request.getParameter("name");
        String reader    = request.getParameter("writer");
        String writer    = request.getParameter("reader");
        //String appraisal = request.getParameter("appraisal");
       
//        SearchAudioBook search = (SearchAudioBook) ApplicationContextUtil.getBeanFromApplicationContext(request,"searchAudioBook");
//        if(null != search)
//        {
//            // prepare Object for a new search
//            search.initialiseObject();
//            if(null !=  name)
//            {
//               search.setName(name);
//            }
//            
//            if(null != reader)
//            {
//               search.setReader(reader);
//            }
//            
//            if(null != writer)
//            {
//               search.setWriter(writer);
//            }
//        }
        
        
        return "redirect:audioBookSearchResult.do?";
    }
    
    
    @RequestMapping(method = RequestMethod.POST)
    public String processSubmit(BindingResult result, SessionStatus status) 
    {
        return null; 
    }

}
