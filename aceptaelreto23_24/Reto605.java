package aceptaelreto23_24;

import java.io.IOException;
public class Reto605 {
    public static void main(String[] args) throws IOException {
        int letra;
        final byte[] INVIERNO = {'I', 'N', 'V', 'I', 'E', 'R', 'N', 'O', '\n'};
        final byte[] VERANO = {'V', 'E', 'R', 'A', 'N', 'O', '\n'};
        final byte[] EMPATE = {'E', 'M', 'P', 'A', 'T', 'E', '\n'};
        byte[] output = new byte[128_000];
        int pos = 0;
        while ((letra = System.in.read()) != '.') {
            int contadorV = 0;
            int contadorI = 0;
            do {
                System.in.read(); // Espacio
                if (letra == 'V') {
                    contadorV++;
                } else if (letra == 'I') {
                    contadorI++;
                }
            } while ((letra = System.in.read()) != '.');
            System.in.read();
            if (contadorI > contadorV) {
                System.arraycopy(INVIERNO, 0, output, pos, INVIERNO.length);
                pos += INVIERNO.length;
            } else if (contadorV > contadorI) {
                System.arraycopy(VERANO, 0, output, pos, VERANO.length);
                pos += VERANO.length;
            } else {
                System.arraycopy(EMPATE, 0, output, pos, EMPATE.length);
                pos += EMPATE.length;
            }
        }
        System.out.write(output,0,pos);
    }
}
