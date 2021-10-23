package com.example.kursspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;

//import com.clock|class knight$|HTML
//D:\PROGRAMOWANIE\Intellij_IDEA\strefa_kursow_pliki\materialy_do_kursu\SRC_After_5_9

@ComponentScan({"com.example.kursspring","com.example.kursspring.components","com.example.kursspring.config","com.example.repository","com.example.kursspring.controllers"})
@SpringBootApplication
// jesli uzywamy xmla
//@ImportResource( "classpath:config/spring-config.xml")

@PropertySource("classpath:InMemoryKnightRepository.properties")
@EnableScheduling
public class KursspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(KursspringApplication.class, args);
	}

}
