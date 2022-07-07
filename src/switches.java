import java.util.Scanner;
import java.lang.*;

public class switches{

public static void main(String[] args) {
     int numero1 = 1;
     int numero2 = 2;
     int numero3 = 3;
     int numero4 = 4;
     int numero5 = 5;

    Scanner sc = new Scanner( System.in);
    System.out.println ("Introduce una ESTACIÓN del año:");
    System.out.println("pulsando el 1 se activa el VERANO");
    System.out.println("pulsando el 2 se activa la PRIMAVERA");
    System.out.println("pulsando el 3 se activa el INVIERNO");
    System.out.println("pulsando el 4 se activa el OTOÑO");
    System.out.println("pulsando el 5 se activa el default");
    
    int estacion = sc.nextInt ();
    
    int numeroestacion = estacion ;

    

    switch (numeroestacion){

        case 1:
             System.out.println("La estacion es Verano");
             break;

        case 2:
             System.out.println("La estacion es Primavera");
             break;
        
        case 3:
             System.out.println("La estacion es Invierno");
             break;

        case 4:
             System.out.println("La estacion es Otoño");
             break;

        default : 
            System.out.println("Este es el default, hasta pronto!");
            
    }

}


}