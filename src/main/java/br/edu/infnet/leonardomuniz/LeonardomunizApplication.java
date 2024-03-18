package br.edu.infnet.leonardomuniz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.infnet.leonardomuniz.model.domain.OpenLibraryAPILoader;

@SpringBootApplication
public class LeonardomunizApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeonardomunizApplication.class, args);

		OpenLibraryAPILoader loader = new OpenLibraryAPILoader();
		int page = 1;
		String response = loader.searchBooks("The%20Lord%20of%20the%20Rings", page);

		// Processar a resposta e imprimir os dados dos livros
		while (response != null) {
			processResponse(response);
			page++;
			response = loader.searchBooks("The%20Lord%20of%20the%20Rings", page);
		}
		System.out.println("Busca concluída.");
	}

	private static void processResponse(String response) {
		// Implemente aqui o código para processar a resposta conforme necessário
		System.out.println("Resposta da API da Open Library:");
		System.out.println(response);
	}
}
