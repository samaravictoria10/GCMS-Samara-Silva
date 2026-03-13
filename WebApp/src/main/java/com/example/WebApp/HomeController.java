package com.example.WebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HomeController {

	@RequestMapping("/")
	public @ResponseBody String greeting() {
	return "Hello, IFPE!";
	}
	
	@RequestMapping("/samara")
	public @ResponseBody String greetingSamara() {
	return "Hello, Samara!";
	}
	
	// alteração feita na original
	@RequestMapping("/mudanca")
	public @ResponseBody String greetingMudanca() {
	return "Hello, Mudança!";
	
	}
}
