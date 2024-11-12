package aceptaelreto23_24;
import java.util.Scanner;
public class Reto446 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int casos;
        String nieto,listanietos;
        
        casos = in.nextInt();
        while (casos-->0) {
            nieto = in.next().trim();
            
            if(in.nextInt() > 1){
            
            listanietos = in.nextLine().trim();
            
            if(nieto.equals(listanietos.endsWith(nieto))){
                System.out.println("VERDADERA");
            }
            }
            System.out.println("FALSA");
            
        }
    }
    
}
