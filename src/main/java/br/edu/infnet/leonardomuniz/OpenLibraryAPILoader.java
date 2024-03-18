package br.edu.infnet.leonardomuniz.model.domain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class OpenLibraryAPILoader {

    public String searchBooks(String query, int page) {
        try {
            // Construa a URL da solicitação incluindo o número da página
            URL url = new URL("http://openlibrary.org/search.json?title=" + query + "&page=" + page);

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
                BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                StringBuilder responseBuilder = new StringBuilder();
                String inputLine;
                while ((inputLine = in.readLine()) != null) {
                    responseBuilder.append(inputLine);
                }
                in.close();

                // Retorne a resposta como uma string
                return responseBuilder.toString();
            } else {
                // Se a resposta não for bem-sucedida, imprima o código de resposta
                System.out.println("Erro ao fazer a solicitação. Código de resposta: " + responseCode);
                return null;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
