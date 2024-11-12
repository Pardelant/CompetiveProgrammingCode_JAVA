package aceptaelreto23_24;
/* @author pardelant
 */
import java.io.IOException;
public class reto117 {
    public static void main(String[] args) throws IOException {
        int num = 0;
        int c;
        while ((c = System.in.read()) != ' ' && c != '\n' && c != '\r') {
            num = num * 10 + (c - '0');
        }
        for (int i = 0; i < num; i++) {
            System.out.write("Hola, ".getBytes());
            while ((c = System.in.read()) != '\n' && c != '\r') {
                System.out.write(c);
            }
            System.out.write(".\n".getBytes());
        }
    }
}