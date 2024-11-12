package codeForce;

import java.util.Scanner;

public class Codeforces_282A {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = 0;
        int casos = in.nextInt();  // Leer número de casos
        in.nextLine();  // Consumir el salto de línea después del número

        for (int i = 0; i < casos; i++) {
            String linea = in.nextLine().trim();  // Leer línea y quitar espacios en blanco
            
            if (linea.contains("++")) {
                x++;  // Si la línea contiene "++", incrementar
            } else if (linea.contains("--")) {
                x--;  // Si la línea contiene "--", decrementar
            }
        }

        System.out.println(x);  // Imprimir el valor final de x
    }
}
