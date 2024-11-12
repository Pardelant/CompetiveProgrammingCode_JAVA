package aceptaelreto23_24;

import java.util.Scanner;

public class Reto488 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int casos, x, minutosDormir, res = 0, entrada, camino = 0;

        casos = in.nextInt();
        while (casos-- > 0) {
            x = in.nextInt();
            minutosDormir = in.nextInt();

            camino = x * minutosDormir;

            if (x > 1) {
                for (int i = 0; i <= x - 2; i++) {
                    in.nextInt();
                }
            }
            
            entrada = in.nextInt();
            if (camino > entrada) {
                System.out.println(x - 1);
            } else {
                System.out.println(x);
            }

        }

    }

}
