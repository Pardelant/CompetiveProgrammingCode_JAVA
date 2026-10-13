import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Reto169 {
    public static void main(String[] args) throws IOException {
        int casos = readInt();
        StringBuilder output = new StringBuilder();

        while (casos-- > 0) {
            Map<String, Integer> participantes = new HashMap<>();
            String linea;
            int totalParticipantes = 0;

            while (true) {
                linea = readLine();

                if (linea.equals("====")) {
                    break;
                }

                // Normalizar el apellido (convertir a minusculas)
                String[] partes = linea.split(", ");
                String apellido = partes[0].trim().toLowerCase();

                // Contar participantes por apellido
                int count = participantes.containsKey(apellido)
                        ? participantes.get(apellido) : 0;

                participantes.put(apellido, count + 1);
                totalParticipantes++;
            }

            int hermanos = 0;

            // Contar los participantes que tienen al menos un hermano
            for (int count : participantes.values()) {
                if (count > 1) {
                    hermanos += count;
                }
            }

            // Formatear la salida
            output.append(totalParticipantes).append(" ")
                  .append(hermanos).append("\n");
        }

        System.out.print(output);
    }

    // Metodo para leer una linea
    private static String readLine() throws IOException {
        StringBuilder sb = new StringBuilder();
        int c;

        while ((c = System.in.read()) != -1 && c != '\n') {
            if (c != '\r') {
                sb.append((char) c);
            }
        }

        return sb.toString();
    }

    // Metodo para leer un entero
    private static int readInt() throws IOException {
        int res = 0;
        int c;

        do {
            c = System.in.read();
        } while (c <= 32 && c != -1);

        while (c > 32) {
            res = res * 10 + c - '0';
            c = System.in.read();
        }

        return res;
    }
}