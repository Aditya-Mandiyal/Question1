package javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BikeConfig {
	@Bean
	public Bike bike() {
		return new Bike();
	}
	
}
