package aceptaelreto23_24;

/* @author pardelant
 */
import java.util.Arrays;
import java.util.Scanner;
public class Reto429 {
      
    static boolean hayEspacio(int[] hangares, int[] naves, int numNaves, int numHangares) {
        Arrays.sort(hangares);

        for (int i = 0; i < naves.length; i++) {

            if (hangares[hangares.length - 1] < naves[i]) {
                return false;
            } else {
                hangares[hangares.length - 1] -= naves[i];
            }

        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] hangares, naves;
        int numHangares, numNaves;
        while ((numHangares = in.nextInt()) != 0) {
            hangares = new int[numHangares];
            numNaves = in.nextInt();
            naves = new int[numNaves];
            for (int i = 0; i < numHangares; i++) {
                hangares[i] = in.nextInt();
            }
            for (int i = 0; i < numNaves; i++) {
                naves[i] = in.nextInt();
            }
            System.out.println(hayEspacio(hangares, naves, numNaves, numHangares) ? "SI" : "NO");
        }
    }
}