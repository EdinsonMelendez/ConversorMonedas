

import java.net.http.*;
import java.net.URI;
import java.io.IOException;

public class ApiCliente {
    public static String obtenerJson(String monedaBase) throws IOException, InterruptedException {
        HttpClient cliente = HttpClient.newHttpClient();
        HttpRequest solicitud = HttpRequest.newBuilder()
                .uri(URI.create(Config.BASE_URL + monedaBase))
                .GET()
                .build();

        HttpResponse<String> respuesta = cliente.send(solicitud, HttpResponse.BodyHandlers.ofString());
        return respuesta.body();
    }
}