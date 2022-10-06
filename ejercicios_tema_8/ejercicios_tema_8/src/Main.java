


public class Main {
    public static void main(String[] args) {
        //Instanciamos la clase. --2
        Persona persona = new Persona();

        //invocamos los setters
        persona.setNombre("Juan");
        persona.setEdad(14);
        persona.setTelefono(543654423);

        //--7 invocamos los getters. --8
        String nombre = persona.getNombre();
        int telefono = persona.getTelefono();
        int edad = persona.getEdad();

        //imprimimos en consola. --9
        System.out.println("Nombre del usuario: " + nombre);
        System.out.println("Edad del usuario: " + edad);
        System.out.println("telefono del usuario: "+ telefono);
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