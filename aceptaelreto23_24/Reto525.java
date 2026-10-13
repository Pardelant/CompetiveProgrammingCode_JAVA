package aceptaelreto23_24;
import java.io.IOException;

/* @author pardelant
 */
public class Reto525 {

    public static void main(String[] args) throws IOException {
        int casos = readInt();
        StringBuilder output = new StringBuilder();

        while (casos-- > 0) {
            int a = readInt();
            int b = readInt();
            int c = readInt();
            int d = readInt();

            // Obtener los extremos de cada tramo
            int inicio1 = Math.min(a, b);
            int fin1 = Math.max(a, b);

            int inicio2 = Math.min(c, d);
            int fin2 = Math.max(c, d);

            // Comprobar si los tramos se solapan
            if (Math.max(inicio1, inicio2) < Math.min(fin1, fin2)) {
                output.append("SOLAPADOS\n");
            } else {
                output.append("SEPARADOS\n");
            }
        }

        System.out.print(output);
    }

    // Metodo para leer un entero
    private static int readInt() throws IOException {
        int res = 0;
        int c;

        while ((c = System.in.read()) <= 32) {
            if (c == -1) {
                return -1;
            }
        }

        while (c > 32) {
            res = res * 10 + c - '0';
            c = System.in.read();
        }

        return res;
    }
}
/*
4
10 20 30 40
40 20 10 30
35 55 70 55
12 41 12 3
*/