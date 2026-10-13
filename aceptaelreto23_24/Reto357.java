import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaCajas {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String linea;
        StringBuilder output = new StringBuilder();

        while ((linea = in.readLine()) != null) {
            int n = Integer.parseInt(linea.trim());
            int viajes = 0;
            long bolas = 1;

            // Calcular el numero minimo de viajes
            while (bolas < (long) n + 1) {
                bolas *= 2;
                viajes++;
            }

            // Guardar el resultado
            output.append(viajes).append("\n");
        }

        System.out.print(output);
    }
}