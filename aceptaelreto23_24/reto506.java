package aceptaelreto23_24;
/* @author pardelant
 */
import java.io.IOException;
public class reto506 {
    public static void main(String[] args) throws IOException {
        int num = System.in.read() - '0';
        while (num-- > 0) {
            int primera = System.in.read() - '0';
            System.in.read(); //Para leer la barra
            int segunda = System.in.read() - '0';
            boolean resultado = primera >= segunda;
            System.out.println(resultado?"BIEN":"MAL");
        }
    }
}