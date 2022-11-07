package EjerciciosDeJavaBasico.EjercicioTema4.Herencias;

import EjerciciosDeJavaBasico.EjercicioTema4.ClasePadre.SmartDevice;

public class SmartWatch extends SmartDevice {

    public boolean pulsometro;
    public boolean cuentapasos;
    public boolean notificaciones;

    public SmartWatch(){}


    public SmartWatch(String fabricante, String modelo, double almacenamiento, int ram, boolean gama_alta_baja, boolean pantalla, String conectividad, boolean pulsometro, boolean cuentapasos, boolean notificaciones) {
        super(fabricante, modelo, almacenamiento, ram, gama_alta_baja, pantalla, conectividad);
        this.pulsometro = pulsometro;
        this.cuentapasos = cuentapasos;
        this.notificaciones = notificaciones;
    }
    @Override
    public String toString(){

        return " Marca: " + fabricante +
                ". Modelo: " + modelo +
                ". Almacenamiento: " + almacenamiento +
                ". Ram: " + ram +
                ". Gama: " + gama_alta_baja +
                ". Pantalla: " + pantalla +
                ". Conectividad: " + conectividad +
                ". Pulsometro: " + pulsometro +
                ". Cuentapasos: " + cuentapasos +
                ". Notificaciones: " + notificaciones;

    }
}
