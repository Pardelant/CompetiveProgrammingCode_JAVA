package aceptaelreto23_24;

import java.io.BufferedOutputStream;
import java.io.IOException;

public class Reto402 {
    private static int read() throws IOException {
        int res = 0;
        int c = System.in.read();
        do {
            res = res * 10 + c - '0';
        } while ((c = System.in.read()) > 32);
        return res;
    }

    private static void calcularLadoMasLargo(int piezas, BufferedOutputStream output) throws IOException {
        int ladoMasLargo = 1;
        int minDiferencia = Integer.MAX_VALUE;
        
        for (int i = 1; i <= piezas / i; i++) {
            if (piezas % i == 0) {
                int otroLado = piezas / i;
                int diferencia = Math.abs(otroLado - i);
                
                if (diferencia < minDiferencia) {
                    minDiferencia = diferencia;
                    ladoMasLargo = Math.max(otroLado, i);
                }
            }
        }
        
        output.write((ladoMasLargo + "\n").getBytes());
    }

    public static void main(String[] args) throws IOException {
        BufferedOutputStream output = new BufferedOutputStream(System.out);
        int piezas;
        while ((piezas = read()) != 0) {
            calcularLadoMasLargo(piezas, output);
        }
        output.flush();
    }
}
