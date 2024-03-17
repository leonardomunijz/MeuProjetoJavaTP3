package br.edu.infnet.leonardomuniz.model.domain;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private String nome;

    // Construtor
    public Biblioteca() {

    }

    private List<Livro> livros = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public Biblioteca(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nome da biblioteca: " + getNome();
    }
}
