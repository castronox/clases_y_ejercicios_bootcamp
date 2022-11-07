package EjerciciosDeJavaBasico.EjercicioTema4.ClasePadre;

public class SmartDevice {

    public  String fabricante;
    public  String modelo;
    public  static Double almacenamiento;
    public  static int ram;
    public  static boolean gama_alta_baja;  // true gama alta.
    public  static boolean pantalla;  //AMOLED true, superAMOLED false.
    public  static String conectividad;


    //Constructor
    public SmartDevice(){}

    //Sobrecarga

    public SmartDevice(String fabricante, String modelo, double almacenamiento, int ram,
                       boolean gama_alta_baja, boolean pantalla, String conectividad) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.almacenamiento = almacenamiento;
        this.ram = ram;
        this.gama_alta_baja = gama_alta_baja;
        this.pantalla = pantalla;
        this.conectividad = conectividad;

    }

}
