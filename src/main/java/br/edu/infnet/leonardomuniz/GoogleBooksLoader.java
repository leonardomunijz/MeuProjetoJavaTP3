package br.edu.infnet.leonardomuniz;

import br.edu.infnet.leonardomuniz.model.domain.GoogleBooksAPI;

public class GoogleBooksLoader {

    private GoogleBooksAPI booksAPI;


    public GoogleBooksLoader() {
        this.booksAPI = new GoogleBooksAPI();
    }

    public void loadBooks(String query) {
        String response = booksAPI.searchBooks(query);
        // Processar a resposta aqui conforme necessário
        System.out.println(response);
    }
}
