package com.sample.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/team")
public class TeamController {
	
    @RequestMapping(method = RequestMethod.GET)
    public String getIndexPage() {
        return "team";
    }
		
}
