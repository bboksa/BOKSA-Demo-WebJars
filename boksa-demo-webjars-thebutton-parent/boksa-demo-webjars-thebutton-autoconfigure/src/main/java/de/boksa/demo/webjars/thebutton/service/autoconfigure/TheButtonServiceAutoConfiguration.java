package de.boksa.demo.webjars.thebutton.service.autoconfigure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import de.boksa.demo.webjars.thebutton.service.controller.ClickController;

@Configuration
public class TheButtonServiceAutoConfiguration {

	@Bean
	public ClickController clickController() {
		return new ClickController();
	}

}