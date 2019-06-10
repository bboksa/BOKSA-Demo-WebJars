package de.boksa.demo.webjars.echo.service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import de.boksa.demo.webjars.thebutton.service.model.EchoResult;

@RestController
@RequestMapping("${thebutton.service.echo.controller.requestmapping.path}")
public class EchoController {

	@RequestMapping("echo")
	public EchoResult click(@RequestParam String echo) {	
		String clickMessage = String.format("echo: %s", echo);
		return new EchoResult(clickMessage);
	}
	
}