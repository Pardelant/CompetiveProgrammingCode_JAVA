package aceptaelreto23_24;

import java.io.IOException;
public class Reto623 {
    private static int read() throws IOException {
        int res = 0;
        int c = System.in.read();
        do {
            res += c - '0';
        } while ((c = System.in.read()) > 32);
        return res;
    }
    public static void main(String[] args) throws IOException {
        int casos = read();
        int boleto1, boleto2;
        while (casos-- > 0) {
            boleto1 = read();
            boleto2 = read();
            if (boleto1 == boleto2) {
                System.out.println("GANA");   
            } else {
                System.out.println("PIERDE");
            }
        }
    }
}
