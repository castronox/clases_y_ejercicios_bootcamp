package TiposDeDatosAvanzado;

import java.util.Vector;

public class Vectores {

    public static void main(String[] args) {
        Vector<Integer> vector = new Vector(16);
       vector.add(1);
       vector.add(1);
       vector.add(1);
       vector.add(1);
        System.out.println("capacidad: " + vector.capacity()
        + " tamaño: " + vector.size());

        vector.trimToSize();

        System.out.println("capacidad: " + vector.capacity()
        + " tamaño: " + vector.size());

    }
}
