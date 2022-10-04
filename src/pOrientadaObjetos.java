public class pOrientadaObjetos {

    public static void main(String[] args) {

        Coche coche = new Coche();

        System.out.println("Coche1:");
        System.out.println(coche.velocidadActual);

        coche.acelerar();

        System.out.println(coche.velocidadActual);

        coche.decelerar();

        System.out.println(coche.velocidadActual);

        Coche coche2 = new Coche();

        System.out.println("Coche 2:");
        System.out.println(coche2.velocidadActual);
        System.out.println(coche2.velocidadMaxima);

    }
}





class Coche{

    int numeroDePuertas;
    int velocidadMaxima;
    float velocidadActual;

    public Coche(){

        numeroDePuertas = 5;
        velocidadMaxima = 120;
        System.out.println("Estoy en el constructor.");
    }

    public void acelerar() {
        velocidadActual +=15;
    }
    public void decelerar() {
        velocidadActual -=3;
    }


}
