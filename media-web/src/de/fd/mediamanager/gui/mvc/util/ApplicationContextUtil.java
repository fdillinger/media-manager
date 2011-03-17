/**
 * 
 */
package de.fd.mediamanager.gui.mvc.util;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.LocaleResolver;

/**
 * @author fdillinger
 *
 */
public class ApplicationContextUtil 
{
    public static Locale getCurrentLocale(HttpServletRequest request) {
        LocaleResolver resolver = (LocaleResolver) request.getAttribute(DispatcherServlet.LOCALE_RESOLVER_ATTRIBUTE);
        Locale locale = resolver.resolveLocale(request);
        return locale;
    }

    /**
     * 
     * @param request
     * @param beanName
     * @return
     */
    public static Object getBeanFromApplicationContext(HttpServletRequest request, String beanName) {
        ApplicationContext ac = WebApplicationContextUtils.getRequiredWebApplicationContext(request.getSession().getServletContext());
        return ac.getBean(beanName);
    }
    
   

    public static Locale getLocaleLanguageCode(HttpServletRequest request) {
        return getCurrentLocale(request);
    }

}
