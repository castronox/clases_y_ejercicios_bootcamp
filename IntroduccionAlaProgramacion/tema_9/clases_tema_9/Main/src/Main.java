public class Main {
    public static void main(String[] args) {
        //CLASE CLIENTE
        Cliente cliente1 = new Cliente();

        //INVOCAMOS LOS SETTERS
        cliente1.setNombre("Juanardo.");
        cliente1.setEdad(32);
        cliente1.setTelefono(65482259);
        cliente1.setCredito(150000);

        //IMPRIMIMOS EN PANTALLA LOS GETTERS
        System.out.println();
        System.out.println("Nombre: " + cliente1.getNombre() + "\nEdad: " + cliente1.getEdad());
        System.out.println();
        System.out.println("Telefono: " + cliente1.getTelefono());

        //IMPRESION EN PANTALLA DE CLASE HIJA.
        System.out.println("Datos dela clase heredada:");
        System.out.println("Credito: " + cliente1.getCredito());



        //CLASE TRABAJADOR
        Trabajador trabajador1 = new Trabajador();

        //INVOCAMOS LOS SETTERS
        trabajador1.setNombre("Camila.");
        trabajador1.setEdad(24);
        trabajador1.setTelefono(65409876);
        trabajador1.setSalario(1500);

        //IMPRIMIMOS EN PANTALLA LOS GETTERS
        System.out.println();
        System.out.println("Nombre: " + trabajador1.getNombre() + "\nEdad: " + trabajador1.getEdad());
        System.out.println();
        System.out.println("Telefono: " + trabajador1.getTelefono());


        //IMPRESION EN PANTALLA DE CLASE HIJA.
        System.out.println("Datos de la clase heredada:");
        System.out.println("Salario: " + trabajador1.getSalario());


    }
}
    //CREACIÓN DE CLASES.
    class Persona {
        int edad;
        int telefono;
        String nombre;

        public Persona() {
            System.out.println("Estoy en la super clase -->PERSONA<--");
        }

        //DECLARAMOS LOS GETTERS.
        public int getEdad() {
            return this.edad;
        }
        public int getTelefono() {
            return this.telefono;
        }
        public String getNombre() {
            return this.nombre;
        }

        //DECLARAMOS LOS SETTERS
        public void setEdad(int edad) {
            this.edad = edad;
        }
        public void setTelefono(int telefono) {
            this.telefono = telefono;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    }



    //CREACIÓN DE HERENCIAS.
    class Cliente extends Persona {
        int credito;
        public Cliente() {
            System.out.println("Estoy en la clase hija -->CLIENTE<--");
        }
        public void setCredito(int credito) {
            this.credito = credito;
        }
        public int getCredito(){
            return this.credito;
        }
    }

    class Trabajador extends Persona {
        int salario;
        public Trabajador() {
            System.out.println("Estoy en la clase hija -->TRABAJADOR<--");
        }
        public void setSalario(int salario) {
            this.salario = salario;
        }
        public int getSalario(){
            return this.salario;
        }
    }
