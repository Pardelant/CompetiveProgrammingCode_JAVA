package aceptaelreto23_24;

import java.io.IOException;

public class Reto434 {

    private static int read() throws IOException {
        int res = 0;
        int c;

        while ((c = System.in.read()) < '0' || c > '9') {
            if (c == -1) {
                return -1;
            }
        }

        do {
            res = res * 10 + c - '0';
        } while ((c = System.in.read()) >= '0' && c <= '9');

        return res;
    }

    public static void main(String[] args) throws IOException {
        int casos = read();
        int palomas;
        final byte[] ROMANCE = {'R', '0','M','A','N','C','E', '\n'};
        final byte[] PRINCIPIO = {'P', 'R','I','N','C','I','P','I','0', '\n'};
        byte[] output = new byte[128_000];
        int pos = 0;
        while (casos-- > 0) {
            palomas = read();
            if (palomas <= read()) {
                System.arraycopy(ROMANCE, 0, output, pos, ROMANCE.length);
                pos += ROMANCE.length;
            } else {
                System.arraycopy(PRINCIPIO, 0, output, pos, PRINCIPIO.length);
                pos += PRINCIPIO.length;
            }
        }
         System.out.write(output, 0, pos);
    }
}
