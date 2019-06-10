package de.boksa.demo.webjars.thebutton.service.controller;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.boksa.demo.webjars.thebutton.service.model.ClickResult;

@RestController
@RequestMapping("${thebutton.service.click.controller.requestmapping.path}")
public class ClickController {

	private AtomicInteger count = new AtomicInteger(0);
	
	@RequestMapping("count")
	public ClickResult click() {	
		String clickMessage = String.format("click.count: %s", count.incrementAndGet());
		return new ClickResult(clickMessage);
	}
	
}