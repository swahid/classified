/**
 * 
 */
package com.classified.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Saurav Wahid<saurav@medisys.com.sa>
 * version:1.1.001
 * since:1.1.001
 * 
 */
@Controller
public class indexController {
	
	@RequestMapping(value="/")
	public String index(ModelMap m){
		
		m.put("user", "saurav");
		
		return "index";
		
	}

}
