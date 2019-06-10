package de.boksa.demo.webjars.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class WebjarsApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebjarsApplication.class, args);
	}
}
