package aceptaelreto23_24;

import java.io.IOException;
import java.util.ArrayList;

/* @author pardelant
 */
public class Reto104 {

    static ArrayList<Movil> moviles;
    static int posicion;
    static boolean comprobacion;

    private static int readInt() throws IOException {
        int num = 0;
        boolean negativo = false;
        int c;
        while ((c = System.in.read()) < '0') {
            if (c == '-') {
                negativo = true;
            }
        }
        do {
            num = num * 10 + (c - '0');
        } while ((c = System.in.read()) >= '0');

        return negativo ? -num : num;
    }

    private static int recursivo(Movil movil) {

        if (movil.getPeso_izquierdo() == 0) {
            posicion++;
            movil.setPeso_izquierdo(recursivo(moviles.get(posicion)));
        }
        if (movil.getPeso_derecho() == 0) {
            posicion++;
            movil.setPeso_derecho(recursivo(moviles.get(posicion)));
        }

        if (movil.getPeso_izquierdo() * movil.getDistancia_izquierdo() != movil.getPeso_derecho() * movil.getDistancia_derecho()) {
            comprobacion = false;
        }

        return movil.getPeso_izquierdo() + movil.getPeso_derecho();
    }

    public static void main(String[] args) throws IOException {
        final byte[] SI = {'S', 'I', '\n'};
        final byte[] NO = {'N', 'O', '\n'};
        byte[] output = new byte[128_000];
        int pos = 0;
        
        moviles = new ArrayList<>();
        while (true) {
            int pi = readInt();
            int di = readInt();
            int pd = readInt();
            int dd = readInt();
            if (pi == 0 && di == 0 && pd == 0 && dd == 0) {
                break;
            }
            moviles.add(new Movil(pi, di, pd, dd));
        }
        posicion = 0;
        while (posicion < moviles.size()) {
            comprobacion = true;
            recursivo(moviles.get(posicion));
            posicion++;

            if(comprobacion){
                System.arraycopy(SI, 0, output, pos, SI.length);
                pos += SI.length;
            } else {
                System.arraycopy(NO, 0, output, pos, NO.length);
                pos += NO.length;
            }
        }

        System.out.write(output,0,pos);
    }

}

class Movil {

    private int peso_izquierdo;
    private int distancia_izquierdo;
    private int peso_derecho;
    private int distancia_derecho;

    public Movil(int peso_izquierdo, int distancia_izquierdo, int peso_derecho, int distancia_derecho) {
        this.peso_izquierdo = peso_izquierdo;
        this.distancia_izquierdo = distancia_izquierdo;
        this.peso_derecho = peso_derecho;
        this.distancia_derecho = distancia_derecho;
    }

    public int getPeso_izquierdo() {
        return peso_izquierdo;
    }

    public void setPeso_izquierdo(int peso_izquierdo) {
        this.peso_izquierdo = peso_izquierdo;
    }

    public int getDistancia_izquierdo() {
        return distancia_izquierdo;
    }

    public void setDistancia_izquierdo(int distancia_izquierdo) {
        this.distancia_izquierdo = distancia_izquierdo;
    }

    public int getPeso_derecho() {
        return peso_derecho;
    }

    public void setPeso_derecho(int peso_derecho) {
        this.peso_derecho = peso_derecho;
    }

    public int getDistancia_derecho() {
        return distancia_derecho;
    }

    public void setDistancia_derecho(int distancia_derecho) {
        this.distancia_derecho = distancia_derecho;
    }

}
