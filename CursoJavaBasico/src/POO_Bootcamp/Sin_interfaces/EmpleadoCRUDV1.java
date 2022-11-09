package POO_Bootcamp.Sin_interfaces;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoCRUDV1 {

    //Estructura de datos.
    List<Empleado> empleados = new ArrayList<>();

    //Operaciones CRUD


    //CREATE guardar empleados.
    public void save(Empleado empleado){empleados.add(empleado);}


    public List<Empleado> findAll(){
        return empleados;
    }
}
