package org.java.best.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class MyController {
	
	@GetMapping("/ciao/{nome}")
	public String sayHello(Model model,
							@PathVariable("nome") String nome) {
		
		model.addAttribute(nome);
		
		return "index";
	}
}
