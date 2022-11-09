package POO_Bootcamp.Sin_interfaces;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        EmpleadoCRUDV1 empleadoCRUDV1 = new EmpleadoCRUDV1();

        Empleado juan = new Empleado("Juanito",30,40000,true);
        Empleado eva = new Empleado("Eva",30,40000,true);
        Empleado alex = new Empleado("Alex",30,40000,true);

        System.out.println(juan);

        empleadoCRUDV1.save(juan);
        empleadoCRUDV1.save(eva);
        empleadoCRUDV1.save(alex);

        List<Empleado> empleados = empleadoCRUDV1.findAll();
        System.out.println(empleados);

    }
}
