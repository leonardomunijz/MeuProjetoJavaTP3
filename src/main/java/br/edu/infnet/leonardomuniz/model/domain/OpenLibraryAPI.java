package br.edu.infnet.leonardomuniz.model.domain;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class OpenLibraryAPI {

    public static void main(String[] args) {
        try {
            String query = "The%20Lord%20of%20the%20Rings"; // Sua consulta de pesquisa

            // Construa a URL da solicitação
            URL url = new URL("http://openlibrary.org/search.json?title=" + query);

            // Abra uma conexão HTTP
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            // Configure o método de solicitação
            conn.setRequestMethod("GET");

            // Conecte-se à API e obtenha a resposta
            conn.connect();

            // Verifique o código de resposta
            int responseCode = conn.getResponseCode();
            if (responseCode == 200) {
                // Se a resposta for bem-sucedida, leia os dados de resposta
                Scanner scanner = new Scanner(url.openStream());
                StringBuilder responseBuilder = new StringBuilder();
                while (scanner.hasNext()) {
                    responseBuilder.append(scanner.nextLine());
                }
                scanner.close();

                // Imprima a resposta
                System.out.println("Resposta da API da Open Library:");
                System.out.println(responseBuilder.toString());
            } else {
                // Se a resposta não for bem-sucedida, imprima o código de resposta
                System.out.println("Erro ao fazer a solicitação. Código de resposta: " + responseCode);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
