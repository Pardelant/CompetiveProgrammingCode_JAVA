package aceptaelreto23_24;/*@Author Pardelant*/

import java.io.IOException;

public class Reto595 {

    private static int read() throws IOException {
        int res = 0;
        int c;
        do {
            c = System.in.read();
            if (c < 0 || c == '\n') break;
            res = res * 10 + (c - '0');
        } while (true);
        return res;
    }

    private static byte[] devolverVector(int n) {
        byte[] salida = new byte[n];
        for (int i = 0; i < n; i++) {
            salida[i] = (byte) (i % 10 + '0');
        }
        return salida;
    }

    public static void main(String[] args) throws IOException {
        byte[] salida;
        byte[] output = new byte[128_000];
        int pos = 0;
        int ncasos = read();
        while (ncasos-- > 0) {
            int numero = read();
            salida = devolverVector(numero / 100);
            System.arraycopy(salida, 0, output, pos, salida.length);
            pos += salida.length;
        }
        System.out.write(output, 0, pos);
        System.out.flush();
    }
}
