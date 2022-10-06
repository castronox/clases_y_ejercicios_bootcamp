import java.util.Scanner;

public class bucle_if {

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.println ( "Introduce un numero Positivo o negativo:");

        int numerolf = sc.nextInt ();

        if (numerolf == 0 )
        {
            System.out.println("El numero que has puesto es Neutro.");
        }else if(numerolf < 0){
            System.out.println("El numero que has puesto es Negativo.");
        }else{
            System.out.println("El numero que has puesto es Positivo.");
        }
}
    }
