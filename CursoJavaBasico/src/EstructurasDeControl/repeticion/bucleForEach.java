package EstructurasDeControl.repeticion;

public class bucleForEach {
    public static void main(String[] args) {

        String[] nombres = {"Pepe","Armando","Maradona","Diego"};



        for(String nombre : nombres){
            System.out.println(nombre);
        }

        int[] numeros = {5, 40 ,54 ,68};

        int suma= 0 ;
        for (int numero:numeros){
            suma += numero;
            System.out.println(numero);
        }
        System.out.println("La suma de estos numeros es: " + suma);


    }

}

