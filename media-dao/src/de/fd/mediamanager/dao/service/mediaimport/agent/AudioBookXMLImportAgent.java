package de.fd.mediamanager.dao.service.mediaimport.agent;

import java.io.File;
import java.util.Date;

import de.fd.mediamanager.dao.service.mediaimport.util.MediaImportUtil;


/**
 * <p> Title: AudioBookXMLImportAgen                  </p>
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

public class AudioBookXMLImportAgent {

	/** The audio book buffer. */
	StringBuffer audioBookBuffer = null;
	
	/** The header. */
	StringBuffer header = null;
	
	/** The footer. */
	StringBuffer footer = null;
	
	/** The book counter. */
	private int bookCounter = 0;
	
	/** The author counter. */
	private int authorCounter = 0;
	
	/**
	 * Instantiates a new audio book xml import agent.
	 */
	public AudioBookXMLImportAgent(){
		
	}
	
	/**
	 * Import from file directory in xml file.
	 *
	 * @param agentInfo the agent info
	 * @return true, if successful
	 */
	public boolean importFromFileDirectoryInXMLFile(AudioBookXMLImportAgentInfo agentInfo){
		File root = new File (agentInfo.getRootDirectory());
		if(root.isDirectory()){	
			File[] authors = root.listFiles();
			if(authors == null || authors.length == 0){
				return false;
			}
			audioBookBuffer = new StringBuffer();
			audioBookBuffer.append("<?xml version='1.0'?> encoding='ISO-8859-1'" + "\n");
			audioBookBuffer.append("<catalog>" + "\n");
			for (int i = 0; i < authors.length; i++) {
				if (authors[i].isDirectory()) {
					readBooksFromAuthor(authors[i]);
				}
				else {
					System.out.print(" (Datei)\n");
				}
			}
			audioBookBuffer.append("</catalog>");
			return MediaImportUtil.createXMLFile(agentInfo.getXmlFileName(), agentInfo.getXmlFileDestionation(), audioBookBuffer.toString());
			
		}
		return false;
	}
	
	
	
	/**
	 * Import from file directory in xml file as author.
	 *
	 * @param agentInfo the agent info
	 * @return true, if successful
	 */
	public boolean importFromFileDirectoryInXMLFileAsAuthor(AudioBookXMLImportAgentInfo agentInfo){
		bookCounter = 0;
		authorCounter=0;
		header = new StringBuffer();
		audioBookBuffer = new StringBuffer();
		footer = new StringBuffer();
		File root = new File (agentInfo.getRootDirectory());
		if(root.isDirectory()){	
			File[] authors = root.listFiles();
			if(authors == null || authors.length == 0){
				return false;
			}
			for (int i = 0; i < authors.length; i++) {
				if (authors[i].isDirectory()) {
					authorCounter++;
					addAuthorAsXMLFormat(authors[i]);
				}
				else {
					System.out.print(" (Datei)\n");
				}
			}
			header.append("<?xml version='1.0'?>" + "\n");
			header.append(" <AgentInfo>"  + "\n");
			header.append("   <info>" + "Audio Book collection" + "</info>" + "\n");
			header.append("   <authorCount>" + authorCounter + "</authorCount>" + "\n");
			header.append("   <bookCount>" + bookCounter + "</bookCount>" + "\n");
			header.append("   <importDate>" + new Date().toString() + "</importDate>" + "\n");
			header.append("   <importFolder>" + agentInfo.getRootDirectory() + "</importFolder>" + "\n");
			header.append(" </AgentInfo>"  + "\n");
			header.append(" <catalog>" + "\n");
			footer.append(" </catalog>");
			
			String data = header.toString() + audioBookBuffer.toString() + footer.toString();
			return MediaImportUtil.createXMLFile(agentInfo.getXmlFileName(), agentInfo.getXmlFileDestionation(), data);
			
		}
		return false;
	}
	 
	
	/**
	 * Adds the author as xml format.
	 *
	 * @param author the author
	 */
	private void addAuthorAsXMLFormat(File author){
	   File[] books = author.listFiles();
	   audioBookBuffer.append("   <author>" + "\n");
	   audioBookBuffer.append("      <lastname>"  + MediaImportUtil.getLastName(author.getName()) + "</lastname>"  + "\n");
	   audioBookBuffer.append("      <firstname>" + MediaImportUtil.getFirstName(author.getName()) + "</firstname>"  + "\n");
	   if(books != null && books.length > 0){
	      audioBookBuffer.append("      <books>" + "\n");
	      for (int i = 0; i < books.length; i++) {
	    	     bookCounter ++;
	    	     if (books[i].isDirectory()) {
					audioBookBuffer.append("         <book><title>" + books[i].getName() + "</title></book>" + "\n");
				}
		  } 
	      audioBookBuffer.append("      </books>" + "\n");
	   }
	   audioBookBuffer.append("   </author>" + "\n");
	}

	
	/**
	 * Read books from author.
	 *
	 * @param author the author
	 */
	private void readBooksFromAuthor(File author){
	   File[] books = author.listFiles();
	   if(books != null && books.length > 0){
		   for (int i = 0; i < books.length; i++) {
				if (books[i].isDirectory()) {
					addBookAsXMLStructur(author, books[i]);
				}
				else {
					System.out.print(" (Datei)\n");
				}
			}
	   }
	}

	/**
	 * Adds the book as xml structur.
	 *
	 * @param author the author
	 * @param book the book
	 */
	private void addBookAsXMLStructur(File author, File book){
        if(author == null || book == null){
        	return;
        }
		audioBookBuffer.append("   <audiobook>" + "\n");
		audioBookBuffer.append("      <title>" + book.getName() + "</title>" + "\n");
		audioBookBuffer.append("      <isbn></isbn>" + "\n");
		audioBookBuffer.append("      <description></description>" + "\n");
		audioBookBuffer.append("      <authors>" + "\n");
		audioBookBuffer.append("         <author>" + "\n");
		audioBookBuffer.append("            <firstname>" + MediaImportUtil.getFirstName(author.getName()) + "</firstname>"  + "\n");
		audioBookBuffer.append("            <lastname>"  + MediaImportUtil.getLastName(author.getName()) + "</lastname>"  + "\n");
		audioBookBuffer.append("            <description></description>"  + "\n");
		audioBookBuffer.append("         </author>" + "\n");
		audioBookBuffer.append("      </authors>" + "\n");
		audioBookBuffer.append("      <lectors>" + "\n");
		audioBookBuffer.append("      </lectors>" + "\n");
		audioBookBuffer.append("   </audiobook>" + "\n");		
	}	
}
