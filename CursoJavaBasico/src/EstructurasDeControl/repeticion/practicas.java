package EstructurasDeControl.repeticion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class practicas {
    public static void main(String[] args) {
            // Practica AdventOfCode:  https://adventofcode.com/2021/day/1
            // https://www.youtube.com/watch?v=VoZHz59-sEc&ab_channel=DanielPersson

        try {

            //de aqui extraemos los datos de el archivo.txt que hemos creado.
            BufferedReader br = new BufferedReader(new FileReader("src/EstructurasDeControl/repeticion/input.txt"));

                int contadorIncremento = 0;
                int ultimoNum = -1;
                String line;
                while ((line = br.readLine()) != null) {


                    if (line.isBlank()) continue;
                    int i = Integer.parseInt(line);
                    if (ultimoNum == -1) {
                        ultimoNum = i;
                        continue;
                    }
                    if (i > ultimoNum) {

                        contadorIncremento++;
                    }
                    ultimoNum = i;
                }
                System.out.println(contadorIncremento);
            }catch (Exception e){
                e.printStackTrace();
            }
    }
}
