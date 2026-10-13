import java.io.IOException;

public class Reto427 {
    public static void main(String[] args) throws IOException {
        int d;

        while ((d = readInt()) != -1) {
            int n = readInt();

            int anterior = readInt();
            int inicioCuesta = anterior;
            boolean apta = true;

            // Comprobar las cotas sin almacenarlas
            for (int i = 1; i < n; i++) {
                int actual = readInt();

                if (actual > anterior) {
                    // Comprobar el desnivel de la cuesta
                    if (actual - inicioCuesta > d) {
                        apta = false;
                    }
                } else {
                    // Comienza un nuevo tramo ascendente
                    inicioCuesta = actual;
                }

                anterior = actual;
            }

            // Mostrar el resultado del caso
            if (apta) {
                System.out.println("APTA");
            } else {
                System.out.println("NO APTA");
            }
        }
    }

    // Metodo para leer un entero
    private static int readInt() throws IOException {
        int c;

        do {
            c = System.in.read();
            if (c == -1) {
                return -1;
            }
        } while (c <= 32);

        int res = 0;

        while (c > 32) {
            res = res * 10 + c - '0';
            c = System.in.read();
        }

        return res;
    }
}
