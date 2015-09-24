/**
 * 
 */
package com.classified.service;

import java.util.List;

import com.classified.entity.User;

/**
 * @author Saurav Wahid<saurav1161@gmail.com>
 * @version 1.0.00
 * @since   1.0.00
 *
 */
public interface UserService {
	
	public List<User> selectAll();
	public void insert(User u);

}
