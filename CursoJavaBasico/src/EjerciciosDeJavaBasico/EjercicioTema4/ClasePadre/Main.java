package EjerciciosDeJavaBasico.EjercicioTema4.ClasePadre;

import EjerciciosDeJavaBasico.EjercicioTema4.ClasePadre.SmartDevice;
import EjerciciosDeJavaBasico.EjercicioTema4.Herencias.SmartPhone;
import EjerciciosDeJavaBasico.EjercicioTema4.Herencias.SmartWatch;

public class Main {

    public static void main(String[] args) {

        SmartDevice dell = new SmartDevice("dell","mn-504",252.5,8,true,false,"4g");

      /*  System.out.println("--------------------------------->HARDWARE<--------------------------------------\n" +
                "\nHardware para los dispositivos requeridos desde la clase padre SmartDevice:\n" +
                "Fabricante: " + SmartDevice.fabricante + ".\n" +
                "Modelo: " + SmartDevice.modelo + ".\n" +
                "Almacenamiento: "+ SmartDevice.almacenamiento + ".\n" +
                "Ram: "+ SmartDevice.ram + " GB.\n" +
                "Gama alta o baja: " + SmartDevice.gama_alta_baja + ".\n" +
                "Pantalla: " + SmartDevice.pantalla + ".\n" +
                "Conectividad: " + SmartDevice.conectividad + ".\n" );



       */ SmartPhone samsung = new SmartPhone("Samsung", "s_21 plus", 1.2, 12, true, false," 5g+","A toda europa", true, "Play store");
        /*System.out.println("SmartPhone Propiedades:" + samsung );
        System.out.println( "------------------>SMARTPHONE<-----------------------------\n" +
                "\nAtributos de la clase heredada SmartDevice llamados a la clase hija SmartPhone: " + ".\n" +
                "Fabricante: " + SmartPhone.fabricante + ". \n" +
                "Modelo: " + SmartPhone.modelo  + " .\n" +
                "Almacentamiento: " + SmartPhone.almacenamiento  + " TB .\n" +
                "Ram: " + SmartPhone.ram  + " .\n" +
                "Gama: " + SmartPhone.gama_alta_baja  + " .\n" +
                "Pantalla: " + SmartPhone.pantalla  + " .\n" +
                "Conectividad: " + SmartPhone.conectividad  + " .\n" +
                "\n" +
                "Atributos de la clase hija SmartPhone. \n" +
                "Tipo de llamadas: " + SmartPhone.llamadas  + " .\n" +
                "Camara de fotos: " + SmartPhone.camara_fotos  + " .\n" +
                "Descarga de apps: " + SmartPhone.apps + " .\n"

        );*/

        SmartWatch i_watch = new SmartWatch("Apple","Apple Watch 2",1.1,724,true,false,"Bluethooth 5.0 y NFC",true,true,true);
       /* System.out.println( "------------------>SMARTWATCH<-----------------------------\n" +
                "\nAtributos de la clase heredada SmartDevice llamados a la clase hija SmartWatch: " + ".\n" +
                "Fabricante: " + SmartWatch.fabricante + ". \n" +
                "Modelo: " + SmartWatch.modelo  + " .\n" +
                "Almacentamiento: " +SmartWatch.almacenamiento  + " GB .\n" +
                "Ram: " + SmartWatch.ram  + " mb.\n" +
                "Gama: " + SmartWatch.gama_alta_baja  + " .\n" +
                "Pantalla: " + SmartWatch.pantalla  + " .\n" +
                "Conectividad: " + SmartWatch.conectividad  + " .\n" +
                "\n" +
                "Atributos de la clase hija SmartWatch. \n" +
                "Tipo de llamadas: " + SmartWatch.pulsometro + " .\n" +
                "Camara de fotos: " + SmartWatch.cuentapasos  + " .\n" +
                "Descarga de apps: " + SmartWatch.notificaciones + " .\n"
        );*/

        System.out.println("SmartPhone Propiedades:" + samsung );
        System.out.println("\n" + "SmartWatch Propiedades:" + i_watch);





    }
}
