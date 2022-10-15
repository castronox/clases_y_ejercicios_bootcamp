package EstructurasDeControl.repeticion;

import java.util.Scanner;

public class bucleFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Di un numero: ");
        int num = sc.nextInt();
        System.out.println("HAS DICHO: " + num);

        for(int i = 0; i<= num; i++){
            System.out.println("El valor de i es: " + i);
        }
    }
}
