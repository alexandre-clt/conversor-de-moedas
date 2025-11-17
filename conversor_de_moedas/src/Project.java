import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String apiKey = "7c893e5f28efb48fcbd047d5";
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
        String[] moedas = new String[]{"ARS", "BOB", "BRL", "CLP", "COP", "USD"};
        String moedaOrigem = moedas[opcaoOrigem - 1];
        String moedaDestino = moedas[opcaoDestino - 1];
    }
}