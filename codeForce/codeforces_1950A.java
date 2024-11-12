package codeForce;

import java.util.Scanner;

public class codeforces_1950A {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int casos = in.nextInt(), a, b, c;

        while (casos-- > 0) {
            a = in.nextInt();
            b = in.nextInt();
            c = in.nextInt();

            if ((a < b) && (b < c)) {
                System.out.println("STAIR");
            } else if ((a < b) && (b > c)) {
                System.out.println("PEAK");
            } else {
                System.out.println("NONE");
            }
        }

    }
}
