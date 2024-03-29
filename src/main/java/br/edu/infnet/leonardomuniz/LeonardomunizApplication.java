package br.edu.infnet.leonardomuniz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class LeonardomunizApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeonardomunizApplication.class, args);
	}

}
