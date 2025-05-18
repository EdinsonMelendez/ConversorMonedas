

import com.google.gson.Gson;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gson gson = new Gson();

        System.out.println("=== Bienvenido/a al Conversor de Moneda ===");

        while (true) {
            System.out.println("""
                Seleccione una moneda base:
                1. USD
                2. EUR
                3. COP
                4. JPY
                5. BRL
                6. Salir
                Elija una opción:
            """);

            int opcion = scanner.nextInt();
            if (opcion == 6) break;

            String[] monedas = {"USD", "EUR", "COP", "JPY", "BRL"};
            if (opcion < 1 || opcion > 5) {
                System.out.println("Opción no válida");
                continue;
            }

            String monedaBase = monedas[opcion - 1];

            try {
                String json = ApiCliente.obtenerJson(monedaBase);
                ExchangeRates rates = gson.fromJson(json, ExchangeRates.class);

                System.out.println("Ingrese el monto:");
                double monto = scanner.nextDouble();

                System.out.println("Ingrese la moneda de destino (por ejemplo: EUR, COP, JPY):");
                String destino = scanner.next().toUpperCase();

                if (!rates.conversion_rates.containsKey(destino)) {
                    System.out.println("Moneda destino no válida.");
                    continue;
                }

                double tasa = rates.conversion_rates.get(destino);
                double resultado = Conversor.convertir(monto, tasa);
                Conversor.mostrarResultado(monto, destino, resultado);

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        System.out.println("Gracias por usar el conversor.");
    }
}