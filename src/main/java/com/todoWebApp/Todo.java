/**
 * 
 */
package com.todoWebApp;

import java.util.Random;

/**
 * @author suh
 *
 */
public class Todo {
	
	/**
	 * fields
	 */
	 
	private String name;
	private String category;
	private Boolean status;
	
	 
	
	/**
	 *  
	 * @param name
	 * @param category
	 * @param status
	 */
	public Todo(String name, String category) {
		super();
		 
		this.name = name;
		this.category = category;
		this.status = false;
	}
	 
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}
	/**
	 * @return the status
	 */
	public Boolean getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(Boolean status) {
		this.status = status;
	}
}
