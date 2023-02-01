package TiposDeDatosAvanzado;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Mapas {

    public static void main(String[] args) {

        TreeMap<String,Integer> mapa;
        mapa = new TreeMap<>();
        mapa.put("clave1", 10);
        mapa.put("clave2", 20);
        mapa.put("clave3", 30);
        mapa.put("clave4", 40);

        for (Map.Entry elemento : mapa.entrySet() ){

            System.out.println("Elemento clave es: " + elemento.getKey());
            System.out.println("Elemento clave es: " + elemento.getValue() + "\n");
        }


    }
}
