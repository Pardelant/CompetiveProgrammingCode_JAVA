package aceptaelreto23_24;

import java.io.IOException;

public class Reto600 {
    static final int MAYOR = 300;
    static final int MENOR = 301;
    
    static void leer(int[][] m, int f, int c) throws IOException{
        m[0][0] = readInt();
        m[0][MAYOR] = m[0][MENOR] = m[MAYOR][0] = m[MENOR][0] = m[0][0];
          
        for (int col = 1; col < c; col++) {
            m[0][col] = readInt();
            if (m[0][col] > m[0][MAYOR])
                m[0][MAYOR] = m[0][col];
            if (m[0][col] < m[0][MENOR])
                m[0][MENOR] = m[0][col];
            m[MAYOR][col] = m[0][col];
            m[MENOR][col] = m[0][col];
        }
        
        for (int fila = 1; fila < f; fila++) {
            m[fila][0] = readInt();
            m[fila][MAYOR] = m[fila][0];
            m[fila][MENOR] = m[fila][0];
            if (m[fila][0] > m[MAYOR][0])
                m[MAYOR][0] = m[fila][0];
            if (m[fila][0] < m[MENOR][0])
                m[MENOR][0] = m[fila][0];
            
            for (int col = 1; col < c; col++) {
                m[fila][col] = readInt();
                if (m[fila][col] > m[fila][MAYOR])
                    m[fila][MAYOR] = m[fila][col];
                if (m[fila][col] < m[fila][MENOR])
                    m[fila][MENOR] = m[fila][col];
                if (m[fila][col] > m[MAYOR][col])
                    m[MAYOR][col] = m[fila][col];
                if (m[fila][col] < m[MENOR][col])
                    m[MENOR][col] = m[fila][col];
            }
        }
    }
    
    static boolean esPuntoDeSilla(int[][] m, int f, int c){
        return m[f][c] == m[f][MAYOR] && m[f][c] == m[MENOR][c]
               ||
               m[f][c] == m[f][MENOR] && m[f][c] == m[MAYOR][c];
    }
    
    static boolean tienePuntosDeSilla(int[][] m, int f, int c) {
        for (int fila = 0; fila < f; fila++) 
            for (int col = 0; col < c; col++) 
                if (esPuntoDeSilla(m, fila, col))
                    return true;
            
        return false;
    }
    
    private static int readInt() throws IOException {
        int res = 0;
        int c;
        while ((c = System.in.read()) != ' ' && c != '\n') {
            res = res * 10 + c - '0';
        }
        return res;
    }
    
    public static void main(String[] args) throws IOException {
        int f, c;
        int[][] m = new int[302][302];
        
        while ((f = readInt()) != 0){
            c = readInt();
            
            leer(m, f, c);

            if (tienePuntosDeSilla(m, f, c))
                System.out.println("SI");
            else
                System.out.println("NO");
        }
    }
}