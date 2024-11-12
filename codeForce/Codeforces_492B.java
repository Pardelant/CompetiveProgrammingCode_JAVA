package codeForce;

import java.util.Arrays;
import java.util.Scanner;

public class Codeforces_492B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int linternas = in.nextInt();
        int longitudCalle = in.nextInt();
        int[] posiciones = new int[linternas];

        for (int i = 0; i < linternas; i++) {
            posiciones[i] = in.nextInt();
        }

        Arrays.sort(posiciones);

        double maxDistancia = Math.max(posiciones[0], longitudCalle - posiciones[linternas - 1]);
        
        // calcula el radio para la distancia
        for (int i = 1; i < linternas; i++) {
            maxDistancia = Math.max(maxDistancia, (posiciones[i] - posiciones[i - 1]) / 2.0);
        }

        System.out.printf("%.10f%n", maxDistancia);
    }
}
