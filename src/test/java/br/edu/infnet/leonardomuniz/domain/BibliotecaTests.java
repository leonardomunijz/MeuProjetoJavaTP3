package br.edu.infnet.leonardomuniz.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.infnet.leonardomuniz.model.domain.Biblioteca;
import br.edu.infnet.leonardomuniz.model.domain.Livro;

@SpringBootTest
public class BibliotecaTests {

    private Biblioteca biblioteca;

    private Livro livro = new Livro();

    private final String NOME = "Biblioteca Nacional da França";

    @BeforeEach
    void setUp() {
        List<Livro> livros = new ArrayList<>();
        livros.add(livro);

        biblioteca = new Biblioteca();
        biblioteca.setNome(NOME);
        biblioteca.adicionarLivro(livro); // Defina a lista de livros da biblioteca
    }


    @Test
    void recuperarDados() {
        assertEquals(NOME, biblioteca.getNome());
    }

}
