/**
 * 
 */
package com.classified.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
public class FbController {
	
	private static final String SCOPE = "public_profile";
	private static final String REDIRECT_URI = "http://localhost:8080/classified";
	private static final String CLIENT_ID = "543373769178428";
	private static final String APP_SECRET = "be2ab85085e53aef095d20e89f7b1338";
	private static final String DIALOG_OAUTH = "https://www.facebook.com/dialog/oauth";
	private static final String ACCESS_TOKEN = "https://graph.facebook.com/oauth/access_token";
	
	@RequestMapping(value="/fbsign", method=RequestMethod.GET)
	public String index(ModelMap m){
		
		m.put("dev", "facebook sign up");
		
		return "fbsignup";
		
	}
	
	/*
	 * facebook signup method
	 */
	@RequestMapping(value = "/signin", method = RequestMethod.GET)
	public void signin(HttpServletRequest request, HttpServletResponse response)
               throws Exception {
		try {
			//TODO: if already have a valid access token, no need to redirect, just login
			response.sendRedirect(DIALOG_OAUTH+"?"+
                              "client_id="+CLIENT_ID+
                              "&redirect_uri="+REDIRECT_URI+
                              "&scope="+SCOPE);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
