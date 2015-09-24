/**
 * 
 */
package com.classified.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Saurav Wahid<saurav1161@gmail.com>
 * @version 1.0.00
 * @since   1.0.00
 *
 */
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8319983178775769778L;
	
	private Integer id;
	private String username;
	private String password;
	private Date date;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	
}
