package POO_Bootcamp.Con_interfaces;

import POO_Bootcamp.Sin_interfaces.Empleado;

public class Main {

    static EmpleadoCRUD empleadoCRUD = new empleadoCRUDMySQL();


    public static void main(String[] args) {

        empleadoCRUD.findAll();
        empleadoCRUD.save(new Empleado());

    }
}
