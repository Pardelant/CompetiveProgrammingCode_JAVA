package aceptaelreto23_24;
import java.util.Scanner;
public class Reto525_abs {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int casos = in.nextInt();
        while (casos-- > 0) {
            int d1i = in.nextInt();
            int d1f = in.nextInt();
            int d2i = in.nextInt();
            int d2f = in.nextInt();
            int calc = (Math.abs(d1i+d1f)) - (Math.abs(d2i+d2f));
            
            
            if(calc<0){
                System.out.println("SEPARADOS");
            } else if(calc == 0){
                System.out.println("SOLAPADOS");
            } else {
                System.out.println("SOLAPADOS");
            }
        }
    }
}