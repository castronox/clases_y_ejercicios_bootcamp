package Operadores_aritmeticos_3_2;

public class Funciones {

    public static void main(String[] args) {

        // opcion 1
        muestraMenu();
        //Opcion 2 --> Fucnción sin parámetros y con tipo de retorno.
        String menu = getMenu();
        System.out.println(menu);
    }


    //Opcion 2 --> Fucnción sin parámetros y con tipo de retorno.




    static void muestraMenu(){

        // opcion 1

        System.out.println("Bienvenidos a la tienda de cristina! --> METODO 1 <--");
        System.out.println("1-prendas");
        System.out.println("2-chaquetas");
        System.out.println("3-bolsos");
    }



    //Opcion 2 Aplicar gets.
    static String getMenu() {
        return "Bienvenidos al e-commerce de cristina ferre atelier --> METODO 2 <-- : \n Prendas \n Chaquetas \n Bolsos";
    }
}
