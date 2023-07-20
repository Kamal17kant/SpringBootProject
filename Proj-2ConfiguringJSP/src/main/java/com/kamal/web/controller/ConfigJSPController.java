package com.kamal.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ConfigJSPController {
	
	@RequestMapping("/")
	public String Home() {
		
		return "index";
	}
}
