package br.edu.infnet.leonardomuniz.model.domain;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class GoogleBooksAPI {

    public String searchBooks(String query) {
        try {
            URL url = new URL("https://www.googleapis.com/books/v1/volumes?q=" + query);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            int responseCode = conn.getResponseCode();
            if (responseCode != 200) {
                throw new RuntimeException("HTTP Response Code: " + responseCode);
            }

            Scanner scanner = new Scanner(url.openStream());
            StringBuilder responseBuilder = new StringBuilder();
            while (scanner.hasNext()) {
                responseBuilder.append(scanner.nextLine());
            }
            scanner.close();
            return responseBuilder.toString();

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
