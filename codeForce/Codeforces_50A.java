package codeForce;
import java.util.Scanner;
public class Codeforces_50A {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int m,n,mn, i = 0;
        
        m = in.nextInt();
        n = in.nextInt();
        mn = n*m;
        while (mn > 1) {
            i++;
            mn -=2;
        }
        
        System.out.println(i);
    }
    
}
