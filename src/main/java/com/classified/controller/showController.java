/**
 * 
 */
package com.classified.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.classified.entity.User;
import com.classified.service.UserService;

/**
 * @author Saurav Wahid<saurav@medisys.com.sa>
 * version:1.1.001
 * since:1.1.001
 * 
 */
@Controller
public class showController {
	
	@Autowired(required=true)
	UserService userservice;

	@RequestMapping(value="/show", method=RequestMethod.GET)
	public String index(ModelMap m){
		
		List <User> userList= userservice.selectAll();
		
		User user=userList.get(0);
		m.put("user", user.getUsername());
		
		return "showMessage";
		
	}
}
