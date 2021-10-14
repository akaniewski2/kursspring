package com.example.kursspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;


//@ComponentScan({"com.example.kursspring","com.example.component","com.example.config"})
@SpringBootApplication
//@ImportResource( "classpath:config/spring-config.xml")

@PropertySource("classpath:castle.properties")
public class KursspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(KursspringApplication.class, args);
	}

}
