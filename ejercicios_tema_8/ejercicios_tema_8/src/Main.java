


public class Main {
    public static void main(String[] args) {
        //Instanciamos la clase. --2
        Persona persona = new Persona();

        //--7 invocamos los getters. --7
        String nombre = persona.getNombre();
        int telefono = persona.getTelefono();
        int edad = persona.getEdad();
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