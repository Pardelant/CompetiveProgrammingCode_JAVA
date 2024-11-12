package aceptaelreto23_24;

import java.io.IOException;

public class Reto313 {

    private static int read() throws IOException {
        int res = 0;
        int c;
        boolean negative = false;

        
        while ((c = System.in.read()) < '0' || c > '9') {
            if (c == '-') {
                negative = true;
            } else if (c == -1) {
                return -1;
            }
        }
        do {
            res = res * 10 + c - '0';
        } while ((c = System.in.read()) >= '0' && c <= '9');
        return negative ? -res : res;
    }
    
    public static void main(String[] args) throws IOException {

        int casos = read();
        int entra, sale;

        StringBuilder output = new StringBuilder();

        while (casos-- > 0) {
            entra = read();
            sale = read();

            if ((entra + sale) >= 0) {
                output.append("SI\n");
            } else {
                output.append("NO\n");
            }
        }
        System.out.print(output.toString());
    }
}