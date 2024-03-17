package br.edu.infnet.leonardomuniz.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.edu.infnet.leonardomuniz.model.domain.Biblioteca;
import org.springframework.stereotype.Component;

@Component
public class BibliotecaService {

    private Map<String, Biblioteca> bibliotecas = new HashMap<String, Biblioteca>();

    public void incluir(Biblioteca biblioteca) {
        bibliotecas.put(biblioteca.getNome(), biblioteca);
    }

    public void excluir(String nome) {
        bibliotecas.remove(nome);
    }

    public Collection<Biblioteca> obterLista() {
        return bibliotecas.values();
    }

    public Biblioteca obter(String nome) {
        return bibliotecas.get(nome);
    }

}
