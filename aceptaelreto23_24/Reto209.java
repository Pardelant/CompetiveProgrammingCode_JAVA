import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Reto209 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String linea;
        StringBuilder output = new StringBuilder();

        while ((linea = in.readLine()) != null) {
            char[] tunel = linea.toCharArray();
            int casos = Integer.parseInt(in.readLine().trim());

            List<Integer> telefonos = new ArrayList<>();

            // Guardar las posiciones de los telefonos
            for (int i = 0; i < tunel.length; i++) {
                if (tunel[i] == 'T') {
                    telefonos.add(i);
                }
            }

            while (casos-- > 0) {
                int actual = Integer.parseInt(in.readLine().trim());
                int posicion = actual - 1;

                // Comprobar si hay un telefono en la posicion actual
                if (tunel[posicion] == 'T') {
                    output.append("AQUI\n");
                    continue;
                }

                // Calcular las distancias a las salidas
                int distPeninsula = posicion;
                int distIslas = tunel.length - 1 - posicion;

                // Elegir la salida mas cercana
                String salida;
                if (distPeninsula <= distIslas) {
                    salida = "PENINSULA";
                } else {
                    salida = "ISLAS";
                }

                // Buscar los telefonos mas cercanos
                int izquierda = -1;
                int derecha = -1;

                for (int telefono : telefonos) {
                    if (telefono < posicion) {
                        izquierda = telefono;
                    } else if (telefono > posicion) {
                        derecha = telefono;
                        break;
                    }
                }

                int distIzquierda = Integer.MAX_VALUE;
                int distDerecha = Integer.MAX_VALUE;

                if (izquierda != -1) {
                    distIzquierda = posicion - izquierda;
                }

                if (derecha != -1) {
                    distDerecha = derecha - posicion;
                }

                int distTelefono = Math.min(distIzquierda, distDerecha);
                int distSalida = Math.min(distPeninsula, distIslas);

                // Si la salida esta mas cerca que cualquier telefono
                if (distSalida < distTelefono) {
                    output.append(salida).append("\n");
                } else if (distIzquierda < distDerecha) {
                    output.append("PENINSULA\n");
                } else if (distDerecha < distIzquierda) {
                    output.append("ISLAS\n");
                } else {
                    // Si los telefonos estan a la misma distancia,
                    // elegir el que este mas cerca de una salida
                    if (izquierda == -1) {
                        output.append("ISLAS\n");
                    } else if (derecha == -1) {
                        output.append("PENINSULA\n");
                    } else {
                        int distTelefonoPeninsula = izquierda;
                        int distTelefonoIslas = tunel.length - 1 - derecha;

                        if (distTelefonoPeninsula <= distTelefonoIslas) {
                            output.append("PENINSULA\n");
                        } else {
                            output.append("ISLAS\n");
                        }
                    }
                }
            }
        }

        System.out.print(output.toString());
    }
}