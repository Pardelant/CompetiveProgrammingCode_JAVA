package aceptaelreto23_24;

import java.util.Scanner;

public class Reto653 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }

            int[] tiempos = new int[n];
            for (int i = 0; i < n; i++) {
                tiempos[i] = scanner.nextInt();
            }

            int mejorInicio = 0;
            int mejorFin = 1000;
            int mejorTiempo = Integer.MAX_VALUE;

            int tiempoActual = 0;
            for (int i = 0; i < 10; i++) {
                tiempoActual += tiempos[i];
            }

            mejorTiempo = tiempoActual;

            for (int i = 10; i < n; i++) {
                tiempoActual += tiempos[i];
                tiempoActual -= tiempos[i - 10];

                if (tiempoActual <= mejorTiempo) {
                    mejorTiempo = tiempoActual;
                    mejorInicio = (i - 9) * 100;
                    mejorFin = (i + 1) * 100;
                }
            }

            
            int minutos = mejorTiempo / 60;
            int segundos = mejorTiempo % 60;

            // Imprimimos el resultado
            System.out.printf("%d-%d %d:%02d%n", mejorInicio, mejorFin, minutos, segundos);
        }
    }
}
