package codeForce;

import java.util.HashMap;
import java.util.Scanner;

public class Codeforces_4C {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int casos = in.nextInt();
        String nombre;
        HashMap<String, Integer> dataBase = new HashMap<>();

        while (casos-- > 0) {
            nombre = in.next();

            if (!dataBase.containsKey(nombre)) {
                
                dataBase.put(nombre, 1);
                System.out.println("OK");
            } else {
                
                int count = dataBase.get(nombre);
                String nuevoNombre = nombre + count; 

                dataBase.put(nombre, count + 1);
                dataBase.put(nuevoNombre, 1);
                
                System.out.println(nuevoNombre);
            }
        }
        in.close();
    }
}

