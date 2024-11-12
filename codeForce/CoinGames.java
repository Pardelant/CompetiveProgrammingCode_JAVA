package codeForce;

import java.util.Scanner;

public class CoinGames {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int casos = in.nextInt();
        int cont = 0;
        while (casos-- > 0) {
            int lanzamientos = in.nextInt();
            String resultados = in.next();

            for (int i = 0; i < resultados.length(); i++) {
                if(resultados.charAt(i) == 'U'){
                    cont++;
                }
            }
            
        }
    }
}
