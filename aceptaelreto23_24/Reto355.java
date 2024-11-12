package aceptaelreto23_24;

/* @author pardelant
 */
import java.io.IOException;
import java.util.GregorianCalendar;

public class Reto355 {

    private static int read() throws IOException {
        int res = 0;
        int c = System.in.read();
        do {
            res = res * 10 + c - '0';
        } while ((c = System.in.read()) > 32);
        return res;
    }

    public static void main(String[] args) throws IOException {
        GregorianCalendar calendar = new GregorianCalendar();
        int casos = read();
        final byte[] NBISIESTO = {'2', '8', '\n'};
        final byte[] BISIESTO = {'2', '9', '\n'};
        byte[] output = new byte[128_000];
        int pos = 0;
        while (casos-- > 0) {
            int anho = read();
            if (calendar.isLeapYear(anho)) {
                System.arraycopy(BISIESTO, 0, output, pos, BISIESTO.length);
                pos += BISIESTO.length;
            } else {
                System.arraycopy(NBISIESTO, 0, output, pos, NBISIESTO.length);
                pos += NBISIESTO.length;
            }
        }
        System.out.write(output, 0, pos);
    }
}
