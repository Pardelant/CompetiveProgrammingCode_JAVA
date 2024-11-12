package aceptaelreto23_24;/* @author pardelant
 */
import java.io.IOException;
public class Reto438 {
    private static String read() throws IOException {
        int c = System.in.read();
        int exclamaciones = 0;
        int caracteres = 0;
        if (c == -1) {
            return null;
        }
        while (c > 10) {
            if (c == '!') {
                exclamaciones++;
            } else if(Character.isLetter(c)){
                caracteres++;
            }
        }
        if (exclamaciones > caracteres) {
            return "ESGRITO";
        } else {
            return "escrito";
        }
    }
    public static void main(String[] args) throws IOException {
        do{
            read();
        }while(read()!=null);
    }
}
