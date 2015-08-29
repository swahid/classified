/**
 * 
 */
package com.classified.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Saurav Wahid<saurav@medisys.com.sa>
 * version:1.1.001
 * since:1.1.001
 * 
 */
@Controller
public class showController {

	@RequestMapping(value="/show", method=RequestMethod.GET)
	public String index(ModelMap m){
		
		m.put("user", "saurav");
		
		return "showMessage";
		
	}
}
