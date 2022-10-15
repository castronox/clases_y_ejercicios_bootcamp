package EstructurasDeControl;
import java.util.Scanner;

public class bucle_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una edad.");
        int edad = sc.nextInt();
        if (edad >= 18) {
            System.out.println("Es mayor de edad.");
        } else {
            System.out.println("Es menor de edad");
        }
    }
}
