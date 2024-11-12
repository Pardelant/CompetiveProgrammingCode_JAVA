package aceptaelreto23_24;/* @author pardelant
 */
import java.util.Scanner;

public class Reto666 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int casos = in.nextInt();
        String frase1;
        String frase2;
        while (casos-- > 0) {
            frase1 = in.nextLine().toLowerCase().replace(" ","").replace(",", "").replace(".", "").replace(";","");
            frase2 = in.nextLine().toLowerCase().replace(" ","").replace(",", "").replace(".", "").replace(";","");
                    
            System.out.println(frase1.equals(frase2)?"SI":"NO");
        }
    }

}
