package EjerciciosDeJavaBasico.Ejercicios_7_8_9;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

import java.io.*;
import java.util.*;

public class Programa {
    public static void main(String[] args) {
        try {
            // Crea un InputStream para leer el archivo de texto
            InputStream fileIn = new FileInputStream("C:\\Users\\Cristian Castro\\Desktop\\programación\\espaciobootcamp\\CursoJavaBasico\\src\\EjerciciosDeJavaBasico\\Ejercicios_7_8_9\\texto.txt");
            Scanner sc = new Scanner(fileIn);

            // Crea un HashMap para almacenar las palabras y su número de apariciones en el archivo
            HashMap<String, Integer> conteoPalabras = new HashMap<>();

            // Lee el archivo y almacena las palabras en el HashMap
            while (sc.hasNext()) {
                String palabra = sc.next();
                if (conteoPalabras.containsKey(palabra)) {
                    int numApariciones = conteoPalabras.get(palabra);
                    conteoPalabras.put(palabra, numApariciones + 1);
                } else {
                    conteoPalabras.put(palabra, 1);
                }
            }

            // Cierra el archivo
            sc.close();
            fileIn.close();

            // Crea una LinkedList para almacenar las palabras únicas
            LinkedList<String> palabrasUnicas = new LinkedList<>(conteoPalabras.keySet());

            // Ordena la lista de palabras únicas en orden alfabético
            Collections.sort(palabrasUnicas);

            // Muestra la lista de palabras únicas
            for (String palabra : palabrasUnicas) {
                System.out.println(palabra);
            }
        } catch (FileNotFoundException e) {
            System.out.println("No se pudo encontrar el archivo de texto");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al cerrar el archivo de texto");
        } catch (Exception e) {
            System.out.println("Ocurrió un error inesperado");
        }
    }
}