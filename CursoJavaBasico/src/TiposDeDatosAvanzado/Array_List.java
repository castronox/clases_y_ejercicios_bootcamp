package TiposDeDatosAvanzado;
import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<String>();

        lista.add("Elemento_A");
        lista.add("Elemento_B");
        lista.add("Elemento_C");
        lista.add("Elemento_D");

        String array[] = new String[lista.size()];
        for (int i = 0 ; i< lista.size(); i ++){

            array[i]= lista.get(i);
        }
        for (String elemento : array){
            System.out.println("Elemento es: " + elemento);
        }

        System.out.println("Contenido: " + lista);


        for (String nombre:lista) {

            System.out.println("Nombre: "+ nombre);
        }

        for (int i = 0 ; i<lista.size(); i ++) {

            System.out.println(lista.get(i));
        }

        for (Object arrayObjeto : lista.toArray()) {

            System.out.println(arrayObjeto.toString());
        }
    }
}
