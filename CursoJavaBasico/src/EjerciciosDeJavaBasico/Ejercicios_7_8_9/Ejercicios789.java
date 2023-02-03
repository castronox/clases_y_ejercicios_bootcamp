package EjerciciosDeJavaBasico.Ejercicios_7_8_9;

import java.io.*;
import java.util.*;

public class Ejercicios789 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una cadena: ");

        String cadena = sc.nextLine();

        StringBuilder sb = new StringBuilder(cadena);
        String cR= sb.reverse().toString();

        System.out.println("La cadena al revés es: " + cR);
        System.out.println("\nFIN EJERCICIO");

        System.out.println("\n");
        System.out.println("\n1-Array unidimensional de String");
        System.out.println("\n");


        String[] arr = {"cadena 1", "cadena 2", "cadena 3"};
        for (String valor : arr) {
            System.out.println(valor);
        }


        System.out.println("\nFIN EJERCICIO------1");

        System.out.println("\n");
        System.out.println("\n2-Crea un array bidimensional de enteros");
        System.out.println("\n");


        int[][] arr1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.println("Posición [" + i + "][" + j + "]: " + arr1[i][j]);
            }
        }
        System.out.println("\nFIN EJERCICIO--------2");



        System.out.println("\n");
        System.out.println("\n3------ Vectores--------");
        System.out.println("\n");

        Vector<Integer> vec = new Vector<>();
        vec.add(1);
        vec.add(2);
        vec.add(3);
        vec.add(4);
        vec.add(5);
        System.out.println("Vector original: " + vec);
        vec.remove(1);
        vec.remove(1);
        System.out.println("Vector final: " + vec);

        System.out.println("\nFIN EJERCICIO-------3");

        System.out.println("\n");
        System.out.println("\n4------ Cuestión de vectores con capacidad por defecto--------");
        System.out.println("\n");

        System.out.println("\n4-cuál es el problema de utilizar un Vector con la\n" +
                    " capacidad por\n defecto si tuviésemos 1000 elementos para ser añadidos al mismo.");
        System.out.println("\n");


        System.out.println("El problema de utilizar un vector con la capacidad por defecto\n" +
                    "es que este no se puede modificar el tamaño, y por ende,\nse gastan muchos recursos en duplicar los datos y" +
                    "\nvolver a construir otro vector");

        System.out.println("\nFIN EJERCICIO---------4");


        System.out.println("\n");
        System.out.println("\n5-----Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList." +
                "\nRecorre ambos mostrando únicamente el valor de cada elemento. --------");
        System.out.println("\n");

        // Creación de un ArrayList con 4 elementos
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Elemento 1");
        arrayList.add("Elemento 2");
        arrayList.add("Elemento 3");
        arrayList.add("Elemento 4");

        // Copiado del ArrayList en una LinkedList
        LinkedList<String> linkedList = new LinkedList<>(arrayList);

        // Recorrido del ArrayList
        System.out.println("ArrayList:\n ");
        for (String element : arrayList) {
            System.out.println(element);
        }

        // Recorrido de la LinkedList
        System.out.println("\nLinkedList:\n ");
        for (String element : linkedList) {
            System.out.println(element);
        }

        System.out.println("\nFIN EJERCICIO---------5");


        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        System.out.println("\n6----crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos,\n" +
                "siempre y cuando cumplas el primer \"for\" de relleno.---");

        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            int n = it.next();
            if (n % 2 == 0) {
                it.remove();
            }
        }

        System.out.println("ArrayList final: " + numbers);

        System.out.println("\nFIN EJERCICIO---------6");

        System.out.println("\n7-----Crea una función DividePorCero. Esta, debe generar una excepción (\"throws\") a su llamante del tipo ArithmeticException que será capturada por su llamante (desde \"main\", por ejemplo). Si se dispara la excepción, mostraremos el mensaje \"Esto no puede hacerse\"." +
                "\nFinalmente, mostraremos en cualquier caso: \"Demo de código\".------");

        try {
            DividePorCero();
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de código");
        }
        System.out.println("\nFIN EJERCICIO---------7");



        }
    public class CopyFile {
        public static void copyFile(String fileIn, String fileOut) throws IOException {
            InputStream inputStream = null;
            PrintStream printStream = null;
            try {
                inputStream = new FileInputStream(fileIn);
                printStream = new PrintStream(new FileOutputStream(fileOut));
                int data;
                while ((data = inputStream.read()) != -1) {
                    printStream.write(data);
                }
            } finally {
                if (inputStream != null) {
                    inputStream.close();
                }
                if (printStream != null) {
                    printStream.close();
                }
            }
        }
    }

    public static void DividePorCero() throws ArithmeticException {
        int num1 = 10;
        int num2 = 0;
        int result = num1 / num2;
    }

    }

