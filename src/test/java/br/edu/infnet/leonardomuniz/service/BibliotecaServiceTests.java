package br.edu.infnet.leonardomuniz.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.infnet.leonardomuniz.model.domain.Biblioteca;
import br.edu.infnet.leonardomuniz.model.service.BibliotecaService;

@SpringBootTest
public class BibliotecaServiceTests {

    @Autowired
    private BibliotecaService bibliotecaService;

    private Biblioteca biblioteca;

    private final String NOME = "Infnet";

    @BeforeEach
    void SetUp() {
        biblioteca = new Biblioteca(NOME);
    }

    @Test
    void inclusao() {

        bibliotecaService.incluir(biblioteca);

        assertEquals(biblioteca, bibliotecaService.obter(NOME));
    }

    @Test
    void exclusao() {
        inclusao();

        bibliotecaService.excluir(NOME);

        assertEquals(null, bibliotecaService.obter(NOME));
    }

    @Test
    void recuperacaoTotal() {
        inclusao();

        assertTrue(bibliotecaService.obterLista().contains(biblioteca));
    }
}
