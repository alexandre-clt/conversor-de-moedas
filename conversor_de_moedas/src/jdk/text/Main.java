package jdk.text;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;
import java.util.Scanner;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String apiKey = "4688f0854b8e71ecffe9d0fa"; // SUA API KEY AQUI

        System.out.println("===== CONVERSOR DE MOEDAS =====");
        System.out.println("Moedas disponíveis:");
        System.out.println("1 - ARS (Peso Argentino)");
        System.out.println("2 - BOB (Boliviano)");
        System.out.println("3 - BRL (Real Brasileiro)");
        System.out.println("4 - CLP (Peso Chileno)");
        System.out.println("5 - COP (Peso Colombiano)");
        System.out.println("6 - USD (Dólar Americano)");
        System.out.println("===============================");

        System.out.print("Escolha a moeda **origem** (1 a 6): ");
        int opcaoOrigem = sc.nextInt();

        System.out.print("Escolha a moeda **destino** (1 a 6): ");
        int opcaoDestino = sc.nextInt();

        System.out.print("Digite o valor para converter: ");
        double valor = sc.nextDouble();

        // Lista das moedas
        String[] moedas = {"ARS","BOB","BRL","CLP","COP","USD"};

        String moedaOrigem = moedas[opcaoOrigem - 1];
        String moedaDestino = moedas[opcaoDestino - 1];

        try {
            // Requisição para API
            String url = "https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/" + moedaOrigem;

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Conversão JSON → Objeto Gson
            JsonElement elemento = JsonParser.parseString(response.body());
            JsonObject json = elemento.getAsJsonObject();

            // Objeto de taxas
            JsonObject rates = json.getAsJsonObject("conversion_rates");

            // Obtém taxa da moeda destino
            double taxa = rates.get(moedaDestino).getAsDouble();

            // Faz o cálculo
            double convertido = valor * taxa;

            System.out.println("\n===== RESULTADO =====");
            System.out.println("De: " + moedaOrigem);
            System.out.println("Para: " + moedaDestino);
            System.out.println("Valor inserido: " + valor);
            System.out.println("Taxa da API: " + taxa);
            System.out.println("Valor convertido: " + convertido);
            System.out.println("======================");

        } catch (Exception e) {
            System.out.println("Erro ao consultar API: " + e.getMessage());
        }

        sc.close();
    }
}
