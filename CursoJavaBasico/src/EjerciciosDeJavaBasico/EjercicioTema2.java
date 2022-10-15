package EjerciciosDeJavaBasico;

public class EjercicioTema2 {


    public static void main(String[] args) {
        int precio = 435;

        System.out.println("El precio del producto sin IVA es: "+ precio +" El precio con IVA sería: " + obtenIVA(precio));


    }

    static int obtenIVA(int n1){

        int num1 = n1;
        int iva = 21;
        int div = 100;
        int operacion = num1 / div * iva + num1;


        return operacion;

    }
}
