package codeForce;
import java.util.Scanner;
public class CodeForces_279B {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         
        int libros, minutos, leer = 0;
        int [] libro;
        
        libros = in.nextInt();
        minutos = in.nextInt();
        libro = new int [libros];
        
        for (int i = 0; i < libros; i++) {
            libro[i] = in.nextInt();
        }

        for (int i = 0; i < libros; i++) {
            if(minutos >= libro[i]){
            minutos -= libro[i];
            leer++;
            }
        }
        System.out.println(leer);
    }
    
}
