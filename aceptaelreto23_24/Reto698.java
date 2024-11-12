package aceptaelreto23_24;

import java.io.IOException;

public class Reto698 {

    private static int read() throws IOException {
        int res = 0;
        int c = System.in.read();
        do {
            res = res * 10 + c - '0';
        } while ((c = System.in.read()) > 32);
        return res;
    }

    public static void main(String[] args) throws IOException {

        long suma = 0;
        int lado, dato, max = 0;
        int casos = 0;
        final byte[] SI = {'S', 'I', '\n'};
        final byte[] NO = {'N', 'O', '\n'};
        byte[] output = new byte[124000];
        int pos = 0;
        casos = read();
        
        while (casos-- > 0) {
            lado = read();
            lado *= lado;
            suma = 0;
            max = -1;
            
            for (int i = 0; i < lado; i++) {
                dato = read();
                suma += dato;
                if (dato > max) {
                    max = dato;
                }
            }
            if (suma == (max << 1)) {
                System.arraycopy(SI, 0, output, pos, SI.length);
                pos += SI.length;
            } else {
                System.arraycopy(NO, 0, output, pos, NO.length);
                pos += NO.length;
            }
        }
        System.out.write(output, 0, pos);
    }
}