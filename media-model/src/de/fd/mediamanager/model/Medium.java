/**
 * 
 */
package de.fd.mediamanager.model;

import java.io.Serializable;

import de.fd.mediamanager.api.model.IMedium;

/**
 * @author fdillinger
 *
 */
public class Medium implements IMedium{

	private Serializable id;
	
	public Medium(){
		super();
	}
	
	public Serializable getId(){
    	return id;
    }
	public void setId(Serializable id){
		this.id = id;
	}
	
}
