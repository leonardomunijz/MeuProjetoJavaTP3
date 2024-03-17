package br.edu.infnet.leonardomuniz.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.infnet.leonardomuniz.model.domain.Livro;
import br.edu.infnet.leonardomuniz.model.service.LivroService;

@SpringBootTest
public class LivroServiceTests {

    @Autowired
    private LivroService livroService;

    private Livro livro;

    private final String TITULO = "Cem Anos de Solidão";
    private final String AUTOR = "Machado de Assis";
    private final int ANO = 2024;
    private final String GENERO = "Fantasia";

    @BeforeEach
    void setUp() {
        livro = new Livro();
        livro.setTitulo(TITULO);
        livro.setAutor(AUTOR);
        livro.setAnoPublicacao(ANO);
        livro.setGenero(GENERO);
    }

    @Test
    void inclusao() {
        livroService.incluir(livro);
        assertEquals(livro, livroService.obter(TITULO));
    }

    @Test
    void exclusao() {
        inclusao();
        livroService.excluir(TITULO);
        assertEquals(null, livroService.obter(TITULO));
    }

    @Test
    void recuperacaoTotal() {
        inclusao();
        assertTrue(livroService.obterLista().contains(livro));
    }
}
