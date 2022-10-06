


public class Main {
    public static void main(String[] args) {
        //Instanciamos la clase persona 1. --2
        Persona persona1 = new Persona();
        //invocamos los setters persona 1
        persona1.setNombre("Juan");
        persona1.setEdad(14);
        persona1.setTelefono(543654423);
        //--7 invocamos los getters. --8
        String nombre = persona1.getNombre();
        int telefono = persona1.getTelefono();
        int edad = persona1.getEdad();

        //Instanciamos la clase persona 2. --3
        Persona persona2 = new Persona();
        //invocamos los setters persona 2
        persona2.setNombre("sofia");
        persona2.setEdad(19);
        persona2.setTelefono(54657423);
        //--7 invocamos los getters. --8
        String nombre2 = persona2.getNombre();
        int telefono2 = persona2.getTelefono();
        int edad2 = persona2.getEdad();




        //imprimimos en consola. --9
        System.out.println();
        System.out.println("Nombre del usuario: " + nombre);
        System.out.println("Edad del usuario: " + edad);
        System.out.println("telefono del usuario: "+ telefono);
        System.out.println();
        System.out.println("Nombre del usuario: " + nombre2);
        System.out.println("Edad del usuario: " + edad2);
        System.out.println("telefono del usuario: "+ telefono2);
        System.out.println();
        System.out.println("Final ejercicio.");
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

    //Construimos los getters. --6
    public String getNombre(){
        return this.nombre;
    }
    public int getEdad(){
        return  this.edad;
    }
    public int getTelefono(){
        return this.telefono;
    }
}