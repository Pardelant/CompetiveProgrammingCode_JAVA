package aceptaelreto23_24;

import java.util.Scanner;

/* @author Pardelant
 */
public class Reto140 {

    private static boolean calculoResultado(String[] separador) {
        if (separador[0].equals("-")) {
            return true;
        }
        long suma = 0;
        for (int i = 0; i < separador.length; i++) {

            suma = suma + Integer.parseInt(separador[i]);

            System.out.print(separador[i]);

            if (i != separador.length - 1) {
                System.out.print(" + ");
            } else {
                System.out.print(" = " + suma + "\n");
            }

        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {

            if (calculoResultado(in.nextLine().split(""))) {
                break;
            }
        }
    }
}
