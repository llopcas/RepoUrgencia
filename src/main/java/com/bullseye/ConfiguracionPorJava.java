package com.bullseye;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.bullseye.entidades.ArmaConId;

import com.bullseye.rest.MixIns;
import com.fasterxml.jackson.databind.ObjectMapper;


@Configuration
@ComponentScan("com.bullseye.rest")
@PropertySource({ "classpath:config/rest.properties", "classpath:config/jackson.properties" })
public class ConfiguracionPorJava {
	
	@Bean
	// Tambien se le aplican las propiedades de jackson aunque se use new ObjectMapper()
	// porque es un bean y se configura (esto seria como su constructor)
	public ObjectMapper getObjectMapper() {

		ObjectMapper mapper = new ObjectMapper();
		// Los MixIn se pueden usar y reutilizar sobre codigo que no controlo, incluido sobre las interfaces
		mapper.addMixIn(ArmaConId.class, MixIns.ArmaConId.class);
		return mapper;
	}
	
}