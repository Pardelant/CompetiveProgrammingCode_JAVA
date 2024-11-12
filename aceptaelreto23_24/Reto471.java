package aceptaelreto23_24;/* @author pardelant
*///RETO 417
import java.util.Scanner;

public class Reto471 {

    public static int procesarCadena(String cadena) {
        cadena = cadena.toUpperCase();
        if (cadena.length() % 2 == 0) {
            for (int i = 1; i < cadena.length(); i++) {
                if (cadena.charAt(0) == cadena.charAt(i)) {
                    if ((i < ((cadena.length() / 2))) ) {
                        return i;
                    }
                }
            }
        } else {
            for (int i = 1; i < cadena.length(); i++) {
                if (cadena.charAt(0) == cadena.charAt(i)) {
                        return i;
                }
            }
        }
        
        return cadena.length();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String cadena;
            cadena = in.nextLine();
            System.out.println(procesarCadena(cadena));
        }
    }
}
