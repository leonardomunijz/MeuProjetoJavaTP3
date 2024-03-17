package br.edu.infnet.leonardomuniz;

import br.edu.infnet.leonardomuniz.model.domain.Biblioteca;
import br.edu.infnet.leonardomuniz.model.domain.Livro;
import br.edu.infnet.leonardomuniz.model.service.BibliotecaService;
import br.edu.infnet.leonardomuniz.model.service.LivroService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class BibliotecaLoader implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {

        System.out.println(" [LOADER] Teste: Inicializando com msg");

        BibliotecaService bibliotecaService = new BibliotecaService();

        bibliotecaService.incluir(new Biblioteca("Biblioteca do Congresso dos Estados Unidos"));
        bibliotecaService.incluir(new Biblioteca("Biblioteca Britânica"));
        bibliotecaService.incluir(new Biblioteca("Biblioteca Nacional da França"));

        System.out.println(" [SUCESSO] Lista de bibliotecas adicionadas com sucesso!");
        System.out.println(" - " + bibliotecaService.obterLista());


        LivroService livroService = new LivroService();

        livroService.incluir(new Livro("Dom Quixote"));
        livroService.incluir(new Livro("O Senhor dos Anéis"));
        livroService.incluir(new Livro("Cem Anos de Solidão"));

        System.out.println(" [SUCESSO] Lista de livros adicionados com sucesso!");
        System.out.println(" - " + livroService.obterLista());

    }

}
