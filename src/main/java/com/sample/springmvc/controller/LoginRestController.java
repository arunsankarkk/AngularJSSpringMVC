package com.sample.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.sample.springmvc.model.Login;
import com.sample.springmvc.service.LoginService;

@RestController
public class LoginRestController {
	
	@Autowired
	public LoginService loginService;
	
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseEntity<Login> ResponseEntity(@RequestBody Login login,    UriComponentsBuilder ucBuilder) {
        System.out.println("Login " + login.getUsername());
 
        loginService.login(login);
        HttpHeaders headers = new HttpHeaders();
        
        return new ResponseEntity<Login>(headers, HttpStatus.OK);
    }

}
