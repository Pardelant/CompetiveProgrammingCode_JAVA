package aceptaelreto23_24;

import java.io.IOException;
public class Reto529 {
    public static String readString() throws IOException {
        StringBuilder sb = new StringBuilder();
        int c;
        while ((c = System.in.read()) != -1) {
            if (c == '\n' || c == '\r') {
                break;
            }
            sb.append((char) c);
        }
        return sb.toString();
    }
    public static void main(String[] args) throws IOException {
        String caso = readString();
        int casos = Integer.parseInt(caso);
        StringBuilder salida = new StringBuilder();
        String cadena;
        int actual, maximo;
        while (casos-- > 0) {
            cadena = readString();
            actual = 0;
            maximo = 0;
            for (int i = 0; i < cadena.length(); i++) {
                if (cadena.charAt(i) == 'I') {
                    actual++;
                    if (actual > maximo) {
                        maximo = actual;
                    }
                } else if (actual > 0) {
                    actual--;
                } else {
                    maximo++;
                }
            }
            salida.append(maximo).append('\n');
        }
        System.out.print(salida);
    }
}
