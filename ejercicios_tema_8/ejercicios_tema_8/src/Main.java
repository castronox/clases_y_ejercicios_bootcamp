


public class Main {

    public static void main(String[] args) {
        //Instanciamos la clase. --2

        Persona persona = new Persona();


        //invocamos las propiedades asignadas a una variable. --3
        persona.nombre = "Andres";
        persona.edad = 14;
        persona.telefono = 556543534;


        //imprimimos en pantalla concatenando la impresión en consola. --4
        System.out.println("Nombre del usuario: " + persona.nombre);
        System.out.println("Edad del usuario: " + persona.edad);
        System.out.println("Telefono del usuario: " + persona.telefono);


    }
}

//Creamos la clase. --1
class Persona {


    //Construimos los setters. --5
    private String nombre;
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    private int edad;
    public void setEdad(int edad){
        this.edad = edad;
    }


    private int telefono;
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }



}