import java.io.IOException;

/* @author Pardelant
 */

public class Reto100 {
    public static void main(String[] args) throws IOException {
        int casos = readInt();
        StringBuilder output = new StringBuilder();

        while (casos-- > 0) {
            int numero = readInt();
            int vueltas = 0;

            // Comprobar si el numero ya es la constante de Kaprekar
            if (numero == 6174) {
                output.append(0).append("\n");
                continue;
            }

            // Comprobar si todos los digitos son iguales
            if (esRepdigit(numero)) {
                output.append(8).append("\n");
                continue;
            }

            // Aplicar la rutina de Kaprekar hasta llegar a 6174
            while (numero != 6174) {
                String cifra = String.format("%04d", numero);
                char[] digitos = cifra.toCharArray();

                // Ordenar los digitos de menor a mayor
                for (int i = 0; i < digitos.length - 1; i++) {
                    for (int j = i + 1; j < digitos.length; j++) {
                        if (digitos[i] > digitos[j]) {
                            char aux = digitos[i];
                            digitos[i] = digitos[j];
                            digitos[j] = aux;
                        }
                    }
                }

                // Formar el numero ascendente
                int menor = Integer.parseInt(new String(digitos));

                // Formar el numero descendente
                StringBuilder sb = new StringBuilder(new String(digitos));
                int mayor = Integer.parseInt(sb.reverse().toString());

                // Restar el menor al mayor
                numero = mayor - menor;
                vueltas++;
            }

            // Guardar el resultado
            output.append(vueltas).append("\n");
        }

        System.out.print(output);
    }

    // Metodo para comprobar si todos los digitos son iguales
    private static boolean esRepdigit(int numero) {
        String cifra = String.format("%04d", numero);

        for (int i = 1; i < cifra.length(); i++) {
            if (cifra.charAt(i) != cifra.charAt(0)) {
                return false;
            }
        }

        return true;
    }

    // Metodo para leer un entero
    private static int readInt() throws IOException {
        int res = 0;
        int c;

        while ((c = System.in.read()) <= 32) {
            if (c == -1) {
                return -1;
            }
        }

        while (c > 32) {
            res = res * 10 + c - '0';
            c = System.in.read();
        }

        return res;
    }
}