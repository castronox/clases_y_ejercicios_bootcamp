public class pOrientadaObjetos {

    public static void main(String[] args) {

        Coche coche = new Coche();

        System.out.println("Coche1:");

        System.out.println("velocidad actual: ");
        System.out.println(coche.velocidadActual);

        System.out.println("velocidad Maxima: ");
        System.out.println(coche.velocidadMaxima);

        System.out.println("numero de puertas: ");
        System.out.println(coche.numeroDePuertas);


        Coche coche2 = new Coche(5,120,80 );

        System.out.println("Coche 2:");


        System.out.println("velocidad actual: ");
        System.out.println(coche2.velocidadActual);

        System.out.println("velocidad maxima: ");
        System.out.println(coche2.velocidadMaxima);

        System.out.println("numero de puertas: ");
        System.out.println(coche2.numeroDePuertas);

    }
}





class Coche{

    int numeroDePuertas;
    int velocidadMaxima;
    float velocidadActual;



    public Coche() {
        numeroDePuertas = 5;
        velocidadMaxima = 120;
        System.out.println("Estoy en el constructor ***sin nada***");
    }

    public void acelerar() {
        velocidadActual +=15;
    }
    public void decelerar() {
        velocidadActual -=3;
    }


    public Coche(int puertas, int velocidadMax, int velocidadAct ){

        numeroDePuertas = puertas;
        velocidadMaxima = velocidadMax;
        velocidadActual = velocidadAct;
        System.out.println("Estoy en el constructor CON PARAMETROS.");
    }




}
