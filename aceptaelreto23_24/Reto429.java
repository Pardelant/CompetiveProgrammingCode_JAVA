package aceptaelreto23_24;

/* @author pardelant
 */
import java.io.IOException;

public class OrganizandoLosHangares {
    public static void main(String[] args) throws IOException {
        StringBuilder output = new StringBuilder();
        int h = readInt();

        while (h != 0) {
            int[] hangares = new int[h];

            // Leer los tamanos de los hangares
            for (int i = 0; i < h; i++) {
                hangares[i] = readInt();
            }

            int n = readInt();
            boolean posible = true;

            // Leer las naves en orden de llegada
            for (int i = 0; i < n; i++) {
                int nave = readInt();
                int mayor = -1;
                int posicion = -1;

                // Buscar el hangar con mas espacio disponible
                for (int j = 0; j < h; j++) {
                    if (hangares[j] > mayor) {
                        mayor = hangares[j];
                        posicion = j;
                    }
                }

                // Comprobar si la nave cabe en el hangar elegido
                if (mayor < nave) {
                    posible = false;
                } else if (posible) {
                    hangares[posicion] -= nave;
                }
            }

            // Guardar el resultado
            if (posible) {
                output.append("SI\n");
            } else {
                output.append("NO\n");
            }

            h = readInt();
        }

        System.out.print(output);
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