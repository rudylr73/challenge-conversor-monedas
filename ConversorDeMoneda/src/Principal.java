import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/48f2abaaef966dceca1bbb4d/latest/USD"))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();

        Gson gson = new Gson();
        RespuestaApi respuestaApi = gson.fromJson(json, RespuestaApi.class);
        Convertor convertor = respuestaApi.getConversionRates();
        double dolar = convertor.getDolar();
        double pesoAr = convertor.getPesoArgentino();
        double real = convertor.getReal();
        double pesoCol = convertor.getPesoColombiano();


        //------------------------------------------------------------------------------------------------//
        Scanner teclado = new Scanner(System.in);


        while (true) {
            System.out.println("======================================");
            System.out.println("      BIENVENIDO AL CONVERSOR DE MONEDAS");
            System.out.println("======================================");
            System.out.println("Seleccione una opción del siguiente menú:");
            System.out.println("1 - Dólares (USD) a Pesos Argentinos (ARS)");
            System.out.println("2 - Pesos Argentinos (ARS) a Dólares (USD)");
            System.out.println("3 - Dólares (USD) a Reales (BRL)");
            System.out.println("4 - Reales (BRL) a Dólares (USD)");
            System.out.println("5 - Dólares (USD) a Pesos Colombianos (COP)");
            System.out.println("6 - Pesos Colombianos (COP) a Dólares (USD)");
            System.out.println("9 - Salir del programa");
            System.out.println("======================================");
            System.out.print("Ingrese su opción: ");

            int menuUsuario = teclado.nextInt();

            if (menuUsuario == 9) {
                System.out.println("¡Hasta luego!");
                break;
            }

            System.out.print("Ingrese la cantidad: ");
            double valorUsuario = teclado.nextDouble();

            switch (menuUsuario) {
                case 1: // USD a ARS
                    System.out.printf("%.2f Dólares son: %.2f Pesos Argentinos", valorUsuario, valorUsuario * pesoAr);
                    break;
                case 2: // ARS a USD
                    System.out.printf("%.2f Pesos Argentinos son: %.2f Dólares", valorUsuario, valorUsuario / pesoAr);
                    break;
                case 3: // USD a BRL
                    System.out.printf("%.2f Dólares son: %.2f Reales", valorUsuario, valorUsuario * real);
                    break;
                case 4: // BRL a USD
                    System.out.printf("%.2f Reales son: %.2f Dólares", valorUsuario, valorUsuario / real);
                    break;
                case 5: // USD a COP
                    System.out.printf("%.2f Dólares son: %.2f Pesos Colombianos", valorUsuario, valorUsuario * pesoCol);
                    break;
                case 6: // COP a USD
                    System.out.printf("%.2f Pesos Colombianos son: %.2f Dólares", valorUsuario, valorUsuario / pesoCol);
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida del menú.");
            }
            System.out.println(); // Salto de línea para mejor lectura
        }
    }
}


