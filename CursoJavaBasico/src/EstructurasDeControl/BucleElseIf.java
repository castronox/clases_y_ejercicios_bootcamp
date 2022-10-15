package EstructurasDeControl;

public class BucleElseIf {

    public static void main(String[] args) {

        String dia = "Miercoles";
        boolean resultado = dia.equals("Martes");

        if (dia.equals("Lunes")) {

            System.out.println("Animo con la semana champions");
        } else if (dia.equals("Martes")) {
            System.out.println("Otro martes chustero.");
        } else if (dia.equals("Miercoles")) {
            System.out.println("Otro miercoles salsero.");
        } else if (dia.equals("Jueves")) {
            System.out.println("Juernes mejor dicho.");
        } else if (dia.equals("Viernes")) {
            System.out.println("Es vierne y tu cuerpo lo sabe.");
        } else if (dia.equals("Sabado")) {
            System.out.println("El sabado se sale.");
        } else if (dia.equals("Domingo")) {
            System.out.println("Otro domingo de resaca.");
        } else {
            System.out.println("Introduce un dia valido");
        }
    }
}
