package aceptaelreto23_24;

import java.io.IOException;

public class Reto119 {
    
    private static int read() throws IOException {
        int res = 0;
        int c;
        
        while ((c = System.in.read()) < '0' || c > '9') {
            if (c == -1) {
                return -1;
            }
        }

        do {
            res = res * 10 + c - '0';
        } while ((c = System.in.read()) >= '0' && c <= '9');
        
        return res;
    }
    
    public static void main(String[] args) throws IOException {

        int cuadrado;
        int acumulador = 0;

        while (true) {
            int soldados = read();
            if (soldados == 0) {
                break;
            }

            while (soldados > 0) {
                cuadrado = (int) (Math.sqrt(soldados));

                acumulador += cuadrado * cuadrado;
                acumulador += cuadrado * 4;
                soldados -= cuadrado * cuadrado;
            }

            System.out.println(acumulador);
            acumulador = 0;
            cuadrado = 0;

        }
    }
}
