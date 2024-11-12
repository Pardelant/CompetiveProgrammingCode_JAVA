package aceptaelreto23_24;/* @author pardelant
 */

import java.io.IOException;
public class Reto171 {
    private static int read() throws IOException {
        int res = 0;
        int c = System.in.read();
        do {
            res = res * 10 + c - '0';
        } while ((c = System.in.read()) > 32);
        return res;
    }
    static int getAbadias(int montañas[]) {
        int altura_maxima = montañas[montañas.length - 1];
        int contador = 1;

        for (int i = montañas.length - 2; i > -1; i--) {
            if (altura_maxima < montañas[i]) {
                altura_maxima = montañas[i];
                contador++;
            }
        }
        return contador;
    }
    public static void main(String[] args) throws IOException {
        int cantidad;

        while ((cantidad = read()) != 0) {

            int[] montañas = new int[cantidad];

            for (int i = 0; i < montañas.length; i++) {
                montañas[i] = read();
            }
            System.out.println(getAbadias(montañas));
        }
    }
}
