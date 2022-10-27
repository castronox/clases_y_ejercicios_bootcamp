package POO_Bootcamp.herencia;

import POO_Bootcamp.clases.Motor;
import POO_Bootcamp.clases.Vehiculo;

public class Motocicleta extends Vehiculo {

    boolean baul;
    public Motocicleta(){}

    public Motocicleta(String fabricante, String modelo, Double cubicaje, int year, int velocidad, boolean sport, boolean traccion4, Motor motor, boolean baul) {
        super(fabricante, modelo, cubicaje, year, velocidad, sport, traccion4, motor);
        this.baul = baul;
    }
}
