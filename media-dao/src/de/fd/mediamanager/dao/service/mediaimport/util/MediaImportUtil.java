package de.fd.mediamanager.dao.service.mediaimport.util;
import java.io.File;

import org.apache.commons.io.FileUtils;


/**
 * <p> Title: MediaImportUtil                         </p>
 * <p> Description:                                   </p>
 * <p> Copyright: Copyright (c) 2011                  </p>
 * <p> Company: Frank DILLINGER AG                    </p>.
 *
 * @author fdillinger
 * @date 17 Mar 2011 14:39:49
 * @projectname
 * @version $Id: $
 * 
 * <pre>
 * Changes
 * ===========================================================================
 * Date:   Name:        JIRA /Issue Id:       Description:
 * 
 * </pre>
 */

public class MediaImportUtil {

	public static String EMPTY_STRING = "";
	
	public static String extractName(String path){
	   int index = path.lastIndexOf("\\");
	   String name = path.substring(index,path.length());
	   System.out.println(name);
	   return name;
	}
	
	
	public static String getLastName(String name){
		 String[] nameArray = name.split(",");
		 if(nameArray.length == 2){
		     return nameArray[0].trim();	 
		 }
		 return EMPTY_STRING;
	}
	
	public static String getFirstName(String name){
		 String[] nameArray = name.split(",");
		 if(nameArray.length == 2){
		     return nameArray[1].trim();	 
		 }
		 return EMPTY_STRING;
	}

	/**
	 * Creates the xml file.
	 *
	 * @param xmlFileName the xml file name
	 * @param xmlFileDestination the xml file destination
	 * @param fileData the file data
	 * @return true, if successful
	 */
	public static boolean createXMLFile(String xmlFileName,
			                            String xmlFileDestination,
			                            String fileData){
	    String fileName = xmlFileDestination + xmlFileName;
	    File file = new File(fileName);
	    try{
	      FileUtils.writeStringToFile(file, fileData);
	    }
	    catch(Exception e){
	    	e.printStackTrace();
	    	return false;
	    }
	    return true;
	}

}
