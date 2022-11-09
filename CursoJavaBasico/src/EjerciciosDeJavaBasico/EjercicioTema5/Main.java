package EjerciciosDeJavaBasico.EjercicioTema5;

import java.util.List;

public class Main {

    static CocheCRUDImpl cocheCRUD = new CocheCRUDImpl();

    public static void main(String[] args) {

        cocheCRUD.findAll();
        cocheCRUD.save();
        cocheCRUD.delete();
    }



}
