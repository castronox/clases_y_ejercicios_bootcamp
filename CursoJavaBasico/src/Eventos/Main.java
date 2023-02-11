package Eventos;
import java.util.ArrayList;

interface Mensajero {
    void hanSaludado();
}
class Receptor implements Mensajero {
    @Override
    public void hanSaludado(){System.out.println(Math.random());}
}

class Emisor {
    private ArrayList<Mensajero> receptores = new ArrayList<>();

    public void meteReceptor(Mensajero receptor)  {

        receptores.add(receptor);
    }
    public void saluda(){
            for (Mensajero ml : receptores){
            ml.hanSaludado();
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Emisor emisor = new Emisor();
        Receptor receptor1 = new Receptor();
        Receptor receptor2 = new Receptor();
        Receptor receptor3 = new Receptor();
        Receptor receptor4 = new Receptor();


        emisor.meteReceptor(receptor1);
        emisor.meteReceptor(receptor2);
        emisor.meteReceptor(receptor3);
        emisor.meteReceptor(receptor4);
        emisor.saluda();
    


    }
}
