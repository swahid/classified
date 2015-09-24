/**
 * 
 */
package com.classified.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.classified.entity.User;
import com.classified.mapper.UserMapper;

/**
 * @author Saurav Wahid<saurav1161@gmail.com>
 * @version 1.0.00
 * @since   1.0.00
 *
 */
@Service("UserService")
public class UserServiceImpl implements UserService{
	
	@Autowired(required=true)
	UserMapper userMapper;
	
	@Transactional
	public void insert(User u) {
		// TODO Auto-generated method stub
		userMapper.insert(u);
	}

	@Transactional
	public List<User> selectAll() {
		// TODO Auto-generated method stub
		return userMapper.selectAll();
	}

}
