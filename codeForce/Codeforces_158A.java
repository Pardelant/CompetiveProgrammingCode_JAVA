package codeForce;

import java.util.Scanner;

public class Codeforces_158A {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, k, output = 0;

        n = in.nextInt();
        k = in.nextInt();
        while (n-- > 0) {
            if (in.nextInt() > k) {
                output++;
            }
        }
        System.out.println(output);
    }

}
