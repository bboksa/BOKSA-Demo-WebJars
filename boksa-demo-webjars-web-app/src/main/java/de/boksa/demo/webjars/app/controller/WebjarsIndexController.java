package de.boksa.demo.webjars.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebjarsIndexController {

	@GetMapping("/")
	public String index(Model model) {
		return "index";
	}
}
