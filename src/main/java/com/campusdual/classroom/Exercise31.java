package com.campusdual.classroom;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise31 {

    public static void main(String[] args) {
        //Leer txt e imprimir por pantalla
        File file = new File("src/main/resources/lorem.txt");
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
