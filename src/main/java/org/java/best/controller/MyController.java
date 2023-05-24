package org.java.best.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/")
public class MyController {
	
//	private List<String> movie = new ArrayList<>();
	
	
	@GetMapping("/ciao")
	public String sayHello(Model model,
							@RequestParam(name = "name") String name) {
		
		model.addAttribute("name", name);
		
		return "index";
	}
}
