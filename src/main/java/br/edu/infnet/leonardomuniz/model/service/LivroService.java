package br.edu.infnet.leonardomuniz.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.edu.infnet.leonardomuniz.model.domain.Livro;
import org.springframework.stereotype.Component;

@Component
public class LivroService {

    private Map<String, Livro> livros = new HashMap<String, Livro>();

    public void incluir(Livro livro) {
        livros.put(livro.getTitulo(), livro);
    }

    public void excluir(String nome) {
        livros.remove(nome);
    }

    public Collection<Livro> obterLista() {
        return livros.values();
    }

    public Livro obter(String nome) {
        return livros.get(nome);
    }

}
