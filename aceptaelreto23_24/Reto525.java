package aceptaelreto23_24;

import java.util.Scanner;

/* @author pardelant
 */
public class Reto525 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a, b, c, d;
        int casos = in.nextInt();
        while (casos-- > 0) {

            a = in.nextInt();
            b = in.nextInt();
            c = in.nextInt();
            d = in.nextInt();

           if((Math.min(a,b) == Math.max(c,d) 
                   && 
              (Math.max(a, b) > Math.min(a, b)) 
                   &&
              (Math.max(a, b) > Math.min(b,c))))
            
           {
                    System.out.println("SEPARADOS");
            } else {
                if (Math.min(c, d) < Math.max(a, b)) {
                    System.out.println("SOLAPADOS");
                } else if (a == b && a == c && a == d) {
                    System.out.println("SOLAPADOS");
                } else {
                    System.out.println("SEPARADOS");
                }
            }

        }
    }
}

/*
4
10 20 30 40
40 20 10 30
35 55 70 55
12 41 12 3
*/