package aceptaelreto23_24;

import java.util.Scanner;

public class Reto105 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String resultadoDomingo = "";
        String[] semana = {"MARTES", "MIERCOLES", "JUEVES", "VIERNES", "SABADO", "DOMINGO"};
        float min = Integer.MAX_VALUE, max = 0, acumulador = 0, entrada;
        int i = 0, diaMax = 0, diaMin = 0;

        while (true) {
            entrada = in.nextFloat();
            if (entrada < 0) {
                break;
            }
            
            acumulador += entrada;
            if (entrada < min) {
                min = entrada;
                diaMin = i;
            }

            if (entrada > max) {
                max = i;
            }

            if (i > 5) {
                if ((acumulador / 6) > entrada) {
                resultadoDomingo = "SI";
                } else {
                resultadoDomingo = "NO";
                }
            }
        }
        System.out.println(semana[diaMin] + semana[diaMax] + resultadoDomingo);
    }
}
