package EjerciciosDeJavaBasico.EjercicioTema4.Herencias;

import EjerciciosDeJavaBasico.EjercicioTema4.ClasePadre.SmartDevice;

public class SmartPhone extends SmartDevice {

    public static String llamadas;

    public static boolean camara_fotos;

    public static String apps;


    public SmartPhone(){}


    public SmartPhone(String fabricante, String modelo, double almacenamiento, int ram,
                      boolean gama_alta_baja, boolean pantalla, String conectividad,
                      String llamadas, boolean camara_fotos, String apps) {

        super(fabricante, modelo, almacenamiento, ram, gama_alta_baja, pantalla, conectividad);

        this.llamadas= llamadas;
        this.camara_fotos = camara_fotos;
        this.apps = apps;
    }
}
