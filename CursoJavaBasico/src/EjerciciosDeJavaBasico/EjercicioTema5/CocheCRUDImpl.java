package EjerciciosDeJavaBasico.EjercicioTema5;

import java.util.ArrayList;
import java.util.List;

public class CocheCRUDImpl {

    public List<CocheCRUD> findAll() {
        System.out.println("Devuelve array");
        return new ArrayList<>();
    }

    public void save() {
        System.out.println("Guardar");
    }

    public void delete() {
        System.out.println("Borrar");
    }
}
