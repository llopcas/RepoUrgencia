package com.bullseye;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.*;

@SpringBootApplication
@Import({ConfiguracionPorJava.class})
@ImportResource({"classpath:config/jpa-config.xml"})
public class BullseyeApplication {

	public static void main(String[] args) {
		SpringApplication.run(BullseyeApplication.class, args);
		
	}
}