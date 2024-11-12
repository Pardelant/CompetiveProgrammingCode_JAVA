package aceptaelreto23_24;

import java.io.IOException;

public class Reto78 {

    private static int read() throws IOException {
        int res = 0;
        int c;
        while ((c = System.in.read()) >= '0' && c <= '9') {
            res = res * 10 + c - '0';
        }
        return res;
    }

    public static void main(String[] args) throws IOException {

        int casos, n_boletos, cont;

        casos = read();

        while (casos-- > 0) {
            cont = 0;
            n_boletos = read();
            for (int i = 0; i < n_boletos; i++) {
                if (read() % 2 == 0) {
                    cont++;
                }
            }
            System.out.println(cont);
        }
    }
}
