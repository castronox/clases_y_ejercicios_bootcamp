package POO_Bootcamp.clasesJava;

public class Main {
    public static void main(String[] args) {

        Vehiculo coche = new Vehiculo();


        Vehiculo vehiculo2 = new Vehiculo("Ford","Mondeo",1.6,2002,true,false,0);

        System.out.println ("Fabricante de coche: " + vehiculo2.fabricante +
                            "\n" + "Modelo: " + vehiculo2.modelo +
                            "\n" + "Cubicaje: " + vehiculo2.cubicaje +
                            "\n" + "Año de producción: " + vehiculo2.year +
                            "\n" + "Sport: " + vehiculo2.sport +
                            "\n" + "Traccion 4: " + vehiculo2.traccion4 +
                            "\n" + "Aceleración: " + vehiculo2.velocidad);
                            vehiculo2.velocidad(59);
        System.out.println("Actualización de velocidad: " + vehiculo2.velocidad);
    }
}
