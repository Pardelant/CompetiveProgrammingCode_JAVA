package codeForce;

import java.util.Scanner;

public class Codeforces_72C {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int pares = 0, inpares = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                if (i % 2 == 0) {
                    pares++;
                } else {
                    inpares++;
                }
            }
        }

        if (pares == inpares) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

}
