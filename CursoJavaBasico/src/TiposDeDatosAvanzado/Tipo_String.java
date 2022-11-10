package TiposDeDatosAvanzado;

public class Tipo_String {


    public static void main(String[] args) {

      //Las estructuras en .length sirven para contar la cantidad de caractere en una cadena de texto.

      String cadena_Texto = "Texto de Prueba";
      int cadenaLength = cadena_Texto.length();
      System.out.println("Longitud de cadena: " + cadenaLength);


      //Las estructuras en .toUpperCase Pone en mayuscula todas las letras.

      String cadena_Mayus = "Texto de Prueba";
      String mayus = cadena_Mayus.toUpperCase();
      System.out.println("Cadena en mayus: " + mayus);


      //Para poner la cadena en minuscula.

      String cadena_Minus = "Texto de Prueba";
      String minus = cadena_Minus.toLowerCase();
      System.out.println("Cadena en minus: " + minus);

      //Invertir cadena de caracteres.

      String cadena_a_invertir = "Hola Amigo";
      StringBuilder stringBuilder = new StringBuilder(cadena_a_invertir);
      String invertida = stringBuilder.reverse().toString();
      System.out.println("Cadena invertida: " + invertida);


      //Buscar cadenas de texto que empiecen con los mismos caracteres al principio.

      String cadena = "Texto de Prueba";
      boolean resultado = cadena_Mayus.startsWith("Men");
      if (resultado) {
        System.out.println("El mensaje coincide con las letras");
      } else {
        System.out.println("El mensaje NO coincide con las letras");
      }

      //Escribir letras en un array. recorriendolo con bucle for.

      String cadena_array = "Mensaje de Texto.";
      for (int i = 0; i < cadena_array.length(); i++) {
        System.out.println("Caracter actual: " + cadena_array.charAt(i));
      }
    }
}
