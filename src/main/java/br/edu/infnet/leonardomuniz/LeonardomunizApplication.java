package br.edu.infnet.leonardomuniz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LeonardomunizApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeonardomunizApplication.class, args);

		GoogleBooksLoader loader = new GoogleBooksLoader();
		loader.loadBooks("Harry%20Potter");
	}

}
