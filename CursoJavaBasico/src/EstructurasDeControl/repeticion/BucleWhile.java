package EstructurasDeControl.repeticion;
//Crear un bucle que permita concatenar textos y imprima de resultado por consola.
//Concatenar nombres
//Los textos pueden venir de un array String;
//String[] nombres = {" ", " ", " ", " "};
public class BucleWhile {
    public static void main(String[] args) {

        int contador = 0;

        while(contador < 10){


            contador++;

            if (contador == 5){
                break;
            }
            System.out.println("Valor de contador " + contador);

        }

    }
}
