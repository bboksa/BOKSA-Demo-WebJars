package de.boksa.demo.webjars.thebutton.service.autoconfigure;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import de.boksa.demo.webjars.echo.service.controller.EchoController;

@Configuration
@ConditionalOnClass(EchoController.class)
public class EchoServiceAutoConfiguration {

	@Bean
	public EchoController echoController() {
		return new EchoController();
	}

}