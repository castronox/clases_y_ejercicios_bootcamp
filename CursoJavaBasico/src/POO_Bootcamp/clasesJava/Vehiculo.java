package POO_Bootcamp.clasesJava;

public class Vehiculo {

    //Atributos.

    String fabricante;
    String modelo;
    Double cubicaje;
    int year;
    int velocidad;
    boolean sport;
    boolean traccion4;

    Motor motor;


    //Constructores.

    public Vehiculo(){
    }

    //Sobrecarga

    public Vehiculo(String fabricante, String modelo, Double cubicaje, int year, int velocidad, boolean sport, boolean traccion4, Motor motor) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cubicaje = cubicaje;
        this.year = year;
        this.velocidad = velocidad;
        this.sport = sport;
        this.traccion4 = traccion4;
        this.motor = motor;
    }


    // Métodos , ( Comportamiento ).
    public void velocidad(int kmh) {
        this.velocidad += kmh;
    }

    }





