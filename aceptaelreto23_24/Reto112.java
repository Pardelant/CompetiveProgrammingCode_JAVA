package aceptaelreto23_24;/* @author pardelant
 */

import java.io.IOException;
import java.util.Scanner;
public class Reto112 {

    public static void main(String[] args) throws IOException {

        final byte[] OK = {'O', 'K', '\n'};
        final byte[] PUNTOS = {'P', 'U', 'N', 'T', 'O', 'S', '\n'};
        final byte[] MULTA = {'M', 'U', 'L', 'T', 'A', '\n'};
        final byte[] ERROR = {'E', 'R', 'R', 'O', 'R', '\n'};
        byte[] output = new byte[128000];
        Scanner in = new Scanner(System.in);
        int pos = 0;
        while (true) {
            int longitud = in.nextInt();
            int kmh = in.nextInt();
            int sec = in.nextInt();
            if (longitud == 0 || kmh == 0 || sec == 0) {
                break;
            }
            if (longitud < 0 || kmh < 0 || sec < 0) {
                System.arraycopy(ERROR, 0, output, pos, ERROR.length);
                pos += ERROR.length;
            } else {
                double ms = (kmh * 0.2778);
                double calc = (double) longitud / sec;
                double multa = ms * 1.2;
                double resultado_calculo = ms - calc;
                boolean resultado = resultado_calculo > 0;

                if (!resultado) {
                    if ((multa/calc) > 1.195) {
                        System.arraycopy(MULTA, 0, output, pos, MULTA.length);
                        pos += MULTA.length;
                    } else {System.arraycopy(PUNTOS, 0, output, pos, PUNTOS.length);
                        pos += PUNTOS.length;
                        
                    }
                } else {
                    System.arraycopy(OK, 0, output, pos, OK.length);
                    pos += OK.length;
                }
            }
        }
        System.out.write(output);
    }
}

/*
    private static int read() throws IOException {
        int res = 0;
        int c = System.in.read();
        do {
            res = res * 10 + c - '0';
        } while ((c = System.in.read()) == 10 || (c = System.in.read()) == 32);
        return res;
    }

    public static void main(String[] args) throws IOException {
        final byte[] OK = {'O', 'K', '\n'};
        final byte[] PUNTOS = {'P', 'U', 'N', 'T', 'O', 'S', '\n'};
        final byte[] MULTA = {'M', 'U', 'L', 'T', 'A', '\n'};
        final byte[] ERROR = {'E', 'R', 'R', 'O', 'R', '\n'};
        byte[] output = new byte[128];
        int pos = 0;

        while (true) {
            int longitud = read();
            int kmh = read();
            int sec = read();
            if (longitud < 0 || kmh < 0 || sec < 0) {
                System.arraycopy(ERROR, 0, output, pos, ERROR.length);
                pos += ERROR.length;
            }
            if (longitud == 0 || kmh == 0 || sec == 0) {
                break;
            }
            double resultado;
            double ms = (kmh * 0.2778);
            resultado = ((longitud / sec) - ms);

            if (resultado < 0) {
                if (resultado > (ms * 1.02)) {
                    System.arraycopy(MULTA, 0, output, pos, MULTA.length);
                    pos += MULTA.length;
                } else {
                    System.arraycopy(PUNTOS, 0, output, pos, PUNTOS.length);
                    pos += PUNTOS.length;
                }
            } else {
                System.arraycopy(OK, 0, output, pos, OK.length);
                pos += OK.length;
            }
            System.out.write(output);
        }
    }
}
    
 */
 /*
si el caso es 0 0 0 
con el do while falla

while(true){
if(longitud == 0 && kmh == 0 && sec == 0)
break;
}
 */
