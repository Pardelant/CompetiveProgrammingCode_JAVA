package aceptaelreto23_24;

import java.util.Scanner;

/* @author pardelant
 */
public class Reto444 {

    private static int calculoPeriodo(int k, int temperaturas[]) {
        int periodoActual = 0;
        int periodoConsecutivoDebajo = 0;
        if (k == 0) {
            for (int i = 0; i < temperaturas.length; i++) {
                if (temperaturas[i] == 1) {
                    periodoActual++;
                } else {
                    periodoConsecutivoDebajo++;
                }
                if (periodoConsecutivoDebajo < k) {
                    periodoActual++;
                }
            }
        }

        return periodoActual;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int mediciones = in.nextInt();
        while (mediciones != 0) {
            int k;
            k = in.nextInt();
            int[] temperaturas = new int[100000];

            for (int i = 0; i < mediciones; i++) {
                temperaturas[i] = in.nextInt();
            }

            System.out.println(calculoPeriodo(k, temperaturas));
        }
    }

}
