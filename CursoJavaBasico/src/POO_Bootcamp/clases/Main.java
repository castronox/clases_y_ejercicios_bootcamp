package POO_Bootcamp.clases;

import POO_Bootcamp.herencia.Motocicleta;

public class Main {
    public static void main(String[] args) {


        //Clases y objetos.
        Vehiculo toyotaPrius = new Vehiculo();
        Motor motorGTI = new Motor("GTI", 190,459.0,6);

        Vehiculo fordMondeo = new Vehiculo
                ("Ford","Mondeo",1.6,2002,0,false,true, motorGTI);

        System.out.println ("Fabricante de coche: " + fordMondeo.fabricante +
                            "\n" + "Modelo: " + fordMondeo.modelo +
                            "\n" + "Cubicaje: " + fordMondeo.cubicaje +
                            "\n" + "Año de producción: " + fordMondeo.year +
                            "\n" + "Sport: " + fordMondeo.sport +
                            "\n" + "Traccion 4: " + fordMondeo.traccion4 +
                            "\n" + "Aceleración: " + fordMondeo.velocidad);
        fordMondeo.velocidad(59);
        System.out.println("Actualización de velocidad: " + fordMondeo.velocidad);

        //herencia.
        Motocicleta kawasakiNinja = new Motocicleta();
        kawasakiNinja.fabricante="Kawasaki";
        System.out.println("Fin de programa");

        //Polimorfismo.

        Vehiculo vehiculo;

    }
}
