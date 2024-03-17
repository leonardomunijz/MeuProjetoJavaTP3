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
public class LivroTests {

    private Livro livro;

    private final String TITULO = "O Senhor dos Anéis";
    private final String AUTOR = "J.R.R";
    private final int ANO = 1954;
    private final String GENERO = "Fantasia Épica";

    @BeforeEach
    void setUp() {
        livro = new Livro();
        livro.setTitulo(TITULO);
        livro.setAutor(AUTOR);
        livro.setAnoPublicacao(ANO);
        livro.setGenero(GENERO);
    }

    @Test
    void recuperarDados() {
        assertEquals(TITULO, livro.getTitulo());
        assertEquals(AUTOR, livro.getAutor());
        assertEquals(ANO, livro.getAnoPublicacao());
        assertEquals(GENERO, livro.getGenero());
    }
}
