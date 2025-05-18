

public class Conversor {

    public static double convertir(double monto, double tasaDestino) {
        return monto * tasaDestino;
    }

    public static void mostrarResultado(double monto, String monedaDestino, double resultado) {
        System.out.printf("Resultado: %.2f => %.2f %s\n", monto, resultado, monedaDestino);
    }
}