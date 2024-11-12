package aceptaelreto23_24;/* @author pardelant
 */
import java.io.IOException;
public class Reto300 {
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
        final byte[] SI = {'S', 'I', '\n'};
        final byte[] NO = {'N', 'O', '\n'};
        byte[] output = new byte[128_000];
        int pos = 0;
        String caso = readString();
        int casos = Integer.parseInt(caso);
        while (casos-- > 0) {
            String cadenas = readString();
            boolean a = false, e = false, i = false, o = false, u = false;
            for (int j = 0; j < cadenas.length(); j++) {
                switch (cadenas.charAt(j)) {
                    case 'a':
                        a = true;
                        break;
                    case 'e':
                        e = true;
                        break;
                    case 'i':
                        i = true;
                        break;
                    case 'o':
                        o = true;
                        break;
                    case 'u':
                        u = true;
                        break;
                }
            }
            if (a && e && i && o && u) {
                System.arraycopy(SI, 0, output, pos, SI.length);
                pos += SI.length;
            } else {
                System.arraycopy(NO, 0, output, pos, NO.length);
                pos += NO.length;
            }
        }
        System.out.write(output, 0, pos);
    }
}
