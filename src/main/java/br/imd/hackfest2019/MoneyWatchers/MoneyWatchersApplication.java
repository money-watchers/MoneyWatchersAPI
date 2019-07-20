package br.imd.hackfest2019.MoneyWatchers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class MoneyWatchersApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoneyWatchersApplication.class, args);
	}

	/*
	 * public WebMvcConfigurer corsConfigurer() { return new WebMvcConfigurer() {
	 * 
	 * @Override public void addCorsMappings(CorsRegistry registry) { // TODO
	 * Auto-generated method stub
	 * registry.addMapping("/api/v1").allowedOrigins("http://localhost:8080"); } };
	 * }
	 */
}
